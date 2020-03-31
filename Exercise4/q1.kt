package AssesmentFour

//WAP using Lambda function to calculate the Simple Interest.
fun main() {
    val myLambda: (Double) -> Unit = { s: Double -> println(s) }
    findSimpleInterest(1200, 4.5, 3, myLambda);
}

fun findSimpleInterest(principal: Int, rate: Double, time: Int, myLambda: (Double) -> Unit) {
    val simpleInterest = (principal * rate * time) / 100
    print("Simple Interest is : ")
    myLambda(simpleInterest)
}