// Il faut savoir qu'on a :
fun main () {

// 1. les Immutables listes(qu'on n'utulise pas vraiment) :
    // Dans cette liste, on n'ajoute rien
    var listNoms = listOf< String > ("Jake","Logan","Paul","Mike")

    for (noms in listNoms) {
        println(noms)
    }

    println()

   /* On a aussi:
   -les MAp:
   mapof()

    et -les Set:
    setof()

    */
// 2. Les Mutables Listes(Qu'on utulisera beaucoup plus souvent) :

    var mutableNoms = mutableListOf<String>("Janko", "Andrew", "Tristan", "Tate","Sneako")


    println("La taille de cette liste est : ${mutableNoms.size}")
    mutableNoms.add("Abba")
    mutableNoms.add(1,"Candace")
    println("La taille de cette liste est : ${mutableNoms.size}")
    mutableNoms.remove("Tate")
    println("La taille de cette liste est : ${mutableNoms.size}")
    mutableNoms.removeAt(4)
    println("La taille de cette liste est : ${mutableNoms.size}")

    mutableNoms.add(listNoms[0])
    mutableNoms.add(listNoms[1])
    mutableNoms.addAll(listNoms)
    println("La taille de cette liste est : ${mutableNoms.size}")
    mutableNoms.addAll(0,listNoms)

    for (name in mutableNoms){
       println(name)
    }
   println()

    val petitsnoms = mutableNoms.subList(0,5)

    for (index in 0..petitsnoms.lastIndex) {
        println(petitsnoms[index])

    }

    println()
    var chiffres = mutableListOf <Int> ()

    chiffres.add(0,12)
    chiffres.add(13)
    chiffres.add(14)
    chiffres.add(15)
    chiffres.add(16)

    for ((index,chif) in chiffres.withIndex())  {
        println("$index => $chif")
    }

    if (19 in chiffres) {
        println("It does exist")
    }
    else println("toyebi yo te")

}