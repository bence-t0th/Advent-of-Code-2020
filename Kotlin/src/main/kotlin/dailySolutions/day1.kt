package dailySolutions

import inputManager.input1

private fun day1part1(input: List<Int>): Int {
    val start = System.currentTimeMillis()

    for (i in input.indices)
        for (j in input.indices)
            if (input[i] + input[j] == 2020) {
                val dur = (System.currentTimeMillis() - start)
                println("Part 1: $dur ms")
                return input[i] * input[j]
            }
    return 0
}

private fun day1part2(input: List<Int>): Int {
    val start = System.currentTimeMillis()

    for (i in input.indices)
        for (j in input.indices)
            if (input[i] + input[j] < 2020)
                for (k in input.indices)
                    if (input[i] + input[j] + input[k] == 2020) {
                        val dur = (System.currentTimeMillis() - start)
                        println("Part 2: $dur ms")
                        return input[i] * input[j] * input[k]
                    }
    return 0
}

fun main() {
    println(day1part1(input1.formattedInput))
    println(day1part2(input1.formattedInput))
}
