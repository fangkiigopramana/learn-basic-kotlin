// membuat data class
data class DataUser(val name : String, val age : Int)

fun main() {
    // membuat object yang berisi data class beserta parameter
    val user1 = DataUser("Asep", 16)
    println(user1)

    // komparasi 2 object dengan .equals()
    val user2 = DataUser("Ahmad", 18)
    val user3 = DataUser("Asep", 16)

    // menyalin user1 ke user4
    val user4 = user1.copy()
    val user5 = user1.copy(age = 30)

    // Destructuring declaration
    val name = user1.component1()






    println(name)
    // println(user1.equals(user2))
    // println(user1.equals(user3))
    // println(user4)
    // println(user5)
}