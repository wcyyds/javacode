package kotlin_code

class Student(val sno: String, val grade: Int) : Person() {
    init{
        println("sno is " + sno)
        println("grade is " + grade)
    }
}