import java.util.Scanner

fun main() {

    val y = Scanner(System.`in`)

    print("Enter a number: ")
    val num = y.nextInt()

    if (num % 2 == 0)
        println("$num is even")
    else
        println("$num is odd")
}