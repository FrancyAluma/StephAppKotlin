fun main() {

    var languages = arrayOf("Kotlin","Python","Java","HTML","CSS")
    println(languages[1])

    println("--------")

    for (indice in languages.indices ){
        println("language a l'indice $indice : ${languages[indice]}")
    }  // ou Ca peut se faire de la maniere suivante :

    for ((indice,lang) in languages.withIndex() ) {
        println("langila ya  $indice eza $lang")
    }

    println("--------")
// Immpresion A l'envers
    for (indice in languages.indices.reversed() ){
        println("language a l'indice $indice : ${languages[indice]}")
    }


    println("--------")
    // Array of numbers
    var numbers = arrayOf<Int>(12,48,80)
    println(numbers[2])


println(languages.contentToString())
    println(languages.indices)
    println(languages.indexOf("Java"))
    println(languages.size)




    //Reassinging a value
    languages[1]="PHP"
    println(languages[1])

    //looping through an array 1 and 2

    //1
    for (lang in languages) {
        println("le laguage: $lang")
    }

    //2
    if("Kotlin" in languages) {
        println("It exists")
    }
    else {
        println("Does not exist")
    }


}