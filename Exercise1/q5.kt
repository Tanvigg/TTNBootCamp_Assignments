package AssesmentOne

//Find common elements between two arrays.

fun main() {
    var array1 = Array(5){0}
    var array2 = Array(4){0}

    println("Enter values")
    var x = 0
    while (x < array1.size) {
        array1[x] = readLine()!!.toInt()
        x++
    }
    println("Enter values")
    var y = 0
    while (y < array2.size) {
        array2[y] = readLine()!!.toInt()
        y++
    }

    println("Common elements are:")
    for (i in 0 until array1.size) {
            for (j in 0 until array2.size)
                if (array1[i] == array2[j])
                    println(array1[i])

        }

}
