package dailySolutions

import inputManager.input5
import java.awt.Image

fun countSeatId(string: String): Int {
    var row = 0..127
    var column = 0..7

    for (char in string) {
        when (char.toString()) {
            "F" -> {
                val range = row.last - row.first
                row = row.first..(row.first + range / 2)
            }
            "B" -> {
                val range = row.last - row.first
                row = (row.first + range / 2 + 1)..row.last
            }
            "L" -> {
                val range = column.last - column.first
                column = column.first..(column.first + range / 2)
            }
            "R" -> {
                val range = column.last - column.first
                column = (column.first + range / 2 + 1)..column.last
            }
            else -> return -1
        }
    }
    return row.first * 8 + column.first
}

private fun day5part1(seats: List<String>): Int {
    val start = System.currentTimeMillis()

    var currentMaxSeatId = 0

    for (line in seats) {
        val res = countSeatId(line)
        if (res > currentMaxSeatId)
            currentMaxSeatId = res
    }

    val dur = (System.currentTimeMillis() - start)
    println("Part 1: $dur ms")

    return currentMaxSeatId
}

private fun day5part2(seats: List<String>): Int {
    val start = System.currentTimeMillis()

    var seatIds: Set<Int> = setOf()

    for (line in seats)
        seatIds += countSeatId(line)

    var mySeat = 0
    val sortedSeats = seatIds.sorted()

    for (seat in 0 until sortedSeats.last() - sortedSeats.first()) {
        if (sortedSeats[seat] + 2 == sortedSeats[seat + 1]) {
            mySeat = sortedSeats[seat] + 1
            break
        }
    }

    val dur = (System.currentTimeMillis() - start)
    println("Part 2: $dur ms")

    return mySeat
}


fun main() {
    println(day5part1(input5.formattedInput))
    println(day5part2(input5.formattedInput))
}