import java.util.Scanner

fun main() {
    var reader = Scanner(System.`in`)
    println("Enter room temperature :")
    var temperature = reader.nextDouble()

    if (temperature < 25) {
        println("It is cold")
    }
    else if (temperature > 40) {
        println("You are in hell")
    }
    else {
        println("It is hot")
    }


    println("enter age : ")

    var age = readLine()
    println("Tu as $age ans"  )

    //

    println("------------")

    var ki = 27
    var ka = 28

   val ku= if ( ki > 30) {
        "eyida"
    }
    else if ( ka < 24)
    {
        "ettywgdvgdh"
    }
    else {
        "ooototot"
    }
     println(ku)

    println("---------")

    println("Enter the day of the week:")
    var day = readLine()!!.toInt()
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



