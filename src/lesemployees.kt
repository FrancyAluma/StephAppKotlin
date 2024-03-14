class Employe (var firstame:String, var salary:Double, var position:String){

    fun role(task:String){
        println("The role is $task")
    }
}

fun main() {
    var employee1 = Employe("John", 1205566.4558, "Managing Director")
    var employee2 = Employe("Faith", 132567.8883, "Directrice")
    var employee3 = Employe("Bee", 332526.267747, "Assitante")

    println(employee2.salary)
    println("Employee3 is the ${employee3.position}")
    employee3.role("accounting")

}