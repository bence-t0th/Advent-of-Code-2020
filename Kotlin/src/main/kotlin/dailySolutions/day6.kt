package dailySolutions

import inputManager.input6

private fun day6part1(input: List<String>): Int {
    val start = System.currentTimeMillis()

    var res = 0
    for (form in input)
        res += form.replace("\n", "").toSet().size

    val dur = (System.currentTimeMillis() - start)
    println("Part 1: $dur ms")

    return res
}

// TODO Part 2

private fun day6part2(input: List<String>): Int {
    val start = System.currentTimeMillis()

    val dur = (System.currentTimeMillis() - start)
    println("Part 2: $dur ms")

    return 0
}

fun main() {
    println(day6part1(input6.formattedInput))
    println(day6part2(input6.example))
}