fun main() {
    val openHours = 7
    val now = 20
    val office : String
    office = if(now > openHours){
            "office already open"
        } else {
            "office is closed"
        }
    print(office)
}