//  It's my birthday, yeeah! 🎂

package dailySolutions

import inputManager.input10

fun birthdayPart1(input: List<Int>): Int {
    val start = System.currentTimeMillis()

    var sum1 = 1    // first 1
    var sum3 = 1    // last built-in adapter

    for (num in 0 until input.size - 1)
        if (input[num] == input[num + 1] - 1)
            sum1++
        else if (input[num] == input[num + 1] - 3)
            sum3++

    val dur = (System.currentTimeMillis() - start)
    println("Part 1: $dur ms")

    return sum1 * sum3
}

fun tribonacci(n: Long): Long {
    if (n <= 1L) return 0L
    else if (n == 2L) return 1L
    else return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3)
}

fun birthdayPart2(input: List<Int>): Long {
    val start = System.currentTimeMillis()

    val jolts = mutableListOf<Int>()
    jolts += 0
    jolts += input

    val differences = mutableListOf<Int>()
    for (i in 0 until jolts.size - 1)
        differences += jolts[i + 1] - jolts[i]

    val numberOf1s = mutableListOf<Int>()
    var numOf1s = 0

    for (i in differences) {
        if (i == 1)
            numOf1s++
        else if (i == 3) {
            numberOf1s += numOf1s
            numOf1s = 0
        }
    }
    if (differences.last() == 1)
        numberOf1s += 1

    val trib = mutableListOf<Long>()
    numberOf1s.forEach {
        if (it != 0) {
            trib.add(it.toLong())
        }
    }

    val res = trib.reduce { a, b ->
        tribonacci(b + 2) * a
    }

    val dur = (System.currentTimeMillis() - start)
    println("Part 2: $dur ms")

    return res
}

fun main() {
    println(birthdayPart1(input10.formattedInput))
    println(birthdayPart2(input10.formattedInput))
}