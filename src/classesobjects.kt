class Person {

    //Attributes/Properties
    var name = "Kevin"
    var age = 25
    var location = "Nairobi"

    // Behaviour / Methods /Functions
    fun walk(){
        println("$name is walking")
    }

}


fun main() {

    val doctor = Person()
    println(doctor.age)
    println(doctor.name)
    println(doctor.location)
    doctor.walk()


}