

fun main () {

    //Index : 0|1|2|3|4|5|...

    var monTableau1 = arrayOf<String>("Francy","Aluma","Maikandi","Mabia","Jean")
    var monTableau2 = arrayOf("JP",1,"CEO",8.9,"Full") // ceci est moche
    var monTableau3 = intArrayOf(5,7,8,9,36) // Cest pour dire que le array est compose des Int uniquement


    monTableau1[2] = "Maurice"
    for ( beau in monTableau2 ) {
        println(beau)
    }
    println()

    for (index in 0..monTableau3.lastIndex ) {

        println(monTableau3[index])
    }

    for ( ( index, nom )in monTableau1.withIndex()) {

        println( "case : $index => $nom")

    }

    println()










}