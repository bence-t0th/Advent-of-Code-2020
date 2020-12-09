//
//  main.swift
//  Day 9
//
//  Created by Bence Tóth on 2020. 12. 09..
//

import Foundation

func part1(_ input: [Int], preambleLength: Int) -> Int {
    let start = CFAbsoluteTimeGetCurrent()
    
    var res = 0
    var preamble = Array(input[..<preambleLength])
    let data = input[preambleLength...]
    
    for number in data {
        var hasPair = false
        for i in 0..<preambleLength {
            for j in i..<preambleLength {
                if preamble[i] + preamble[j] == number {
                    hasPair = true
                }
            }
        }
        if !hasPair {
            res = number
            break
        }
        preamble.removeFirst()
        preamble.append(number)
    }
    
    let dur = CFAbsoluteTimeGetCurrent() - start
    print("Part 1: \(dur * 1000) ms")
    
    return res
}

let myInvalidNumber = 1309761972

func part2(_ input: [Int]) -> Int {
    let start = CFAbsoluteTimeGetCurrent()
    
    var res = 0
    
    for i in 0..<input.count {
        var set = Set<Int>()
        var sum = 0
        var j = i
        while sum < myInvalidNumber {
            sum += input[j]
            set.insert(input[j])
            j+=1
        }
        if sum == myInvalidNumber {
            let min = set.min()!
            let max = set.max()!
            res = min + max
            break
        }
    }

    let dur = CFAbsoluteTimeGetCurrent() - start
    print("Part 2: \(dur * 1000) ms")
    
    return res
}

print(part1(InputManager.input, preambleLength: 25))
print(part2(InputManager.input))
