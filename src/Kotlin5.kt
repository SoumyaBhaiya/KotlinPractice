fun Greet(greetings: String = "hello ", names: String = "Boo" ){ //notice that when we used '='
                                                                // we have provided a default value
        println("$greetings $names, How are you?")

}


fun main(){
    println("Starting...")
    Greet(names = "henna", greetings = "hey") // notice that here, the argument position were changed. but
    // we explicitly defined names and greetings so it worked.
}
// gonna start with learning classes now.
