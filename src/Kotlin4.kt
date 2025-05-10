// Kotlin as collection data types, which are lists, arrays, maps


fun aSimpleGreet(greet: String, items: List<String>){
    items.forEach { item ->
        println("$greet, $item")
    }
}


// A Simple vararg use.


fun greetNames(greet: String, vararg names:String){
    names.forEach { name ->
        println("$greet $name, How are you doing today?")
    }
}



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

    val maxIntegerValue: Int = Int.MAX_VALUE
    val minIntegerValue: Int = Int.MIN_VALUE

    println("maximum value of integer is: $maxIntegerValue")
    println("minimum value of integer is: $minIntegerValue")

    val anotherArray = arrayOf("Dice", "Rubber", "Pencil", "Table", "Chair")

    if ("Dice" in anotherArray){
        println("Yes")
    }

    anotherArray.forEachIndexed {index, i ->
        println("This item: $i is in this index: $index")
    }
    println(interestingThings.get(1))

// Similarly you can also use listOf instead of arrayOf to create lists

    //Another collection type: Maps

    val map = mapOf(1 to "a", 2 to "b", 3 to "c") //it's like a key value pair
    map.forEach { key, value ->
        println("This is key: $key, this is value: $value")
    }

    // By default the collection type in python is IMMUTABLE

    //if we want mutable list, we need to use mutableListOf, mutableMapOf


    //Examples:

    val mutablelist = mutableListOf("Car", "Cat", "Dog")
    // now adding the value
    mutablelist.add("Here goes another value")
    println(mutablelist)
    println(mutablelist.forEach { i -> println(i) })

    //now mutables maps

    val mutablemaps = mutableMapOf("A" to 1, "B" to 2, "C" to 3)

    mutablemaps.put(key = "D", value = 4)

    println(mutablemaps)
    println(mutablemaps.forEach{index, value ->
        println("Index $index, value $value")
    })

    aSimpleGreet("Hey", mutablelist)

    greetNames("Hello", "Cindy", "Melani")
    greetNames("Hey", *interestingThings) // now the thing with vararg is you won't be able to pass
    //an array cause its only taking strings now. so to change that you need to add '*' and variable.

}

