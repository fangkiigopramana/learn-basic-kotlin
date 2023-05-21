fun main() {
    // extension function
    println(100.plusTen())

    // extension properties
    println(10.duplicate)
    
    // nullable receiver
    val value: Int? = null
    val value1 = 19
    println(value.slice) // mengembalikan nilai 0, karena value = null
    println(value1.slice)
}

// extension function
fun Int.plusTen(): Int {
    return this + 10
}

// extension properties
val Int.duplicate: Int
	get() = this * 2


// nullable receiver, jika properties bernilai null, maka akan dikembalikan nilai null

val Int?.slice: Int
	get() = this?.div(2) ?:0


