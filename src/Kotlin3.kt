
// Defining one's own functions


fun getGreeting(): String {
    return "Hello Kotlin"
}

//Now calling that function in main() method.


//Unit is saying: this returns nothing useful.
fun sayHello(){//: Unit
    println(getGreeting())
}

//Creating a Single Expression Function

fun singleExpression(): String = "This is a single Expression function"
//notice there's no body. (the curly braces)

//Defining function parameters

fun yooo(itemToGreet: String){
    val msg = "hello" + itemToGreet
    println(msg)
}

//To make it more code efficient this can be also written as a single line function

fun yo(itemToGreet: String) = println("yooo $itemToGreet")


//greeting the names now.

fun greetName(GreetHere:String, NameHere:String) = println("$GreetHere $NameHere! How are you today?")

fun main() {
    println(getGreeting())
    sayHello()
    println(singleExpression())

    yooo("David")
    yo("Paapi")
    greetName("Helloo Mister", "David")
}

// Notice one thing here. these all are free functions or top level functions as they are not in any class
