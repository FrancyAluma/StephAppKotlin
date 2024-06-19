
fun main () {
    val mokoloo1 = Mokoloo ("Yvon", 37)
    mokoloo1.marcher() // parce que c'est la classe enfant de "Mutu", ca herite aussi de ses fonctions
    mokoloo1.enseigner()
    println()
    val muanaa1 = Muanaa("Prielle",4)
    muanaa1.marcher() // on a le droit pck "Mutu" est son parent et ca herite cette fonction de son parent
    muanaa1.fraisScolaires()
}


abstract class Mutuu ( nkombo:String , mbula: Int){
    init {
        println("Mon nom:$nkombo \nAge :$mbula ")
    }
    abstract fun marcher ()

    protected fun manger (){ // ne va etre utulisee que dans les (super.manger())

        println("Entrain de manger ")
    }

}

class Mokoloo ( var nkombo : String, mbula :Int) : Mutu(nkombo,mbula){

    fun enseigner () {
        println("Entrain d'enseigner")
    }

    override fun marcher() {
        println("L'enseignant $nkombo marche")
    }

}

class Muanaa (val nkombo : String, mbula :Int) : Mutu(nkombo,mbula) {


    override fun marcher() {
        super.manger()
        println("L'enfant $nkombo marche")
    }
    fun fraisScolaires () {

        println("Dois payer les frais Scolaires")
        println()
    }

}