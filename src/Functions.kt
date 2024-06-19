fun main() {
    // Predefined Functions/ Inbuilt library functions
    println("Hello kotlin")

    var x = Math.sqrt(169.0)
     println(x)

    var y = Math.round(56.78)
    println(y)

    var z = Math.min(34,89)
    println(z)

    var number = Math.max(123,567)
    println(number)

    // Calling a function( always write it inside the main function)
    name()
    sum()
    details("George", 20)
    famille("Pauline", 55.0)
    ver()
    famille("Bosco",65.0)

}

// User defined function

fun name() {
    println("Francy")
}

fun sum() {
    var number1 = 45
    var number2 = 60
    println(number1+number2)
}
fun ver () {
    println("Je vais bien ")
}

// Parameters  and arguments

fun details(name:String ,age:Int) {
    println("$name is $age years old")

}

fun famille ( kombo:String , mbula:Double ) {

    println("$kombo aza na $mbula ans")
}

