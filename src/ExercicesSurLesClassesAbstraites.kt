
abstract class Forme ()  {

    abstract var color : String

    init {
        color = "Blanc"
    }
    abstract fun dessiner ()
    abstract fun colorer ()


    open fun test () {
        println("Ceci est une fonction non abstraite")
    }
}

class Cercle ( override var color : String ) : Forme (){

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

class Rectangle : Forme () {

    override var color: String
        get() = "Rouge"
        set( rouge) {}

    override fun dessiner() {
        println( "Dessiner un rectangle")
    }

    override fun colorer() {
        println("Colorer Ce rectangle en $color")
    }

}
fun main () {

    val cercle = Cercle("Jaune")
    cercle.dessiner()
    cercle.colorer()
    cercle.test()
    println()
    val cercle2 = Cercle("Bleu")
    cercle2.dessiner()
    cercle2.colorer()
    println()
    val rectangle = Rectangle()
     rectangle.dessiner()
    rectangle.colorer()
    rectangle.test()


}