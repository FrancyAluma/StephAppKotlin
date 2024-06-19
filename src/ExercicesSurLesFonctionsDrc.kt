fun main () {

    var eleve1 = exetat("Francy",71)
    println("Ecole Malula: $eleve1")

    println("Ecole CNDA: ${exetat("Ben",61)} ")

    var vrai = anniv()
    println(vrai)

    var risk = alphabet()
    println(risk)


    println("Etrez l'Etat du climat(chaud,froid ou tempere):")
    var climat = readLine()!!
    println("Etrez la temperature:")
    var temp = readLine()!!.toInt()
    var genie =  meteo(climat,temp)
    println(genie)

}

fun exetat(nom:String , percent : Int): String {

    var ecole = "L'eleve $nom a fait $percent %"
    return ecole

}

fun anniv () : String {

    println("Entrez le mois de votre anniverssaire:")
    var jr = readLine()!!.toInt()
    var rezus = when(jr) {
         1-> "Janvier"
         2-> "Fevrier"
         3-> "Mars"
         4-> "Avril"
         5-> "May"
         6-> "Juin"
         7-> "Juillet"
         8-> "Aout"
         9-> "Septmbre"
         10-> "Octobre"
         11-> "Novembre"
         12-> "Decembre"
        else -> "Mois Inexistant"
    }
   return (rezus)
}

fun alphabet () : Int  {

    println("Entrez une lettre d'alphabet:")
    var lettre = readLine()!!
    var place = when(lettre) {
        "a" -> 1
        "b" -> 2
        "c" -> 3
        "d" -> 4
        "e" -> 5
        "f" -> 6
        "g" -> 7
        "h" -> 8
        "i" -> 9
        "j" -> 10
        "k" -> 11
        "l" -> 12
        "m" -> 13
        "n" -> 14
        "o" -> 15
        "p" -> 16
        "q" -> 17
        "r" -> 18
        "s" -> 19
        "t" -> 20
        "u" -> 21
        "v" -> 22
        "w" -> 23
        "x" -> 24
        "y" -> 25
        "z" -> 26
        else ->27  // parce que l'on a dit que ca va retourner un Int, mm la condition "else" doit aussi etre un Int
    }
  return (place)

}

fun meteo ( climat:String, temp : Int) : String  {

    var okay = if ( climat == "chaud" && temp > 28  ) "il fait vraiment chaud"
     else if (climat == "froid" && temp < 20) "il fait vraiment froid"
     else if (climat == "tempere" && temp == 23) "il fait beau"
    else "mobulu"
    return (okay)



}