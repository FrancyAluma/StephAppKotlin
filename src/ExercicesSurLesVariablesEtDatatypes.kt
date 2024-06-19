
fun main () {

    var essay : Int = 7/8
    println("Essa donnera $essay") // ca n'affichera qu'un nombre entier parce que c'est du type Int
    println("Entrez votre nom:")
    var nom = readLine()!! // readline est par defaut du type String
    println ("Salut $nom")

    println("Entrez aussi votre age:")
    var age = readLine()!!.toInt()
    age = 25 // l'age qui s'affichera par defaut sera 25. Peu importe l'age que vous entrerez
    println("Vous avez aussi $age")

    println("===========")

    var num = 8
    num = 10
    num = num + 5
    println("num est $num")

    var num2 = 47
    num2 = (num2 - 3)
    println("num2 est $num2")

    var num3 = 22
    num3-- // ou (num3 = (num3-1)) c'est pour dire que la nouvelle valeur de num3 doit etre soustrait par 1
    println("num3 est $num3")
    num3 = num3 + 4 // la nouvelle valeur de num3 qui est 21, +4 = 5
    println("le nouveau num3 est $num3")
    num3++
    println("le num num est $num3") // CA sera 26
    println()
    val lala = 6+7*8/18-5
    println("le resultat est $lala")

}