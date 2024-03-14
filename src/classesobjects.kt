class Person {

    //Attributes/Properties
    var name = "Kevin"
    var age = 25
    var location = "Nairobi"

    // Behaviour / Methods /Functions
    fun walk(){
        println("Person is walking")
    }

}

fun main() {

    var doctor = Person()
    println(doctor.age)
    println(doctor.name)

    doctor.walk()

}