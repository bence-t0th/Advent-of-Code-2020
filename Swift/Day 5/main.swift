//
//  main.swift
//  Day 5
//
//  Created by Bence Tóth on 2020. 12. 05..
//

import Foundation

func countSeatId(_ str: [String]) -> Int {
    var row = 0...127
    var column = 0...7
    
    str.forEach { char in
        if (char == "F") {
            let range = row.upperBound - row.lowerBound
            row = row.lowerBound...(row.lowerBound + range / 2)
        }
        if (char == "B") {
            let range = row.upperBound - row.lowerBound
            row = (row.lowerBound + range / 2 + 1)...row.upperBound
        }
        if (char == "L") {
            let range = column.upperBound - column.lowerBound
            column = column.lowerBound...(column.lowerBound + range / 2)
        }
        if (char == "R") {
            let range = column.upperBound - column.lowerBound
            column = (column.lowerBound + range / 2 + 1)...column.upperBound
        }
    }
    return (row.first! * 8 + column.first!)
}

func part1(_ input: [[String]]) -> Int {
    let start = CFAbsoluteTimeGetCurrent()
    
    var currentMaxSeatId = 0
    
    for line in input {
        let res = countSeatId(line)
        if res > currentMaxSeatId {
            currentMaxSeatId = res
        }
    }
    
    let dur = CFAbsoluteTimeGetCurrent() - start
    print("Part 1: \(dur * 1000) ms")
    
    return currentMaxSeatId
}

func part2(_ input: [[String]]) -> Int {
    let start = CFAbsoluteTimeGetCurrent()

    var seatIds = Set<Int>()
    
    for line in input {
        seatIds.insert(countSeatId(line))
    }
    
    let sortedIds = seatIds.sorted()
    let allSeats = Set(sortedIds.first!...sortedIds.last!)
    
    let dur = CFAbsoluteTimeGetCurrent() - start
    print("Part 2: \(dur * 1000) ms")
    
    return allSeats.symmetricDifference(sortedIds).first!
}

print(part1(InputManager.input))
print(part2(InputManager.input))
