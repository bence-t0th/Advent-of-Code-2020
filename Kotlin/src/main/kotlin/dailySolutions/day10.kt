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

fun birthdayPart2(input: List<Int>): Long {
    val start = System.currentTimeMillis()

    val dur = (System.currentTimeMillis() - start)
    println("Part 2: $dur ms")

    return -1
}

fun main() {
    println(birthdayPart1(input10.formattedInput))
    println(birthdayPart2(input10.formattedInput))
}