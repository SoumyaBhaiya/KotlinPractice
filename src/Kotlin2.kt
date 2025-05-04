// if we only want to pring out a value of greeting if  it's not null then.


val naame = "nate"
var Greeting: String? = null
// learning control flow. if and else statements

/*
fun main() {
    if (Greeting != null) {
        println(Greeting)
    } else {
        println("hi")
    }

    println(naame)

}
 */


fun main(){
    // using when now. instead of if and else

    Greeting = "Hello" // Updated  the value of greeting so its no longer null. now Hello will be printed
    when (Greeting){
        null -> println("Hi")
        else -> println("Greeting")

    }
    val greetingToPrint = if(Greeting != null) Greeting else "HIII" // Greeting is Hello (declared above, so it won't print HIII)
    println(greetingToPrint)

    // can also use a when block inside the variable
    val gretoPrint = when(Greeting){
        null -> "Hii"
        else -> Greeting
    }
    println(gretoPrint)
}

