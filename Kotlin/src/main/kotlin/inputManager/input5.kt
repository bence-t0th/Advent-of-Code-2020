package inputManager

object input5 {

    val example = """
BFFFBBFRRR
FFFBBBFRRR
BBFFBBFRLL
""".trimIndent().split("\n")

    val formattedInput = """
 BBFFBBFLRL
 BFFFBBBRLL
 FFBBFFFLLR
 FBFBFFBRRL
 FBBBBBFLLR
 BFBBFFBLRL
 BFBBFBFRRL
 BFBFFBBLLL
 BFBFFFBRLL
 FFFBFBFLLL
 BFBFBBBLRR
 BFBBFBFRLR
 FFFBBBBLLL
 BFFBFFFLLR
 BBFBFBBLLL
 BFFFBBBRRR
 FBBFFBFRLR
 BFFFFBBRRR
 FFBFFFBLLL
 BBFFFFBRRL
 BFFFFFBLRL
 BBFBBBBLRR
 FBBFBFBRLR
 BFBFFFBRRL
 BBFFFBBLRR
 BBFBBFFRRR
 FFBBFBBLLR
 BFBFFFBLLL
 BFFBBBBLRR
 FBBBBFBLRL
 BBFBFBFRRR
 BFFFBFBLRR
 BBFFFBBRRL
 FFBFBBBRLR
 BFFFBBBRLR
 FBBBBFBRLL
 BFBBBBFLLR
 BFFBFBBRRR
 BFBFFBBLRL
 FFFBBFBRLR
 FFBBBBFLLL
 BFBFBBFLLR
 BBFBBBFRLR
 BFFBBBBRLL
 FFBFFFBLRL
 FBFFBBFRLL
 BFBBFFFLLR
 FBFBBFFLRL
 FFFBBBFLRR
 BBFBBFFLRR
 BFBBFBFLLR
 BFFBFBFRRR
 BFBBFFFRLR
 BFFBFBBLRR
 FBFBBBBLLL
 FBFBFFFLRL
 FFBFBBBRLL
 FFBFBBBLRR
 BFFBFBFLLL
 FBBFFBBRRR
 FBFBFBFLRR
 FBBFBBBRRL
 BFFBBBBRLR
 FFFBFFBRRR
 BFFFFBFRRR
 FBBFBFFRLL
 FFBBFBFRLL
 BBFFBBBRLR
 FFBBFFBRLL
 FBBBBFFRLR
 FBBFFBFLLR
 BFFBFBFRLR
 BBFBBBBRLL
 BFBFFBBLLR
 FFBFFFFRLL
 BFBFFFFLRR
 BBFFBFBLLL
 BBFFBBBRLL
 BBFBBBFLRL
 FBFFBBFLRL
 FBFBFBBRRR
 FFBBFBFLLR
 FBFFFBBRRL
 BBFFBFBRRL
 FBFBBFFRLR
 FFBFFBBLLR
 BFBFBFBLRR
 BBFFBFBLRR
 FBBFBFBLRR
 FBFFBFFRRL
 FBFFBBBRLR
 FBFFBBFRRR
 BFBBBFFLLR
 BBFFBFFLRR
 BFBFFFFRRR
 BFFBFFBRRL
 BBFFBBFLLR
 BFBFFBFLRL
 FFFBFBBRRR
 BFBBBFFLRR
 FBBBBBBRLR
 FBBFFFFLLL
 FFFFBBFRRL
 BFBFBFBLLL
 FFBBBFBLRL
 FBFFFFFLRR
 BFFBFFFRRL
 BFFBBFBLLL
 FBFBFBBRRL
 FBBFFFBRLR
 FFBBBBFRRL
 BFFBBBFRRR
 BFFBBFBRRR
 BFFFBFFRRL
 FBBFFFBRRR
 FFBBFBBLRL
 FFFBBBBLLR
 BFBBFBBRRL
 BFBFFBBRLR
 BBFFBFFLLL
 BFBBFFFLRR
 BBFFBFFLLR
 BFFFFBFLRL
 FFBFFBFLRL
 FFFBFBBRLR
 FBFBBFBRLR
 BFFBBBFLLL
 FFBBFBBRRL
 FFFBBBFLLL
 BFFBBBFRLR
 BFBFBBBLLR
 BFBFBFFRLR
 FBBFFFFRRL
 BFFFFFFLLL
 BBFFBFBRRR
 BFFFBFFLLR
 BBFFBFFLRL
 FFBFFFFLLR
 FFBFFBBRLL
 FFFFBBFRLR
 BFBBBBBLLL
 BFFFFFBLLR
 FBBBBBBRRR
 FFFBFFBRRL
 BFBBFFBLRR
 BFBBFBBRLL
 FBBFFFBLLR
 BFFBFFFLLL
 BBFFBBFRLL
 BBFBBBBRRL
 FFFBBFFLLL
 BFFFBBFRRR
 BFBFBFFLLR
 BFBFBBBRLR
 FBBBBFFLLL
 FBFBFBFRLL
 FFFBBBFRRR
 FFBFBFFLRL
 FBFFFFBRLL
 BBFFFFFRLL
 BFBBFFFRRR
 FFFBBBBRRL
 BBFFFFFLLL
 BBFBBFBLRR
 FFFFBBBLRL
 BBFBFFFLRL
 FBFFBFBLLL
 BFFFFBFLLL
 BBFFFFFLRL
 BFBBFFBLLL
 BBFFFBFLLL
 BFBBFBBRRR
 BFBFBBBLLL
 FBFBBBBLRL
 FFBFBFFRRR
 FBFBBBFLRR
 FBFFBBBLLL
 BFFFFBBLRL
 FBFBFBFLLL
 FFBBBFBRRR
 FFFBFFFRRL
 FBFFBFFLLL
 FBFFFFBLRR
 FBBBBBFRLL
 FBBFFBBRLR
 BFBBBFFRRR
 BFBFFBFRLR
 FFFBBBBRLR
 FBFBFBFRRL
 BFBFBFBRRR
 FFFBBFBLLR
 FFBFBFFLRR
 FBBBBFFRRR
 BBFBFBBRLR
 BBFFFBFRRR
 FBBBFBBRRL
 FBBBFFBLRL
 FBFFFFFRRL
 BBFFBBFRLR
 FFBBBFFRRR
 FBFBFFFRLR
 BFBBFFBRLR
 BFFBFBFLLR
 BFFBBBFLRR
 FFFBBFBLRR
 FFFBBFFRRL
 BBFBBBFRRR
 FBBFBFBRRR
 FFFBFBBRLL
 FBBFBBFLLR
 BFFFBFFLRL
 BFBBFFBLLR
 BFFFFFBRLL
 BBFBBFFRLR
 FBFFBBBRLL
 FFBFFBFRLL
 FFBFFBFLLR
 BFBFBFBRLL
 BFFBFBBLLR
 FBFFFFFRLL
 FFBBBFBLRR
 FBFFFBFRLL
 FFBBFBFLRL
 BBFBFFFRRR
 FBFFFBBLLL
 BFFFFFBRLR
 BFBBBBBRLL
 BFFFBBBLLL
 FBBFFBBRLL
 BFFBBBBRRR
 BBFBBFBRLL
 FBBFBBFLRR
 BFBBFBBLLL
 FFBBBFFLLR
 BFBFBBFRLL
 FFFBBBFLRL
 BFBFBBFLRR
 FBFFBFBRRL
 FFBFFBFRLR
 BBFFBBBLLR
 BFBBBBFLRR
 FBBFFFBRRL
 FBFBFFFRLL
 FFBBBFBRLL
 BFFFFFBRRR
 BBFFBBFLRR
 BBFBFBFLLR
 FBFFFBFLRL
 BBFFBFFRLL
 FBBBFFBLRR
 BFFFBFBRRR
 FFFBFBBLLR
 FBFFBBBLRL
 BFFBFFFRLL
 BFFBBFFRLR
 BFBBBFFLRL
 BFFBBFBRLL
 FBFBFBFRRR
 FBFBBBBRRL
 FBFBFFFRRL
 BFFBBFFRRR
 FBFBBBBLLR
 FBBBBFFLLR
 BFFBFFFRRR
 BFBBBBBLLR
 BFFBBFBLRL
 FBBFFBFLRL
 BBFFBBFRRL
 BFFFFFFRRR
 FBBFBBBLLL
 BBFBFBBRRR
 FBBBFBFRLR
 FFFBFFFLRR
 FBFBBFFRRR
 FFBFFBFRRR
 FFBBFBBRRR
 FBBFBBFRRL
 BBFFFFFRRR
 BFFBBBFLLR
 FFBBFBBLRR
 FBFBBBFLLL
 FBFFFBFLLR
 BBFBFFFLRR
 FFBFFFFLLL
 BFFFFBFRLR
 BFFFBBBRRL
 FFFBBBFRLR
 FFBBBFBRLR
 FBFBFBBRLL
 BBFBBFBRLR
 BBFBFFFRLR
 FFBFBBBLRL
 FBFFFBFLRR
 BBFFFFBLRR
 FFFBBFFLLR
 FFBBFBFRRL
 BBFFFFFLRR
 FFBBBBBRRR
 FFBFBBFLLR
 FFFBFFFRLL
 FBBBBBFLRR
 FBBFBBBLRR
 FBBBBBFLRL
 FFFBBFBRLL
 FFFBFBBRRL
 FFFBFFFLRL
 BFBBBBFRRR
 FBBFBBFLRL
 BFFBBBFLRL
 BBBFFFFLLL
 BBFBFFFRRL
 FBBFBBFRLR
 FBFBFBFRLR
 FFBFFFBRLL
 BFFBFFFLRL
 BFFFFBFRLL
 BBFBFBBRRL
 BFBBFFBRLL
 BFFBFBBLRL
 FBBBFFBRRL
 BBFFFBBRLL
 FFFFBBBRRL
 BFBBFBBLRR
 FFFFBBBLLR
 FFFBFFBLLL
 FBBFFBBLLL
 BFFFFFFLRR
 FBBBFFFRRR
 BFFFBFBLLL
 FBFBBFBRRL
 FBFFBFFLRL
 BFBBBFBLRL
 BFFBFBBLLL
 BBFBFBBLRR
 BFFFBBFRRL
 FBBBFFFLRR
 FBBBBBBLLL
 BBFFBFBRLL
 FBBBFFFLLL
 FFBBFFBLLL
 FBBFFBBLLR
 FBBBBFBLRR
 FFFFBBFRRR
 BFBBFBFLRR
 BFBBBFBRRR
 FBBFFBBLRL
 BBFBFBBLLR
 FFBFFFBLRR
 FFFFBBBLLL
 FBBFBBBRRR
 FBFBFBFLRL
 FFBFBFFLLR
 BFBFBBFLLL
 FFFBFBBLLL
 FFBBFFBRRR
 BFBBBFBRLR
 FBFBFFFLRR
 BFFBBFFLRR
 FBBFFBFRLL
 FFBFBBBRRL
 BFBFFBBRLL
 BFBBFBBRLR
 FBBBBBBLRR
 FFFBBFBLRL
 FBBBFFFLLR
 BFBFBBFRLR
 FBFFBFBRLR
 FBBBFFFLRL
 FBFFFBBLRL
 FFBBFBBRLL
 BBFBFFBRLR
 FBFBBFFLLL
 BBFBFFFLLL
 BBFFFBBRLR
 BBFBFBFRLR
 BBFFFBBLLR
 BBFBFBFLRR
 BFBFBBBRRL
 FFBFFFFRRL
 FBFBFBBLRR
 FFBBBFBRRL
 BBFFFFBRRR
 BFFBFFBLRL
 FBBFFFFLRR
 BBFBBFBRRR
 FBFBBBFLLR
 FFBFFFFRRR
 BBFBBBFLLR
 BFBBFBFRRR
 FBFBFFFLLR
 FFBFBBFLLL
 BFBFFFFLLL
 BFFFFFFRLR
 BBFFBFFRRL
 FBFFBBBLLR
 FFBFBFBRRR
 BBFFBBBRRL
 BFBBBBBLRL
 BBFBBBFLRR
 FBFBFBBLLL
 BFFBBFBLLR
 BFBFBFFLLL
 FBFFBFFRRR
 BFFBFBFLRR
 BFFBBBBLLR
 FBBBFFFRLL
 FFBBFBFLRR
 FBFBFFBLLL
 FBBFFFFLLR
 FBBBBFFLRR
 FBBFBFBLLR
 FBBBBBBRRL
 BBFBFFBRLL
 FBFBFFBRRR
 BFFBFFFLRR
 BFFFBBBLRL
 FBFFBBBRRL
 FBBFFBBRRL
 FFFBBBFLLR
 FFFFBBBLRR
 FBFFBBFRRL
 FBFFBBBRRR
 FBBBFFBRLR
 BFBFFBFLLR
 BFBBFFBRRL
 FBBBFBBLRR
 BFFFBBFRLR
 FFBFBFFRLL
 BFFFBFFRLL
 BBFFBBFLLL
 FFFBBFBLLL
 FBBBBFFLRL
 FBBBFBFLLL
 BBFFFBFLLR
 BFBBFFFRRL
 FBFFFFFRRR
 BBFBBFBLLL
 FBBBBBFLLL
 BBFFBBBLRL
 BFFBBBFRRL
 FFFBBBBRRR
 BFBBFBBLLR
 FBFBFBBRLR
 BFBFFBBRRL
 FBFBBFFRLL
 BBFFFFBRLL
 FFBFBBBLLL
 FBBFBFBLLL
 BFFFFBBLRR
 BFFFFBFLLR
 FBBFFFBLRL
 FBFBBFFLLR
 BFBFFBFRLL
 BBFBBBBRRR
 BBFBFFBLLL
 FFBBFFBLLR
 BFFBFFBLLR
 BFBBBFBLLL
 BFFBBFFLRL
 BBFFFBFRRL
 BFFFBFBRLL
 BBFFBFFRRR
 FFBBBBBRRL
 FFBFBFBRLR
 BFBBFFFLLL
 BFBBBFFLLL
 BFFFBFBRRL
 FBFFFBBRLL
 FBFFBFBRLL
 FFBBBFFLRL
 FBBFFBBLRR
 BFBBBFFRRL
 BFBBBBFLLL
 BFBBBFBLRR
 BFBFFFFRLR
 FFBFFBBLRL
 BFBBBFBLLR
 FBFFBBFLRR
 FFFBBFFRLL
 BFFFFBFLRR
 FFBFFBBRLR
 BBFFFBFRLL
 FBBBFBFRLL
 BBFFFFBLLR
 FFBFFFFRLR
 BFFBFFBRRR
 BBFBBFBLRL
 FBBFFFFRLR
 FFBBFFFLLL
 FFBFBFBLRL
 FFBBBBFLRL
 BFFFBFBLLR
 BFBFBFFLRL
 BBFBBBFRLL
 FBBFFFBRLL
 BFBFFBFRRL
 FBFFBFFRLL
 BBFFBBFRRR
 BFBBBBFRLL
 FBBFBBFRLL
 BFFBBFBLRR
 BFFBFFBLRR
 BFFFBBFLRL
 FBBBFBBRLR
 FFFBBBBLRR
 BBFFFBFRLR
 BFFBBBBLRL
 BBFBFFBLLR
 FBBFFBFRRR
 FBFFBBFLLR
 BBFBFFBRRL
 FFBFFBBRRR
 BBFBBFFLLL
 FFFBFBFRRR
 FBFFFFFLLR
 FFFBFBFLRR
 BFFFFFFRRL
 FBBBFBFLLR
 FFFBBFBRRL
 FFBBFBFRLR
 FBBBFBFLRL
 BFBBBBFRRL
 FFBFFFFLRR
 BBFBFBFRLL
 BBFBFBFLRL
 FBBFFFFRRR
 FFBBBFBLLR
 FFBFFFBRRR
 BFFBFFFRLR
 FFBFFBFLRR
 FFFBBFBRRR
 BFFFFBFRRL
 BFFFBFFLRR
 FFBFBBFLRR
 BFBBFBBLRL
 BFBBFBFLLL
 FFBBBFFLLL
 FFFBFFFLLL
 FBFFFBBRLR
 FBFBBBFRLL
 FBBBBFBRRL
 FFFFBBBRRR
 BBFBFFFRLL
 FBBFBFFLRL
 FBFBFFBRLL
 FBBBFFFRRL
 FFBFBFBLRR
 BFBFFFBRLR
 FBFFFFFLLL
 BFFBFBBRLL
 FFBFBBBRRR
 FFBFBFBLLL
 FBBBBBFRRR
 FFBFBBFRLL
 BFFFFBBRRL
 BFBBBFBRRL
 FBFFFFFRLR
 FFFBBFFLRL
 FFFBFFFLLR
 FBBFBBFRRR
 BBFFFBBLLL
 BFFFFFBLRR
 FBFFFFBLLR
 BBFFFFBLLL
 FFBBFBBLLL
 FBFFBBFRLR
 BFBBBBBLRR
 FBFBFFBLRL
 FBFFBFFLLR
 BBFFFFBLRL
 BBFBBBBRLR
 BFBBBBBRRR
 FBFBBBBRRR
 FBBBFFBLLR
 BBFFFBBRRR
 FBBBFBBRLL
 FBBBFBFRRL
 FBBFBFFLLL
 FFBBFFFLRL
 BFFBFBFRLL
 BBFBBFBLLR
 FFFBFBFRLR
 BBFBBBFRRL
 FFBBFBFLLL
 FFFBFFBRLL
 BFFFBFBLRL
 FBFFFBBLLR
 BFFFFFBRRL
 FFBBBBBLRL
 BFFFBBBLLR
 BFBBFBFRLL
 BBFBFFBLRR
 FBBBFBBLLR
 BFBFBFFLRR
 FBFBBBFRRL
 BFBBBFFRLR
 FBBBBFFRRL
 BBFFBFBRLR
 BBFFFFBRLR
 FBBBBFBLLL
 FBFFFBFRRL
 FBBBFBBLRL
 BBFBBFFRLL
 FBBBFFFRLR
 FBFFFFFLRL
 FFBBFFFRLL
 BFBFFFBRRR
 BBFBFFFLLR
 BBFFFBFLRR
 FBFBFBBLRL
 FBBFFBFRRL
 FFBBBBFLLR
 BFFFBFBRLR
 FBBBBBFRLR
 FBFBBBBRLR
 BFFBFFBLLL
 BFFBFBBRLR
 FFBBFFFRRR
 FFBBBFFRRL
 FFBFBBFRRR
 BBFBBFBRRL
 BFFFFBBLLL
 BFFFFBBLLR
 BFBBBFBRLL
 BBFFFFFLLR
 FBFFFFBRRR
 FFFBFFFRLR
 BFBFFFFRLL
 BFBBFFFLRL
 FFFBFBFRLL
 BFFFFFBLLL
 FFBBBFFRLL
 BFBFFFFLRL
 FFBFBBBLLR
 BFBFFBFRRR
 FBBBFFBLLL
 FFBBFFFLRR
 FFBBBFFLRR
 BBFFBBBLRR
 FFBFFFBRRL
 FBFFBFBLLR
 BFFBBFFLLL
 BFBBFBFLRL
 BFFFBBFLRR
 FFFBFBFLLR
 BBFFBBBRRR
 BFBBFFFRLL
 FFBFBFFRLR
 BBFFFBBLRL
 BFFBBBBRRL
 BFBBBFFRLL
 FFFBBFFRRR
 FFBFFFFLRL
 FFBBBBFRLR
 FBFBBFBRLL
 FBBBFFBRLL
 FFBBBBFRLL
 BFFFBFFLLL
 FBBBBFBRLR
 BBFFBBBLLL
 FBBBBFBLLR
 FBBFBFFRRL
 FBBBFBFLRR
 BBFBFBBRLL
 FBFBFFBLRR
 FBBBBBFRRL
 FFBFFBBRRL
 FBFBBBFRRR
 BFBFBFBRLR
 BFFBBFFRLL
 BFBBBBBRLR
 BFFBBBFRLL
 FFBFFBFLLL
 BBFFBFFRLR
 FFBBBBBLLR
 BFFBBFFRRL
 FBBFBFBLRL
 FFFBFBFRRL
 FFBBFFFRLR
 FBBFBFBRRL
 FBBFFFFLRL
 FFBBBFBLLL
 FFBFFBBLRR
 FFBFBFFLLL
 FBFBFBBLLR
 BBFFBFBLLR
 BBFBFBBLRL
 FFFBFFFRRR
 BFFFFFFRLL
 BFFFBBFLLR
 BFBFFBBRRR
 FFBBBBBRLR
 FBBBBBBLRL
 FBFBBFBLLL
 FBFFBFBLRR
 FBFFFFBRLR
 BFBBBBFLRL
 FBBBFBFRRR
 FBFBFBFLLR
 FBFFFBBLRR
 BFFBFFBRLR
 BFFFBBFLLL
 BFFFBBFRLL
 BFBFFFBLRR
 FFBFBFBRRL
 FBBBFFBRRR
 FFBBFBBRLR
 FFFBFFBLRR
 BFBFFFFRRL
 FBFFFBFRRR
 FBBFBFBRLL
 BBFBFBFLLL
 FFBBFFBRLR
 FFBFBBFLRL
 BFFBFFBRLL
 FFBBBBFRRR
 BFBFBBBRRR
 BBFFFBFLRL
 FBFFFBFRLR
 BBFBFFBRRR
 FBFBBBFLRL
 FBFFFFBLRL
 FFFBFBBLRR
 FFFBBBBRLL
 FFBFBFBRLL
 FBFBBFBLRR
 BFFFFBBRLL
 FBFBBBBRLL
 FFBBFFBRRL
 FFBBFFBLRR
 FBBFBBFLLL
 BFFBFBFRRL
 FFFBBBBLRL
 FBBFFFBLLL
 FFBFBFBLLR
 BFBBBBFRLR
 BFFFBFFRLR
 FBBFBBBRLL
 FFBFBBFRLR
 FFBFFFBLLR
 FFFBBFFLRR
 FBFBFFBRLR
 BFFFFBBRLR
 FFFFBBBRLR
 BFBFFFBLLR
 FFFBBBFRRL
 FBBFFBFLRR
 BFBFBFBLLR
 FFFBFFBLRL
 FBBFBBBLRL
 FFFBFFBLLR
 BFBFFFBLRL
 FFFBFBFLRL
 FBFBBFBLRL
 FBFBBFBRRR
 BFBFBFBLRL
 BFBFBBBLRL
 BFFBFBFLRL
 FFFBBFFRLR
 BBFBBBBLLR
 FFBFBFFRRL
 BBFFFFFRLR
 FFBFFFBRLR
 FBBFBFFRRR
 FFBBFFBLRL
 FFBBBBBLLL
 BFBBBBBRRL
 BBFFFFFRRL
 BBFBBFFRRL
 FFBFBBFRRL
 FFBBFBFRRR
 FFBBBBFLRR
 FBFBFFBLLR
 BBFBBBBLLL
 FBFFFBBRRR
 BFBFBBFLRL
 BBFBFFBLRL
 FFBBBBBLRR
 BFFBBBBLLL
 BBFBBFFLRL
 FFBBBBBRLL
 FFBFFBFRRL
 BFFFFFFLRL
 FBFFBFFLRR
 BFFBBFFLLR
 FBFFBBFLLL
 BBFBBBBLRL
 FBFBBBFRLR
 BFFFFFFLLR
 FBBFFBFLLL
 FBBBBFFRLL
 FBBBBFBRRR
 BFBFFFFLLR
 BFBFBBBRLL
 FBBFBBBRLR
 BFBFFBBLRR
 FBBBFBBRRR
 FBBFBFFLLR
 BFFBBFBRRL
 BFBFBBFRRR
 FBFBBFBLLR
 FBFFBFBLRL
 FBFFFFBRRL
 FBFBFFFRRR
 BFFFBFFRRR
 FBBFBBBLLR
 FFFFBBBRLL
 BFBFFBFLLL
 FBBFBFFLRR
 FBBBBBBRLL
 FFBBBFFRLR
 FFBBFFFRRL
 BBFBBFFLLR
 FBBFFFFRLL
 BFBFBFBRRL
 FBFFFBFLLL
 FFBFFBBLLL
 BFFBBFBRLR
 FFFBFBBLRL
 BFBBFFBRRR
 FBFFBFBRRR
 BFBFBBFRRL
 FBBBFBBLLL
 BBFBFBFRRL
 BFFBFBBRRL
 BBFBBBFLLL
 FFFBFFBRLR
 BFFFBBBLRR
 FBFFFFBLLL
 FFFBBBFRLL
 FBFBBFFLRR
 FBFBFFFLLL
 BFBFBFFRLL
 FBFBBFFRRL
 FBBBBBBLLR
 BFBFBFFRRR
 FBFFBBBLRR
 FBFFBFFRLR
 FBFBBBBLRR
 BBFFBFBLRL
 FBBFBFFRLR
 FBBFFFBLRR
 BFBFBFFRRL
 """.trimIndent().split("\n")
}