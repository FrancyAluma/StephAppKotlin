import java.util.Scanner

fun main() {

    println("Entrez votre age:")
    var lilo = readLine()!!.toInt()
    var loli = when (lilo) {

        in 1..11 -> "Vou etes un enfant"
        in 12..17 -> "Vou etes un teenager"
        in 18..50 -> "Vou etes un Adulte"
        in 51..100 -> "Vou etes un ancetre"
        else -> " Oza Mukuuliii"
    }
    println(loli)
    println()

    println("Enter gender :")
    var genre = readLine()!!
    var sex = when(genre) {
        "M" -> "Tu es un Male"
        "F" -> "Tu es une Female"
        else -> "Unkown"
    }
    println(sex)

    println()

    println("Entrez le nom de votre Artiste au Nigeria :")
    var artist = readLine()!!
    when(artist) {
        "Burna" -> println("The Goat")
        "Wizkid" -> println("The Bro")
        "Davido" -> println("The Popular")
        "Seyi" -> println("The streets")
        "Rema" -> println("The releve")
        else -> println("il n'est pas connu")
    }



    var kel = "S"
    when(kel){
        "S" -> println("Seyi vibez")
        "R"-> println("Rotimi")
        else->{
            println("Burna")
        }
    }

    println("Entre ton age:")
    var age = readLine()!!.toInt()
    var mbula = when(age) {
         in 0..17-> "Tu es un enfant"
        in 18..24-> "Tu es un Adulte"
        else-> "oza koko"
    }
    println(mbula)

    var read = Scanner(System.`in`)
    print("Enter day of week :")

    var day = read.nextInt()
    var result = when(day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid "

    }
    println("The day i $result")

    println("------")



}