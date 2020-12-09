package dailySolutions

import inputManager.input7

data class BagWithAmount(val col: String, val num: Int) {
    val color: String = col
    val amount: Int = num
}

class Bag(input: String) {

    val color: String
//    val bags: List<String>                    I used list of Strings in Part 1
    val bags: List<BagWithAmount>

    init {
        val rule = input.split(" bags contain ")
        this.color = rule[0]

        if (rule[1] == "no other bags.")
            this.bags = listOf()
        else {
            val containedBags = rule[1].split(", ")
            this.bags = containedBags.map {
                val words = it.split(" ")
                return@map BagWithAmount("${words[1]} ${words[2]}", words[0].toInt())
            }
        }
    }
}

private fun day7part1(input: List<String>): Int {
    val start = System.currentTimeMillis()

    val rules = mutableSetOf<Bag>()
    for (line in input) {
        val bag = Bag(line)
        rules += bag
    }

    fun containShinyGold(color: String): Boolean {
        if (color == "shiny gold") return true
        var hasColor = false
        rules.forEach {
            if (it.color == color)
                hasColor = true
        }
        if (!hasColor) return false

        val bagsWithin = mutableListOf<String>()
        for (rule in rules) {
            if (rule.color == color) {
                rule.bags.forEach {
                    bagsWithin += it.color
                }
            }
        }

        for (bags in bagsWithin)
            if (containShinyGold(bags)) return true

        return false
    }

    val colors = mutableListOf<String>()
    for (rule in rules) {
        colors += rule.color
    }

    var res = 0
    for (color in colors)
        if (containShinyGold(color) && color != "shiny gold")
            res++

    val dur = (System.currentTimeMillis() - start)
    println("Part 1: $dur ms")

    return res
}

private fun day7part2(input: List<String>): Int {
    val start = System.currentTimeMillis()

    val dur = (System.currentTimeMillis() - start)
    println("Part 2: $dur ms")

    return -1
}

fun main() {
    println(day7part1(input7.formattedInput))
    println(day7part2(input7.example))
}