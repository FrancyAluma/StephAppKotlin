fun main() {

    var greeting = "Hello world"
    var firstname = "francy"
    var lastname = "eMobilis"


    println(firstname + " "+ lastname) // string concatenation: combination of strings
    println(firstname.plus(lastname). plus(" "). plus(greeting))

    println(greeting[6]) // Accessing an element in a string
    println(greeting.indexOf("world"))
    println(firstname.toUpperCase())

    println("Hello there.My name is $firstname")// string interpolation
}