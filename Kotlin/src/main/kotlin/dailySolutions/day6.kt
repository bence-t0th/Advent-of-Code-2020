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

private fun day6part2(input: List<String>): Int {
    val start = System.currentTimeMillis()

    val groups = input.map { group ->
        group.split("\n").map { it.toSet() }
    }

    val res = groups.sumBy {
        it.reduce { a, b -> a.intersect(b) }.size
    }

    val dur = (System.currentTimeMillis() - start)
    println("Part 2: $dur ms")

    return res
}

fun main() {
    println(day6part1(input6.formattedInput))
    println(day6part2(input6.formattedInput))
}