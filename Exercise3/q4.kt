package AssesmentThree

//WAP to create extension function.
class Student{
    fun isPassed(mark: Int): Boolean{
        return mark>40
    }
}
fun Student.isExcellent(mark: Int): Boolean{
    return mark > 90
}
fun main(args: Array<String>){
    val student = Student()
    val passingStatus = student.isPassed(55)
    println("student passing status is $passingStatus")

    val excellentStatus = student.isExcellent(95)
    println("student excellent status is $excellentStatus")
}