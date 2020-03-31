package AssesmentOne

//Write a program to replace a substring inside a string with another string.
fun main() {
    println("Enter the String:")
    var str : String = readLine().toString()
    println("Enter indices for Substring:")
    println("Enter start Indices:")
    val start : Int = Integer.valueOf(readLine())

    println("Enter end Indices:")
    val end : Int = Integer.valueOf(readLine())

    println("Enter new String for replacement")
    val newStr: String = readLine().toString()

    val replacedString : String = str.replace(str.substring(start,end),newStr)
    println("String after Replacement")
    println(replacedString)

}