fun main() {
//     apabila angka tidak emmenuhi kondisi filter, maka tidak akan dilanjutkan ke next proses 
    val list =  (1..10000).toList()
    list.asSequence().filter { it % 5 == 0}.map { it }.forEach { println(it)}
    
//     mencetak sequence dengan awal 10 beda 4 sebanyak 15 buah
    val list2 = generateSequence(10) { it + 4 }
    list2.take(15).forEach { print("$it ")}
}