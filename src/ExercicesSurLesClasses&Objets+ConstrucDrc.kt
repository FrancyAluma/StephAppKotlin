class Quotient (num:Double , den : Double ) {

    var numerateur : Double
    var denominateur : Double =0.0
        get() = field
        set(value) {
            if (value == 0.0) {
                println("le Denominateur ne peut pas etre zero ")
            }
            else {
                field = value
            }

        }
    init {
        numerateur = num
        denominateur = den
    }

    constructor ( ratioDe:Double ) : this (ratioDe,100.0)
         // on a aussi donner aux parametres "num et den", la valeur "ratioDe" et "100.0"

   private fun calculer () : Double { // on l'a rendue private tout simplement pck elle ne sera utilisee que par la fonction afficher
        return(numerateur/denominateur)
    }
    fun afficher () {

        println(" le resultat de $numerateur par $denominateur est ${calculer()} ")

    }
}

fun main () {

    val ink = Quotient(5.8,0.0)
    var ooo= Quotient(16.0)
    ooo.afficher()
    var kui = Quotient (12.0,3.0)
    kui.afficher()
    var lens = Quotient(9.0,3.0)
    lens.afficher()





}