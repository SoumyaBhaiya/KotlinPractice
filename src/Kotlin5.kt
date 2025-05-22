fun Greet(greetings: String = "hello ", names: String = "Boo" ){ //notice that when we used '='
                                                                // we have provided a default value
        println("$greetings $names, How are you?")

}


fun main(){
    println("Starting...")
    Greet(names = "henna", greetings = "hey") // notice that here, the argument position were changed. but
    // we explicitly defined names and greetings so it worked.

    for (i in 1..5) { // .. is used to define the range.
        println(i)
    }

    var i = 1
    while (i <= 5) {
        println(i)
        i++
    }

    //Calling the Class Person here.

    val person = Person("Nate", "Gregg")
    person.lastName
    person.firstName // see we can access the properties here.
    println(person.lastName)


}


