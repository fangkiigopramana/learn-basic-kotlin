fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20
    var isOpen: Boolean

// AND CONDITIONAL
    isOpen = now >= officeOpen && now <= officeClosed
    println("Office is open : $isOpen")

// OR CONDITIONAL
    isOpen = now >= officeOpen || now <= officeClosed
    println("Office is open : $isOpen")

// NOT CONDITIONAL
    isOpen = !(now >= officeOpen || now <= officeClosed)
    println("Office is open : $isOpen")
}