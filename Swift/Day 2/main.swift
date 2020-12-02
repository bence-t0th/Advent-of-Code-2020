//
//  main.swift
//  Day 2
//
//  Created by Bence Tóth on 2020. 12. 02..
//

import Foundation

struct Policy {
    let min: Int    // different use in Part 2
    let max: Int    // different use in Part 2
    let letter: String
    
    init(_ str: String) {
        let parts = str.components(separatedBy: " ")
        let range = parts[0].components(separatedBy: "-").map { Int($0)! }
        self.min = range[0]
        self.max = range[1]
        self.letter = parts[1]
    }
    
    func validate(_ password: String) -> Bool {
        let res = password.components(separatedBy: letter).count - 1
        return res <= max && res >= min
    }
    
    func validate2(_ password: String) -> Bool {
        let char = Character(letter)
        let first = Array(password)[min - 1]
        let second = Array(password)[max - 1]
        
        return ((char == first && char != second) || (char == second && char != first))
    }
}

func part1(_ input: [[String]]) -> Int {
    let start = CFAbsoluteTimeGetCurrent()
    
    var res = 0
    for i in 0..<input.count {
        let pol = Policy(input[i][0])
        if (pol.validate(input[i][1])) {
            res+=1
        }
    }
    
    let dur = CFAbsoluteTimeGetCurrent() - start
    print("Part 1: \(dur * 1000) ms")
    
    return res
}

func part2(_ input: [[String]]) -> Int {
    let start = CFAbsoluteTimeGetCurrent()
    
    var res = 0
    for i in 0..<input.count {
        let pol = Policy(input[i][0])
        if (pol.validate2(input[i][1])) {
            res+=1
        }
    }
    
    let dur = CFAbsoluteTimeGetCurrent() - start
    print("Part 2: \(dur * 1000) ms")

    return res
}

print(part1(InputManager.input))
print(part2(InputManager.input))
