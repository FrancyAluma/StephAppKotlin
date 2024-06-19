class Eleves (var nom: String , var niveau : String , var age: Int? = null ) {

    var pourcent : Double = 0.0
    constructor(nom: String, niveau: String, age: Int?, pourcent : Double ): this(nom, niveau,age){
        this.pourcent = pourcent
    }

    fun brillant ( complim: String = "Et Vous etes aussi intelligent") {

        if (pourcent > 60.0 )
            println(complim)
    }
  fun infos ( action: String = "courir", apres: String = "marcher" ) {
      println("Nom : $nom")
      println("Niveau : $niveau")

      if (age != null) {
      println("Vous avez $age ans")

      println("$nom , vous pouvez $action")}
      else {
          println("$nom , vous pouvez $apres ")
      }

  }

}

fun main () {

     val eleve1 = Eleves("Nkuyi","1erSec",age = null,78.4)
     eleve1.infos()
     eleve1.brillant()
     println()

    val eleve2 = Eleves("Mabongi","1erSec", 7)
     eleve2.infos()
    println()

    val eleve3 = Eleves("Aluma", "1erSec",13,90.7)
    eleve3.infos()
    eleve3.brillant()
    println()

    println(eleve1.nom)

}