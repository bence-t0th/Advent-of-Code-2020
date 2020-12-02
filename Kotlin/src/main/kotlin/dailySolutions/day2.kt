package dailySolutions

import inputManager.input2

data class Policy(val string: String) {
    private val min: Int
    private val max: Int
    private val letter: Char

    init {
        val parts = string.split(" ")
        val range = parts[0].split("-").map { it.toInt() }
        this.min = range[0]
        this.max = range[1]
        this.letter = parts[1].toCharArray()[0]
    }

    fun validate(password: String): Boolean {
       val res = password.split(letter.toString()).size - 1
       return res in min..max
    }

    fun validate2(password: String): Boolean {
        return ((letter == password[min - 1] && letter != password[max - 1]) ||
                (letter == password[max - 1] && letter != password[min - 1]))
    }
}

fun day2part1(input: List<List<String>>): Int {
    val start = System.currentTimeMillis()

    var res = 0
    for (i in input.indices) {
        val pol = Policy(input[i][0])
        if (pol.validate(input[i][1]))
            res++
    }

    val dur = (System.currentTimeMillis() - start)
    println("Part 1: $dur ms")

    return res
}

fun day2part2(input: List<List<String>>): Int {
    val start = System.currentTimeMillis()

    var res = 0
    for (i in input.indices) {
        val pol = Policy(input[i][0])
        if (pol.validate2(input[i][1]))
            res++
    }

    val dur = (System.currentTimeMillis() - start)
    println("Part 2: $dur ms")

    return res
}

fun main() {
    println(day2part1(input2.formattedInput))
    println(day2part2(input2.formattedInput))
}