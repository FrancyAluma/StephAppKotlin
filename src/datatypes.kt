fun main() {

    var firstnumber:Int = 78
    var mynumber:Double = 1.23
    var myletter: Char = 'c'
    var school : String = "eMobilis"
    var isKotlinInteresting:Boolean = true

    println(firstnumber)
    println(mynumber)
    println(myletter)
    println(school)
    println(isKotlinInteresting)

    //Typecasting
    /* is the process of converting
     a datatype into another
     */
    var num = 89
    var x = num.toDouble()
    println(x)

    var ot =34.8
    var ob = ot.toInt()
    println(ob)


    var res = false
    var pel = res.toString()
    println(pel)

    // Tu ne peux pas convertir un String en Chararter et Vice versa
    var kw = 'k'
    var kb = kw.toString()
    println(kb)




}