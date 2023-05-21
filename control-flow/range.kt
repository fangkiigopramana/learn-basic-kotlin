fun main (){
    var rangeIntUp = 1.rangeTo(100) 
    var rangeIntDown = 100.downTo(1) 
    var rangeInt = 1..100 
    var rangeChar = 'A'.rangeTo('F')
    
    println(rangeChar) // default step = 1
    println(rangeInt.step) // default step = 1
    
    val rangeIntNew = 1..1000 step 2
    rangeChar.forEach{
        print("$it ")
    }
    println(rangeIntNew.step) // step = 1
}