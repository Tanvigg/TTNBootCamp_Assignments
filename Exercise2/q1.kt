package AssessmentTwo

//Write a program to print your Firstname,LastName & age using init block,companion object.
class PrintData(firstName: String, lastName: String, age: Int) {
    val firstName: String
    val lastName: String
    var age: Int

    init {
        this.firstName = firstName
        this.lastName = lastName
        this.age = age
    }

}

fun main() {
    val data = PrintData("Tanvi", "Gupta", 23)
    println(data.firstName)
    println(data.lastName)
    println(data.age)


}