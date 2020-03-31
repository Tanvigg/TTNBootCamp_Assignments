package AssessmentTwo

//Write a program to create mutable list of Integer. replace the second item in the list with new value. Print the list value.

fun main() {
    var mutablelistInt = mutableListOf<Int>()
    mutablelistInt.add(5)
    mutablelistInt.add(7)
    mutablelistInt.add(10)
    mutablelistInt.add(2,15)

    println("Print elements...")
    for(element in mutablelistInt){
        println(element)
    }

    //replacing the second Item in the list with a new value
    mutablelistInt[1]=16

    println("Elements after replacement...")
    for(element in mutablelistInt){
        println(element)
    }
}

