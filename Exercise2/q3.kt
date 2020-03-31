package AssessmentTwo

//Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific details like rateofinterest etc,print details of every bank.

open class Bank {
    var principal: Int = -1
    var rate: Double = -1.1
    var time: Int = -1
    var bankName: String = " "

    fun getDetails() {
        principal = readLine()!!.toInt()
        rate = readLine()!!.toDouble()
        time = readLine()!!.toInt()
        bankName = readLine()!!.toString()
    }

    fun printDetails() {
        println(principal)
        println(rate)
        println(time)
        println(bankName)
    }
}

class SBI : Bank() {

}

class BOI : Bank() {

}

class ICICI : Bank() {
}

fun main() {
    println("Enter details for class SBI:\n")
    val sbi = SBI()
    sbi.getDetails()
    sbi.printDetails()
    println("Enter details for class BOI:\n")
    val boi = BOI()
    boi.getDetails()
    boi.printDetails()
    println("Enter details for class ICICI:\n")
    val icici = ICICI()
    icici.getDetails()
    icici.printDetails()

}