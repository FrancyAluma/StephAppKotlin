
fun main () {

    val mutu = Mutu("Georges",23)
    mutu.marcher()
    println()
    val mokolo1 = Mokolo ("Yvon", 37)
    mokolo1.marcher() // parce que c'est la classe enfant de "Mutu", ca herite aussi de ses fonctions
    mokolo1.enseigner()
    val muana1 = Muana("Prielle",4)
    muana1.marcher() // on a le droit pck "Mutu" est son parent et ca herite cette fonction de son parent
    muana1.fraisScolaires()
}


open class Mutu ( nkombo:String , mbula: Int){
     init {
         println("Mon nom:$nkombo \nAge :$mbula ")
     }

    open fun marcher () {

        println("Entrain de marcher ")

    }


    protected fun manger (){ // ne va etre utulisee que dans les (super.manger())

        println("Entrain de manger ")

    }




}

class Mokolo ( var nkombo : String, mbula :Int) : Mutu(nkombo,mbula){

    fun enseigner () {
        println("Entrain d'enseigner")
    }

    override fun marcher() {
        super.manger()  /* ca a appele ET "manger" , et la nouvelle valeur de "marcher"
 ca va donner la meme chose si dans (super.manger()), c'etait (super.marcherr()).
  ca allait d'abord afficher la premiere valeur de "fun marcher" et ensuite la nouvelle valeur */
        println("L'enseignant $nkombo marche bien")
    }


}

class Muana (nkombo : String, mbula :Int) : Mutu(nkombo,mbula) {


    fun fraisScolaires () {

        println("Dois payer les frais Scolaires")
        println()
    }

}