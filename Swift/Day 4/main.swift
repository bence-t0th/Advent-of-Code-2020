//
//  main.swift
//  Day 4
//
//  Created by Bence Tóth on 2020. 12. 04..
//

import Foundation

struct Passport {
    
    let requiredFields: Set = ["byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid"]
    
    let fields: [String : String]
    
    init(_ str: String) {
        fields = str.components(separatedBy: .whitespacesAndNewlines)
            .reduce(into: [String : String]()) { pass, data in
                let field = data.components(separatedBy: ":")
                pass[field[0]] = field[1]
            }
    }
    
    func hasFields() -> Bool {
        return requiredFields.isSubset(of: fields.keys)
    }
    
    func birthYear(_ str: String) -> Bool {
        guard let year = Int(str) else { return false }
        return year >= 1920 && year <= 2002
    }
    
    func validYear(_ str: String) -> Bool {
        guard let year = Int(str) else { return false }
        return year >= 2010 && year <= 2020
    }
    
    func expiryYear(_ str: String) -> Bool {
        guard let year = Int(str) else { return false }
        return year >= 2020 && year <= 2030
    }
    
    func height(_ str: String) -> Bool {
        if str.hasSuffix("cm") {
            guard let cm = Int(str.dropLast(2)) else { return false }
            return cm >= 150 && cm <= 193
        } else if str.hasSuffix("in") {
            guard let inches = Int(str.dropLast(2)) else { return false }
            return inches >= 59 && inches <= 76
        } else {
            return false
        }
    }
    
    func hairColor(_ str: String) -> Bool {
        let regex = try! NSRegularExpression(pattern: "#[0-9a-f]{6}")
        return regex.matches(in: str, range:  NSRange(location: 0, length: str.utf16.count)).count == 1
    }
    
    func eyeColor(_ str: String) -> Bool {
        return ["amb", "blu", "brn", "gry", "grn", "hzl", "oth"].contains(str)
    }
    
    func passportId(_ str: String) -> Bool {
        return str.count == 9 && Int(str) != nil
    }
    
    func isValid() -> Bool {
        return hasFields() && fields.allSatisfy {
            switch $0.key {
            
            case "byr":
                return birthYear($0.value)
            
            case "iyr":
                return validYear($0.value)
            
            case "eyr":
                return expiryYear($0.value)
            
            case "hgt":
                return height($0.value)
           
            case "hcl":
                return hairColor($0.value)
            
            case "ecl":
                return eyeColor($0.value)
            
            case "pid":
                return passportId($0.value)
            
            case "cid":
                return true
            
            default:
                return false
            }
        }
    }
}

func part1(_ passports: [Passport]) -> Int {
    let start = CFAbsoluteTimeGetCurrent()
    
    var res = 0
    for passport in 0..<passports.count {
        if passports[passport].hasFields() {
            res += 1
        }
    }
    
    let dur = CFAbsoluteTimeGetCurrent() - start
    print("Part 1: \(dur * 1000) ms")
    
    return res
}

func part2(_ passports: [Passport]) -> Int {
    let start = CFAbsoluteTimeGetCurrent()
    
    var res = 0
    for passport in 0..<passports.count {
        if passports[passport].isValid() {
            res += 1
        }
    }
    
    let dur = CFAbsoluteTimeGetCurrent() - start
    print("Part 2: \(dur * 1000) ms")
    
    return res
}

print(part1(InputManager.input))
print(part2(InputManager.input))
