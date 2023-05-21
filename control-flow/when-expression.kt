fun main () {
    val value = 7
    
    //when expression yang biasa
    when (value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("number")
    }
    
    //when expression yang dapat menyimpan nilai ke variable
 /**   val state = when (value){
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "number"
    }
    println(state)
**/
    
    //when expression y menggunakan curly braces ( 1 braces lebih dari 1 baris kode yang dijalankan
/**    val state = when (value){
        6 -> {
                println("Six")
                "value is 6"
             }
        7 -> {
                println("Seven")
                "value is 7"
             }
        8 -> {
                println("Eight")
                "value is 8"
             }
        else -> "number"
    }
**/
   
   //when expression mendeteksi tipe data suatu variable
   val anyType : Any = 45
   when(anyType){
        is Long -> println("The value has a Long type")
        is Int -> println("The value has a String type")
        else -> println("undefined")
   }
   
   //when expression mengecek apakah suatu nilai terdapat di range tertentu
   val number = 90
   val ranges = 33..37
   
   when (number){
       in ranges -> println("in ranges")
       !in ranges -> println("not in ranges")
       else -> println("value undefined")
   }
    
}