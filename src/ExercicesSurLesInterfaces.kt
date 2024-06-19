// Une interface st un ensemble des attributs et des fonctions abstracts


interface Form  {

     var color : String
    fun dessiner ()
    abstract fun colorer ()


    fun test () {
        println("Ceci est une fonction non abstraite")
    }


}

class Circle (override var color : String ) : Form {

    override fun dessiner() {
        println( "Dessiner un Cercle")
    }

    override fun colorer() {
        println("Colorer Ce Cercle en $color")
    }

    override fun test () {
        super.test()
        println("Merci de la comprehension")
    }
}

interface Rectanglee  {

    fun Airdu4cotes ()

}

class Carre () : Form , Rectanglee {

    override var color : String = "Orange"

   override fun dessiner (){
       println( "Dessiner un Carre")
   }
   override  fun colorer () {
       println( "Colorer Ce Carre en $color")
   }


    override fun Airdu4cotes () {
        println("Calculer L'Aire")
    }
}
fun main () {

    val cercle = Circle("Jaune")
    cercle.dessiner()
    cercle.colorer()
    cercle.test()
    println()
    val cercle2 = Circle("Bleu")
    cercle2.dessiner()
    cercle2.colorer()
    println()

    val carre = Carre()
    carre.Airdu4cotes()
    carre.colorer()
    carre.dessiner()
    carre.test()


}