fun main() {
    // Collection mempunyai turunan yang terdiri dari List, Set, dan Map

    // List
    	// secara default list tidak bisa diubah 
    val numberList = listOf(1,2,3,16,5,6,7,8,9,10)
    val charList = listOf('a','b','c');

        // MutableListOf (Agar suatu list dapat dirubah)
    val anyList = mutableListOf(1,2,3,4,5,6)
    println(anyList)
    anyList.add(1,9)
    println(anyList)


    // Set
    val setA = setOf(1,2,3,5,6,5,6) // set bersifat no duplicated
    val setB = setOf(4,5,7)

    println(setA)
    println(setA == setB) //bernilai true karena urutannya sama
    println(13 in setB) // apakah suatu elemen terdapat di suatu set?
    
    println(setA.union(setB)) // setA dan setB digabungkan
    println(setA.intersect(setB)) //elemen setA yang ada di setB
    
    val setC = mutableSetOf(1,2,3,4)
    // setC[2] = 6 //error karena nilai di set tidak bisa diubah
    println(setC)
    
    
    
    // Map, berformat key-value
    val capital = mapOf(
        "ina" to "Jakarta",
        "ind" to "New Delhi",
        "mly" to "Kuala Lumpur"
    )
    
    println(capital["inx"])
//     capital["ina"] = "Palangkaraya"
    println(capital.getValue("ina"))
    println(capital.keys)
    println(capital.values)
    
    
//     collection operator
    println("numberList : $numberList")
    println(numberList.filter{ it % 3 == 1}) // memfilter list yang dibagi 3 sisanya 1
    println(numberList.map { it *2 }) // setiap elemen dikalikan 2
    println(numberList.count()) // menghitung banyak elemen
    println(numberList.find{ it % 14 == 0}) // mencari elemen pertama yang memenuhi syarat
    println(numberList.first{ it > 5}) // menemukan elemen pertama yang ememnuhi syarat
    println(numberList.sum()) //menjumlahkan
    println(numberList.sorted()) //diurutin menaik
    println(numberList.sortedDescending()) // diurutin menurun
    

}