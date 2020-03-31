package AssesmentOne

//Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String.
fun main() {
    println("Enter the String:")
    var str : String = readLine().toString()
    var nL = 0
    var nU = 0
    var nD = 0
    var specialChar = 0
    val len : Int = str.length
    for(i in 0 until len){
        when {
            str[i].isUpperCase() -> nU++
            str[i].isLowerCase() -> nL++
            str[i].isDigit() -> nD++
            else -> specialChar++
        }
    }

    var uppercaseLetterPercentage = (nU * 100) / len
    var lowercaseLetterPercentage = (nL * 100) / len
    var specialCharacterLetterPercentage = (specialChar * 100) / len

    println("length is : $len")
    println("Upper case Letters are : $uppercaseLetterPercentage%")
    println("Lower case Letters are : $lowercaseLetterPercentage%")
    println("Special case Letters are : $specialCharacterLetterPercentage%")

}