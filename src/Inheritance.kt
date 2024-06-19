//Parent class/Super class/Base class
open class Animals{
    var age = 13
    var gender ="Male"

    fun move(movement : String) {
        println("Animal is $movement")
    }

}

//Child class/subclass/ Derived class

open class Duck: Animals (){
    var isMamma =true
    var color = "white"

     fun sound() {
         println("The duck is quacking")
     }
}

class Fish:Duck() {
    var hasScales = true
    var hasFins = true

    fun eat(){
        println("Fish is eating")
    }
}

fun main() {
    var a = Animals()

    println(a.age)

    var d = Duck()
d.move("swimming")

    println(d.isMamma)

    var f = Fish()
    f.eat()
}