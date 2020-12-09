package dailySolutions

import inputManager.input8

data class Command(
        val name: String,
        val value: Int
)

data class Program(
        val nextLine: Int,
        val acc: Int
)

fun run(commands: List<Command>): Program {
    val executed = mutableSetOf<Int>()
    var acc = 0
    var nextLine = 0
    var res = 0

    while (true) {
        if (nextLine !in commands.indices || nextLine in executed) {
            res = acc
            break
        }
        executed.add(nextLine)
        val i = commands[nextLine]
        when (i.name) {
            "acc" -> {
                acc += i.value
                nextLine++
            }
            "jmp" -> nextLine += i.value
            "nop" -> nextLine++

            else -> error("Invalid instruction")
        }
    }
    return Program(nextLine, acc)
}

fun day8part1(input: List<Command>): Int {
    val start = System.currentTimeMillis()

    val res = run(input)

    val dur = (System.currentTimeMillis() - start)
    println("Part 1: $dur ms")

    return res.acc
}

fun day8part2(commands: List<Command>): Int {
    val start = System.currentTimeMillis()

    var res = 0

    commands.forEachIndexed { i, inst ->
            when (inst.name) {
                "jmp" -> commands.toMutableList().also { it[i] = Command("nop", inst.value) }
                "nop" -> commands.toMutableList().also { it[i] = Command("jmp", inst.value) }
                else -> null
            }?.let {
                val actual = run(it)
                if (actual.nextLine == commands.size)
                    res = actual.acc
            }
        }

    val dur = (System.currentTimeMillis() - start)
    println("Part 1: $dur ms")

    return res
}


fun main() {
    println(day8part1(input8.formattedInput))
    println(day8part2(input8.formattedInput))
}