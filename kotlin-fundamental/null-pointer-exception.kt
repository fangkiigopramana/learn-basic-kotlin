fun main () {

// Safe Calls dengan menggunakan tanda ?., sehingga bila variable tsb nullable, maka proses dilewati
    val text: String? = null
    text?.length
    
// Elvis Operator menetapkan nilai default pada suatu kondisi bila nilainya nullable
    val textLength = text?.length ?: 7
    println(textLength)
}