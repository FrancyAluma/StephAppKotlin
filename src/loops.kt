fun main() {
    // While loop
    var number = 6
    while(number <= 10) {
        println("Number is $number")
        number +=1
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

    // For loop
    var furniture = arrayOf("Table","Chair","Desk")
    for(y in furniture) {
        println(y)
    }

    var max = arrayOf(90,80,70,85)
    for (x in max){
        println("vrai is $x")
    }
    // Range

    for (letter in 'a'..'d')
        println(letter)
    for ( num in 5..10) {
        println("Num is $num")
    }

}