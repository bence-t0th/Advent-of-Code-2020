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

// MARK: TODO Part 2

func part2(_ input: [String]) -> Int {
    let start = CFAbsoluteTimeGetCurrent()
    
    let dur = CFAbsoluteTimeGetCurrent() - start
    print("Part 2: \(dur * 1000) ms")
    
    return 0
}

print(part1(InputManager.input))
print(part2(InputManager.example))
