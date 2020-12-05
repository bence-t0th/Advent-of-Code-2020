package dailySolutions

import inputManager.input4

data class Passport(var string: String) {

    val requiredFields = setOf("byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid")

    val fields: Map<String, String>

    init {
        fields = string.split(Regex(" |\n"))
                .toList()
                .map {
                    val x = it.split(":")
                    x[0] to x[1]
                }.toMap()
    }

    fun hasFields(): Boolean {
        return fields.keys.containsAll(requiredFields)
    }

    fun birthYear() = fields["byr"]!!.toInt() in 1920..2002

    fun validYear() = fields["iyr"]!!.toInt() in 2010..2020

    fun expiryYear() = fields["eyr"]!!.toInt() in 2020..2030

    fun height(): Boolean {
        if (fields["hgt"]!!.endsWith("cm")) {
            val cm = fields["hgt"]!!.dropLast(2)
            return cm.toInt() in 150..193
        }
        else if (fields["hgt"]!!.endsWith("in")) {
            val inch = fields["hgt"]!!.dropLast(2)
            return inch.toInt() in 59..76
        } else
            return false
    }

    fun hairColour() = fields["hcl"]!!.matches(Regex("#[0-9a-f]{6}"))

    fun eyeColour() = arrayOf("amb", "blu", "brn", "gry", "grn", "hzl", "oth").contains(fields["ecl"])

    fun passportId() = fields["pid"]!!.length == 9

    fun isValid(): Boolean {
        return hasFields() && birthYear() && validYear() && expiryYear() &&
                height() && hairColour() && eyeColour() && passportId()
    }
}

private fun day4part1(passports: List<Passport>): Int {
    val start = System.currentTimeMillis()

    var res = 0
    for (passport in passports)
        if (passport.hasFields())
            res++

    val dur = (System.currentTimeMillis() - start)
    println("Part 1: $dur ms")

    return res
}

private fun day4part2(passports: List<Passport>): Int {
    val start = System.currentTimeMillis()

    var res = 0
    for (passport in passports)
        if (passport.isValid())
            res++

    val dur = (System.currentTimeMillis() - start)
    println("Part 2: $dur ms")

    return res
}

fun main() {
    println(day4part1(input4.formattedInput))
    println(day4part2(input4.formattedInput))
}