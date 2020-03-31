package AssesmentThree

//WAP to create singleton class.
object Singleton
{

    init {
        println("Singleton class invoked.")
    }
    var name = "Kotlin Objects"
    fun printName()
    {
        println(name)
    }

}

fun main(args: Array<String>) {
    Singleton.printName()
    Singleton.name = "KK"

    var a = A()
}

class A {

    init {
        println("Class init method. Singleton name property : ${Singleton.name}")
        Singleton.printName()
    }
}