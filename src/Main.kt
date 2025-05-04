/*fun main(){
    println("First Kotlin here! ")
}
*/

val NAME: String = "Nateee"
var greeting: String? = null

// Types in kotlin are non null by default.
fun main() {
    val name: String = "Nate" // val cannot be updated
    // var can be updated

    var Name: String = "Nate"
    println(name)

    Name = "Blue"
    println(Name)
    // Name and name are local variable
    print(greeting)
}

val color: String = "Red"
//this is a top level variable (cause its outside the fun)
