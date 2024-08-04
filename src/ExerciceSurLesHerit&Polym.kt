open class Personne (var name: String , var surname: String , var height: Double ) {

    open fun detailsPerson () {
        println("Votre Nom : $name")
        println("Votre Postnom : $surname")
        println("Votre taille : $height")

        if (height < 170.0){
            println("Vous etes court")
        }
        else {
           println("Vous etes elance")
        }

    }

}

/* Jettez un coup d'oeil sur le constructor dans ExercicesSurlesClassetConstruc
 (C'est A peu pres la meme procedure sauf qu'on insere (var) a la nouvelle variable que nous declarons ou  voulons ajouter  ) */
open class Etudiant ( name: String ,
                 surname: String ,
                 height: Double,
                 var age : Int) : Personne (name, surname, height) {

    open override fun detailsPerson () {

        super.detailsPerson()
        println("Votre age : $age")


    }



class Enseignant(
    name: String ,
    surname: String ,
    height: Double,
    age : Int,
    var salaire: String
): Etudiant(name, surname,height,age) {


    fun detailsEnseignant (Qualite : String) {
        super.detailsPerson()
        println("Votre salaire : $salaire")
        println("Mr $name ,Vous etes un $Qualite professeur ")

    }

}

}

fun main () {

    val personne1 = Personne("Christian","Mabia",178.5)
    personne1.detailsPerson()
    println()
    val etudiant1 = Etudiant("George", " Masebi",180.8,23)
    etudiant1.detailsPerson()
    println()
    val enseignant1 = Etudiant.Enseignant ("Midipe", "Agbalu",165.9,45,"$5000")
   enseignant1.detailsEnseignant("bon")



}