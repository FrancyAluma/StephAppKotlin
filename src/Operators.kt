import java.util.Scanner

fun main() {
    //Arithmetic Operators

    var num1 = 45
    var num2 = 34
    println(num1 + num2)
    println(num1 - num2)
    println(num1 * num2)
    println(num1 / num2)
    println(num1 % num2)

    //Comparison Operators

    println(num1 < num2)
    println(num1 > num2)
    println(num1 <= num2)
    println(num1 >= num2)
    println(num1 == num2) // Equal to
    println(num1 != num2) // Not equal to

    // logic operators

    println(num1 < num2 && num1 != num2)
    println(num1 < num2 || num1 != num2)
    println(!(num1 < num2 || num1 != num2))

    // Assignment Operaators

    var x = 34
    x += 2
    println(x)

    var y = 15
    y %= 4
    println(y)

    println("---------")

    var p = Scanner(System.`in`)
    println("Enter the day of the week:")
    var day = p.nextInt()

val jour = if ( day == 1) {
    println("Tata,")
        "C'est Lundi"
    }
    else if (day == 2){
        "C'est Mardi"
    }
    else if (day == 3 ){
        "C'est Mercredi"
    }
    else( "Invalid" )

        println( jour)
}