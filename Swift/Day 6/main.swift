//
//  main.swift
//  Day 6
//
//  Created by Bence Tóth on 2020. 12. 06..
//

import Foundation

func part1(_ input: [String]) -> Int {
    let start = CFAbsoluteTimeGetCurrent()
    
    var res = 0
    for form in input {
        res += Set(form.replacingOccurrences(of: "\n", with: "")).count
    }
    
    let dur = CFAbsoluteTimeGetCurrent() - start
    print("Part 1: \(dur * 1000) ms")
    
    return res
}

func part2(_ input: [String]) -> Int {
    let start = CFAbsoluteTimeGetCurrent()
    
    // get groups
    let groups = input.map { $0.components(separatedBy: "\n") }
    
    // get different answers
    let uniques = groups.map { Set($0) }
    
    // get number of the common answers in the groups
    let commons = uniques.map {
        $0.reduce(Set("abcdefghijklmnopqrstuvwxyz"), {
            $0.intersection($1)
        }).count
    }
    
    // sum of the common answers
    let res = commons.reduce(0 , +)
    
    let dur = CFAbsoluteTimeGetCurrent() - start
    print("Part 2: \(dur * 1000) ms")
    
    return res
}

print(part1(InputManager.input))
print(part2(InputManager.input))
