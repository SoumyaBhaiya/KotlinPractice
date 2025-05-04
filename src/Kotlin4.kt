// Kotlin as collection data types, which are lists, arrays, maps

fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Books")

    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))


    for (i in interestingThings) {
        println(i)
    } //this is how for loops also works in java. butt
    // kotlin also has another way which is

    interestingThings.forEach {it ->
        println(it)
    } //think of 'it' as just another i where we are storing the values in the array

}