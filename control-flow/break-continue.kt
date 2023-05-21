fun main() {
    val intList = listOf(1,2,3,4,null,5,null,6,7)
    for (i in intList) {
        if (i == 3) continue
        if (i !== null) print("$i ")
        if (i == null) break
    }
}