//
//  main.swift
//  Day 8
//
//  Created by Bence Tóth on 2020. 12. 08..
//

import Foundation

struct Command {
    var name: String
    let value: Int
    
    init(cmd: [String]) {
        self.name = cmd[0]
        self.value = Int(cmd[1])!
    }
}

func run(_ input: [Command]) -> Int {
    var acc = 0
    var nextLine = 0
    var executed = Set<Int>()
    var res = 0
    
    while true {
        if nextLine < input.count {
            if !executed.contains(nextLine) {
                executed.insert(nextLine)
                switch input[nextLine].name {
                case "acc":
                    acc += input[nextLine].value
                    nextLine += 1
                case "jmp":
                    nextLine += input[nextLine].value
                case "nop":
                    nextLine += 1
                default:
                    print("command is not valid")
                }
            } else {
                res = acc
                break
            }
        }
    }
    return res
}

func part1(_ input: [Command]) -> Int {
    let start = CFAbsoluteTimeGetCurrent()
        
    let res = run(input)
    
    let dur = CFAbsoluteTimeGetCurrent() - start
    print("Part 1: \(dur * 1000) ms")
    
    return res
}

func part2(_ input: [Command]) -> Int {
    let start = CFAbsoluteTimeGetCurrent()
    
    var res = 0
    var acc = 0
    var nextLine = 0
    var executed = Set<Int>()
    var changedLine = 0

    for _ in input {
        
        var changedInput = input
        switch changedInput[changedLine].name {
        case "nop" :
            changedInput[changedLine].name = "jmp"
        case "jmp":
            changedInput[changedLine].name = "nop"
        default:
            break
        }
        
        changedLine += 1
        
        acc = 0
        executed.removeAll()
        nextLine = 0
                
        while true {
            if nextLine < changedInput.count {
                if !executed.contains(nextLine) {
                    executed.insert(nextLine)
                    switch changedInput[nextLine].name {
                    case "acc":
                        acc += changedInput[nextLine].value
                        nextLine += 1
                    case "jmp":
                        nextLine += changedInput[nextLine].value
                    case "nop":
                        nextLine += 1
                    default:
                        print("command is not valid")
                    }
                } else {
                    break
                }
            } else {
                res = acc
                break
            }
        }
    }

    let dur = CFAbsoluteTimeGetCurrent() - start
    print("Part 2: \(dur * 1000) ms")
    
    return res
}

print(part1(InputManager.input))
print(part2(InputManager.input))
