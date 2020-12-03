//
//  main.swift
//  Day 3
//
//  Created by Bence Tóth on 2020. 12. 03..
//

import Foundation

let slope = (x: 3, y: 1)

let slopes = [(x: 1, y: 1),
              (x: 3, y: 1),
              (x: 5, y: 1),
              (x: 7, y: 1),
              (x: 1, y: 2)]

func findTrees(_ input: [[String]], slope: (x: Int, y: Int)) -> Int {
    var position = (x: 0,y: 0)
    var trees = 0
    
    while position.y < input.count {
        if input[position.y][position.x] == "#" {
            trees += 1
        }
        position.x = (position.x + slope.x) % input[position.y].count
        position.y += slope.y
    }
    
    return trees
}

func part1(_ input: [[String]], slope: (x: Int, y: Int)) -> Int {
    let start = CFAbsoluteTimeGetCurrent()
    
    let trees = findTrees(input, slope: slope)
    
    let dur = CFAbsoluteTimeGetCurrent() - start
    print("Part 1: \(dur * 1000) ms")
    
    return trees
}

func part2(_ input: [[String]], slopes: [(x: Int, y: Int)]) -> Int {
    let start = CFAbsoluteTimeGetCurrent()
    
    var trees = 1
    for slope in slopes {
        trees *= findTrees(input, slope: slope)
    }
    
    let dur = CFAbsoluteTimeGetCurrent() - start
    print("Part 2: \(dur * 1000) ms")
    
    return trees
}

print(part1(InputManager.input, slope: slope))
print(part2(InputManager.input, slopes: slopes))
