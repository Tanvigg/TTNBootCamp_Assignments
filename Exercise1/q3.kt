package AssesmentOne

//Write a program to find the number of occurrences of a character in a string without using loop.
fun main(args: Array<String>) {
    var str = "hippopotamus"
    val character = "p"

    val num = (str.length - (str.replace(character,"")).length)
    println(num)

}