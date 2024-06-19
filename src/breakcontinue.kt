fun main() {
    //Break statement

    for (number in 34..39) {
        if (number == 37) {
            break
        }
    println(number)
    }

 var fam = arrayOf("bon","mov","hun","job","kol")
    for ( kid in fam){
        if(kid == "hun"){
            break
        }
        println(kid)

    }

// eza juste exercice kosa leka sur ndeti kaka ba array
    for (kid in 0..fam.lastIndex) {
        println( " kombo est ${fam[kid]} ")
    }  // ou carrement tosali yango :
    for (kid in fam){
        println(kid)
    }




    //Continue Statement
    for (characters in 'd'..'h') {
        if (characters == 'f'){
            continue
        }
        println("Cherie is $characters")
    }

    // Exercices sur les Break and Continue

    for( kool in 4..20 step 3 ) {
        println(kool) // ca va ajouter de 7
    }
    for (cool in 30 downTo 20 step 2) {
        println(cool) // ca va soustraire de 2 jusqu'a arriver a 20
    }

}