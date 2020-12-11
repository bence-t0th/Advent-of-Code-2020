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

func tribonacci(n: Int) -> Int {
    if n <= 1 { return 0 }
    else if n == 2 { return 1}
    else {
        return tribonacci(n: n - 1) + tribonacci(n: n - 2) + tribonacci(n: n - 3)
    }
}

func birthdayPart2(_ input: [Int]) -> Int {
    let start = CFAbsoluteTimeGetCurrent()
    
    var jolts = [Int]()
    jolts.append(0)
    jolts.append(contentsOf: input)
    
    var differences = [Int]()
    
    for i in 0..<jolts.count - 1 {
        differences.append(jolts[i + 1] - jolts[i])
    }

    let numberOf1s = differences.split(separator: 3).map { $0.count }

    let res = numberOf1s.reduce(1) {
        tribonacci(n: $1 + 2) * $0
    }
    
    let dur = CFAbsoluteTimeGetCurrent() - start
    print("Part 2: \(dur * 1000) ms")
    
    return res
}

print(birthdayPart1(InputManager.input))
print(birthdayPart2(InputManager.input))
