package dailySolutions

import inputManager.input9

fun day9part1(input: List<Long>, preambleLength: Int): Long {
    val start = System.currentTimeMillis()

    var res: Long = 0
    val preamble = mutableListOf<Long>()
    for (i in 0 until preambleLength)
        preamble += input[i]

    val data = mutableListOf<Long>()
    for (i in preambleLength until input.size)
        data += input[i]

    for (number in data) {
        var hasPair = false
        for (i in 0 until preambleLength) {
            for (j in i until preambleLength) {
                if (preamble[i] + preamble[j] == number)
                    hasPair = true
            }
        }
        if (!hasPair) {
            res = number
            break
        }
        preamble.removeFirst()
        preamble.add(number)
    }

    val dur = (System.currentTimeMillis() - start)
    println("Part 1: $dur ms")

    return res
}

const val myInvalidNumber = 1309761972

fun day9part2(input: List<Long>): Long {
    val start = System.currentTimeMillis()

    var res: Long = 0

    for (i in input.indices) {
        val set = mutableSetOf<Long>()
        var sum: Long = 0
        var j: Long = i.toLong()
        while (sum < myInvalidNumber) {
            sum += input[j.toInt()]
            set += input[j.toInt()]
            j++
        }
        if (sum == myInvalidNumber.toLong()) {
            val min = set.minOrNull()
            val max = set.maxOrNull()
            if (min != null && max != null) {
                res = min + max
            }
            break
        }
    }

    val dur = (System.currentTimeMillis() - start)
    println("Part 2: $dur ms")

    return res
}

fun main() {
    println(day9part1(input9.formattedInput, 25))
    println(day9part2(input9.formattedInput))
}