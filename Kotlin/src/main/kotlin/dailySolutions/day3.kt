package dailySolutions

import inputManager.input3
import java.awt.Point

val slope = Point(3, 1)

val slopes = listOf(
        Point(1, 1),
        Point(3, 1),
        Point(5, 1),
        Point(7, 1),
        Point(1, 2))

fun findTrees(input: List<String>, slope: Point): Long {
    var pos = Point(0, 0)
    var trees: Long = 0

    while (pos.y < input.size) {
        if (input[pos.y][pos.x].toString() == "#")
            trees++
        pos.x = (pos.x + slope.x) % input[pos.y].length
        pos.y += slope.y
    }

    return trees
}

private fun day3part1(input: List<String>, slope: Point): Long {
    val start = System.currentTimeMillis()

    val trees = findTrees(input, slope)

    val dur = (System.currentTimeMillis() - start)
    println("Part 1: $dur ms")

    return trees
}

private fun day3part2(input: List<String>, slopes: List<Point>): Long {
    val start = System.currentTimeMillis()

    var trees: Long = 1
    for (slope in slopes) {
        trees *= findTrees(input, slope)
    }

    val dur = (System.currentTimeMillis() - start)
    println("Part 2: $dur ms")

    return trees
}

fun main() {
    println(day3part1(input3.formattedInput, slope))
    println(day3part2(input3.formattedInput, slopes))
}