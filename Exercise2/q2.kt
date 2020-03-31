package AssessmentTwo

/*Write a single program for following operation using overloading
  A) Adding 2 integer number
  B) Adding 2 double
  D) multiplying 2 int
  E) concate 2 string
  F) Concate 3 String
*/

class ArithmeticOperation() {
    fun opOnData(a: Int, b: Int) {
        println(a.plus(b))
    }

    fun opOnData(a: Double, b: Double) {
        println(a.plus(b))
    }

    fun mult(a: Int, b: Int) {
        println(a.times(b))
    }

    fun opOnData(a: String, b: String) {
        println(a.plus(b))
    }

    fun opOnData(a: String, b: String, c: String) {
        println(a.plus(b).plus(c))
    }

}

fun main() {
    val arithmeticOperation = ArithmeticOperation()
    arithmeticOperation.opOnData(2, 3)
    arithmeticOperation.opOnData(2.3, 4.5)
    arithmeticOperation.mult(2, 3)
    arithmeticOperation.opOnData("Hello ", "World")
    arithmeticOperation.opOnData("cat ", "mat ", "sat")


}