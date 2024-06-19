fun main() {
    // While loop
    var number = 6
    while(number <= 10) {
        println("Number is $number")
        number += 1
    }

    var classe = 10
    while(classe <= 16) {
        println("$classe est un bon effectif")
        classe +=2

    }

    // Decrement
    var nm = 25
    while(nm >= 20) {
        println("count is $nm")
        nm--

    }


    // Do... While loop
    var counter= 100
    do{
        println("Number is $counter")
        counter++
    }while (counter <= 106)

    var clazze = 38
    do{
        println("Il aura $clazze")
        clazze-=3
    }while (clazze >=21)

    /// For loop
    var furniture = arrayOf("table","chair","desk")
    for(y in furniture) {
        println(y)
    }

    //Mettre les premieres lettres en Majuscule

    for (f in furniture) {
      val t =  f.replaceFirstChar { it.uppercase() }
        println(t)
    }
//
    var max = arrayOf(90,80,70,85)
    for (x in max){
        println("vrai is $x")
    }
    // forEach

    var mass = arrayOf(90,80,70,85)

    mass.forEach {
        println("yo oza $it")
    }

    // Range

    for (letter in 'a'..'d'){
        println("Bonjour la lettre $letter")
    }


    for ( num in 5..10) {
        println("Num is $num")
    }

    for ( num1 in 15 downTo 7 ) {
        println("Nuum is $num1")
    }
// Exercices sur les (While)
    var ko = 0
    var ki = 10

   while(ki != 3){
       ko = ko + ki
       println("le nombre est $ko")
       ki--
   }
    println("le nombre est $ko")

    println("-----------")
//Exercices sur les (Do... While)

    do{
        println("Entrez un age superieur a 18 : ")
        var age = readLine()!!.toInt()
        if(age > 18){
            println("Vous pouvez acceder au site")
        }
        else{
            println("vous ne pouvez pas acceder au site")
        }
    } while (age<18)

}