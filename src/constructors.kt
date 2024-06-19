class Dog(var name:String, var breed:String,var age:Int, var weight:Int) {

    fun move(movement:String) {
        println("$name is $movement")

    }
}

fun main() {
    val dog1 = Dog("Bill","Chiwawa",3,25)
    var dog2 = Dog("Tito","German shepherd",5,50)

    println(dog1.name)
    dog1.move("walking")

    println(dog2.name)
    dog2.move("running")

    println( "${dog2.name} pese  ${dog2.weight} kgs et c'est ${dog2.breed} ")


}