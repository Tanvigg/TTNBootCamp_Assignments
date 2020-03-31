package AssesmentThree

//WAP to create sealed Base class and 3 subclasses of Base class,
// write a function which will have base class object as an argument and it will return name of the subclass based argument type.


sealed class Shape{
    class Circle(var radius:Float) : Shape()
    class Square(var length:Int):Shape()
    class Rectangle(var length:Int,var breadth : Int):Shape()

}

fun eval(e:Shape) {
    when (e) {
        is Shape.Circle -> println("Circle area is ${3.14 * e.radius * e.radius}")
        is Shape.Square -> println("Square area is ${e.length * e.length}")
        is Shape.Rectangle -> println("Rectangle area is ${e.length * e.breadth}")

    }

}

fun main() {
    val circle = Shape.Circle(5.0f)
    val square = Shape.Square(5)
    val rectangle = Shape.Rectangle(4,5)
    eval(circle)
    eval(square)
    eval(rectangle)


}


