fun main() {
//     general function
    println(getIdentity("Fangki", "Laki-Laki", 17))
    println(getIdentity(gender =  "Laki-Laki", name = "Fangki"))
    
//     using vararg
    sumNumbers(1,2,3,4,5)
    showScore("Fangki",1,2,3,4,5,6,7,8,9)

}

// general function
fun getIdentity(name: String, gender: String, age: Int = 20): String {
    return "$name, $gender is $age years"
}

// using vararg

fun sumNumbers(vararg num: Int) {
    println(num.sum())
    println(num.size)
}

fun showScore(name: String, vararg num: Int){
    print("The student $name has scored ")
    println(num.sum())
}