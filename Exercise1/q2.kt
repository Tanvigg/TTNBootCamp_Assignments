package AssesmentOne

//Write a program to find the number of occurrences of the duplicate words in a string and print them.
fun main() {
    println("Enter the String:")
    var str: String = readLine().toString()
    var count: Int



    str.toLowerCase()
    val word = str.split(" ".toRegex()).toTypedArray()

    println("Duplicate words in the String are:")
    for (i in 0 until word.size) {
        count = 1
        for (j in i + 1 until word.size) {
            if (word[i] == word[j]) {
                count++
                word[j] = "0"


            }
        }
        if (count > 1 && word[i] != "0")
            println(word[i])


    }


}
