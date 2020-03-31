package AssessmentTwo

/* 5. Write a function which take marks as an argument and return the the grade as follows:
marks between 50 to 60 , return “Good”
marks between 60 to 70, return “Very Good”
marks between 70 to  80, return “Excellent”
marks between  80 to 100, return “Rockstar”
*/

fun EvaluateMarks(marks: Int): String {
    when (marks) {
        in 50..60 -> return "Good"
        in 60..70 -> return "Very Good"
        in 70..80 -> return "Excellent"
        in 80..100 -> return "Rockstar"
        else -> return "Not in Range"

    }
}
fun main() {
    var evaluate = EvaluateMarks(75)
    println(evaluate)
}