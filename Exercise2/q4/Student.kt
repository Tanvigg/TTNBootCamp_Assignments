package AssessmentTwo.q4

class Student(bookId : Int,bookName: String):Library(bookId,bookName),Details{
    var studentName : String = ""
    var rollNum = 0
    var deptId = 0
    var bookCount =0
    var deptName: String = ""

    constructor(bookId: Int,bookName: String,studentName:String,rollNum : Int,deptId :Int,deptName : String):this(bookId,bookName){
        this.studentName = studentName
        this.rollNum = rollNum
        this.deptId = deptId
        this.deptName = deptName
        this.bookId = bookId
        this.bookName = bookName


    }
    fun issueBook(bookId: Int,bookName: String){
        this.bookId = bookId
        this.bookName = bookName
        bookCount++

    }

    override fun getdetails() {
        println("Dept ID = $deptId");
        println("Dept Name = $deptName");
        println("Roll Number = $rollNum");
        println("Student Name = $studentName");
        println("book ID = $bookId");
        println("book name = $bookName");
        println("book count = $bookCount");
        println("\n")
    }



}

fun main() {
    var students = Student(1,"Inroduction to kotlin","Tanvi",1234,400,"Computer Science")
    students.issueBook(1,"Introduction to Kotlin")
    students.getdetails()
    students.issueBook(2,"Intoduction to Java")
    students.getdetails()
}