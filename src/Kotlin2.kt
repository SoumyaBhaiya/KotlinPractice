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
}