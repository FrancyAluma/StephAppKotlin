fun main() {

    var languages = arrayOf("Kotlin","Python","Java")
    println(languages[1])


    //Reassinging a value
    languages[1]="PHP"
    println(languages[1])

    //looping through an array
    for (lang in languages) {
        println(lang)
    }

    if("Kotlin" in languages) {
        println("It exists")
    }
    else {
        println("Does not exist")
    }
}