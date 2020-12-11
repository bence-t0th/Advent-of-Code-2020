//
//  main.swift
//  Day 10
//
//  Created by Bence Tóth on 2020. 12. 10..
//  It's my birthday, yeeah! 🎂

import Foundation

func birthdayPart1(_ input: [Int]) -> Int {
    let start = CFAbsoluteTimeGetCurrent()

    var sum1 = 1    // first 0
    var sum3 = 1    // last built-in adapter
    
    for num in 0..<(input.count - 1) {
        if (input[num] == (input[num + 1] - 1)) {
            sum1 += 1
        } else if (input[num] == (input[num + 1] - 3)) {
            sum3 += 1
        }
    }
    
    let dur = CFAbsoluteTimeGetCurrent() - start
    print("Part 1: \(dur * 1000) ms")
    
    return sum1 * sum3
}

func birthdayPart2(_ input: [Int]) -> Int {
    let start = CFAbsoluteTimeGetCurrent()
        
    let dur = CFAbsoluteTimeGetCurrent() - start
    print("Part 2: \(dur * 1000) ms")
    
    return -1
}

print(birthdayPart1(InputManager.input))
print(birthdayPart2(InputManager.input))
