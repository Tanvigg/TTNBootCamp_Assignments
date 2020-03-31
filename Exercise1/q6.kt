package AssesmentOne

//Check letter in string which do not have pair.

fun main() {
    println("Enter the String:")
    val str: String = readLine().toString()
    str.toLowerCase().trim()
    var count :Int
    val arrStr = str.split("").toTypedArray()

    println("letter in string which do not have pair are :")
    for (i in arrStr.indices) {
         count = 1
        for (j in i+1 until arrStr.size-1) {
            if (arrStr[i] == arrStr[j]) {
                count++
                arrStr[j] = "0"

            }
        }
        if(count == 1 && arrStr[i] != "0")
            println(arrStr[i])
    }
}
