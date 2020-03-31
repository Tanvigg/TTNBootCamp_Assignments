package AssessmentTwo

//Write a program to create mutable map. print all the value and key of map.
fun main() {
    val mutableMap1 : MutableMap<Int,String> = mutableMapOf(1 to "Ashu", 4 to "Rohan", 3 to "Vijay")


    println(".....traverse mutableMap1........")
    for(key in mutableMap1.keys){
        println("Key = $key, Value = ${mutableMap1[key]}")
    }
}