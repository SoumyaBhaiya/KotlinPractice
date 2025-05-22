class Person(_firstName:String, _lastName: String){
    val firstName: String = _firstName
    val lastName: String = _lastName
}

// Now notice that here, we have first created a class, then defined a parameter and then defined the parameter

//a cleaner way to do this is by either using an init box:
/*
init{
    firstName = _firstName
    lastName = _lastname

}
*/

// OR  we can just defined the parameter in class where the parameteres are,
// like class Person (val firstname :String, val lastname:String )

