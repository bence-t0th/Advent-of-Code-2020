//
//  main.swift
//  Day 7
//
//  Created by Bence Tóth on 2020. 12. 07..
//

import Foundation

class Bag: Hashable, Equatable {
    
    let color: String
 //   let bags: [(color: String, num: Int)]?
    let bags: [String]

    init(_ input: String) {
        let rule = input.components(separatedBy: " bags contain ")
        self.color = rule[0]

        if (rule[1] == "no other bags.") {
            self.bags = []
            return
        } else {
            let containedBags = rule[1].components(separatedBy: ", ")
            self.bags = containedBags.map {
                let words = $0.components(separatedBy: " ")
                return ("\(words[1]) \(words[2])")
            }
        }
    }
    
    func hash(into hasher: inout Hasher) {
        hasher.combine(color)
    }
    
    static func ==(lhs: Bag, rhs: Bag) -> Bool {
        return lhs.color == rhs.color
    }
}

func part1(_ input: [String]) -> Int {
    let start = CFAbsoluteTimeGetCurrent()
    
    var rules = Set<Bag>()
    for line in input {
        let bag = Bag(line)
        rules.insert(bag)
    }
    
    func containsShinyGold(color: String) -> Bool {
        if color == "shiny gold" { return true }
        var hasColor = false
        rules.forEach {
            if $0.color == color {
                hasColor = true
            }
        }
        
        if !hasColor { return false }
        
        var bagsWithin: [String] = []
        for rule in rules {
            if rule.color == color {
                rule.bags.forEach {
                    bagsWithin.append($0)
                }
            }
        }
        
        for bags in bagsWithin {
            if containsShinyGold(color: bags) {
                return true
            }
        }
        return false
    }
    
    var colors: [String] = []
    for rule in rules {
        colors.append(rule.color)
    }
    var res = 0
    for color in colors {
        if containsShinyGold(color: color) && color != "shiny gold" {
            res += 1
        }
    }
        
    let dur = CFAbsoluteTimeGetCurrent() - start
    print("Part 1: \(dur * 1000) ms")

    return res
}

func part2(_ input: [String]) -> Int {
    let start = CFAbsoluteTimeGetCurrent()



    let dur = CFAbsoluteTimeGetCurrent() - start
    print("Part 2: \(dur * 1000) ms")

    return -1
}

print(part1(InputManager.input))
print(part2(InputManager.example))
