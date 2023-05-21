fun main (){
    val num = 9
    
    //statement
    if(num%2 == 0){
        print("$num is even number : true")
    } else {
        print("$num is even number : false")
    }
    
    val isEvenNum = if (num % 2 == 0) true else false //expression (dapat mengembalikan nilai)
    
    print("$num is even number : $isEvenNum")
}