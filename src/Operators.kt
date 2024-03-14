fun main() {
    //Arithmetic Operators

    var num1 = 45
    var num2 = 34
    println(num1 + num2)
    println(num1 - num2)
    println(num1 * num2)
    println(num1 / num2)
    println(num1 % num2)

    //Comparison Operators

    println(num1 < num2)
    println(num1 > num2)
    println(num1 <= num2)
    println(num1 >= num2)
    println(num1 == num2) // Equal to
    println(num1 != num2) // Not equal to

    // logic operators

    println(num1 < num2 && num1 != num2)
    println(num1 < num2 || num1 != num2)
    println(!(num1 < num2 || num1 != num2))

    // Assignment Operaators

    var x = 34
    x += 2
    println(x)

    var y = 15
    y %= 4
    println(y)


}