//
//  main.swift
//  Day 1
//
//  Created by Bence Tóth on 2020. 12. 02..
//

import Foundation

func part1(_ input: [Int]) -> Int {
    let start = CFAbsoluteTimeGetCurrent()
    for i in 0..<input.count {
        for j in 0..<input.count {
            if (input[i] + input[j] == 2020) {
                let dur = CFAbsoluteTimeGetCurrent() - start
                print("Part 1: \(dur * 1000) ms")
                return (input[i] * input[j])
            }
        }
    }
    return 0
}

func part2(_ input: [Int]) -> Int {
    let start = CFAbsoluteTimeGetCurrent()
    for i in 0..<input.count {
        for j in 0..<input.count {
            if (input[i] + input[j] < 2020) {
                for k in 0..<input.count {
                    if (input[i] + input[j] + input[k] == 2020) {
                       let dur = CFAbsoluteTimeGetCurrent() - start
                        print("Part 2: \(dur * 1000) ms")
                        return (input[i] * input[j] * input[k])
                    }
                }
            }
        }
    }
    return 0
}

print(part1(InputManager.input))
print(part2(InputManager.input))
