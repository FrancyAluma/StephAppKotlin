import java.util.Scanner

fun main () {


    // To pass a function within a function avec la function [foo]

    foo( bar = {
      //  println(" WhatsApp LLC ")
    } )

    foo( bar = {
       // println(" Instagram Inc ")
    } )

    foo() {
      //  println("Snap Inc")
    }
    foo() {}


    // Function oneValue
   val one = oneValue(9)
       println(one) // ou on peut l'imprimer de cette maniere : println(oneValue(9))

// Function twoValues et threeValues
    val (v1,v2) = twoValues()
    println("$v1 a $v2 ans")

    val(t1,t2,t3) = threeValues()
    println("$t1 a $t2 ans : $t3")

    // Retournez une |function single| le Debut : PLus des details? Voir  la function(pauline)
  var maman = pauline("Engada", 90) /* Ca c'est commment retourner une function avec " return".
 (il faut toujours definier les parametres comme etant "String" mm s'il y a un "Int") sauf si la variable
 que vous voulez retourer est un "String" pour que l'operation soit executable .
 si c'est un "Int" alors definissez les parametres comme etant "Int" */
    println("la personne qui s'appelle $maman") // ou ca peut aussi se faire de la maniere  suivante:
    println("la personne qui s'appelle ${pauline("Michel",50)}")

    // Retournez une function Fin
    println()


// Function somme ( Comprehension generale)
    var num1 = 4
    var num2 = 8
    println(num1)// ceci est une variable dans la main function
    println(num2)// ceci aussi est une variable dans la main function
    println()
    somme(2,5) /* par contre 2 et 5 sont des arguments des
     parametres num1 et num2 de la function somme */
    println()

    // Function booker
    booker()
    println()

    // Function durant
    val suns = durant(25)
    println(suns)
    durant(16)
    println()
    // Function libota
    libota("Francy",28)
    libota("George",23)
    libota ("Steph",26)
    println()
    // Function primaire
    primaire("Giovanni",age=15)
    primaire("Sandra")
    primaire("Ethan")
    primaire("Merveille")
    println()
    // Function librairie
    librarie("Aluma")
    librarie("Kate")
    println()

    // Function details
    println("Entre votre nom:")
    var nom = readLine()!!
    println("Entre votre prenom:")
    var prenom = readLine()!!
    println("Entre votre age:")
    var age = readLine()!!.toInt()
    details(nom,prenom,age) /*Ici en matchant les parametres  avec ces variables, nous disons au programme
    que les variables sont jumeaux des parametress et que les arguments ne sont pas obligatoires a faire
    entrer.
    */

//----------//

}

// Retournez une function avec multiple values

fun oneValue ( n:Int):Int {
    return n+5
} /* ou on peut faire
 fun oneValue (n : Int) :Int = n+5 // pour les fonctions A une valeur
*/
fun twoValues () : Pair<String,Int> = Pair ("Bosco",65) // tu pux aussi ecrire de la maniere-ci:---->>>
fun threeValues (): Triple<String,Int,Boolean> {

    return Triple("Yannick", 32,true)
}
fun pauline ( bebe: String , mokili: Int) : String {

    var enfant = "$bebe a $mokili ans"  /* C'est un String et c'est pkw
     les parametres sont aussi defini comme "String" */
    return enfant
// l'execution se fera dans la main function
}

fun libota (Nom: String, Age : Int) {

    println("$Nom est de la famille et il a $Age ans")
}

fun primaire(Name:String, age: Int = 7)// Valeur par defaut
{

    if (age != 7) println("$Name , ceci n'est pas votre classe")
   else  println("$Name est en 1ere primaire et a $age ans")

}

fun librarie (nom:String){

   do {
       println("Entrez votre age:")
       var age = readLine()!!.toInt()
       if(age >= 18) {
           println("$nom,Bienvenue dans notre App ")
       }
       else {
           println(" $nom , Vous ne pouvez acceder au programme" + ""+
                   " Vous devez avoir au moins 18 ans" )

       }
   } while ( age < 18)
}

fun durant (koko: Int) {
    var c = 20
   if ( koko > c) {
       println( "Vous avez reussi l'examen")
   }
    else println("Pas de Chance Bro, A la prochaine")
}

fun booker () {
    println("Entrez votre jour de l'anniversaire :")
    var zoo = Scanner(System.`in`)
    var dayy = zoo.nextInt()
    var joie = when(dayy) {
        1-> " Pas votre annnivarssaire "
        2 -> " Pas votre anniverssaire"
        3 -> " Pas votre anniverssaire"
        4 -> " Joeux Anniversaire "
        5 -> " Pas votre anniverssaire"
        else -> "Aniversaire na yo eyebai te"
    }
    println(joie)
}

fun somme (num1:Int , num2 : Int){

    val sum = num1 + num2
    println("la somme de $num1 + $num2 = $sum")

}


fun details (nom:String, prenom: String , age: Int){

    println( "Votre nom est $nom")
    println("Et votre prenom est $prenom")
    println("Vous avez $age ans")
}

fun foo ( bar : () -> Unit) {

   // println(" CentChat App")

    bar()
}