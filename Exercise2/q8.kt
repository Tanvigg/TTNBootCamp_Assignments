package AssessmentTwo

//Write a program to create HashSet. print all the value.
fun main() {
    var hashSet = hashSetOf<Any>(2,3,6,7,8,9,10,"Lilly")


    println("......traversing hashSet......")
    for (element in hashSet){
        println(element)
    }
}