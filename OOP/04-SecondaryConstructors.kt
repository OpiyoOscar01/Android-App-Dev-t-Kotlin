package OOP

fun main() {
    val student1= Student("Oscar")
    student1.greatStudent()
    student1.getStudentInfo()
    val student2= Student("James",'A',"COCIS")
    student2.greatStudent()
    student2.getStudentInfo()
    val student3= Student("Mike",'B',)
    student3.greatStudent()
    student3.getStudentInfo()

}
class Student(var name:String,var grade:Char,var college:String){
    constructor(name:String):this(name,grade='N',college="Default"){
        println("Second")
    }

    constructor(name:String,grade:Char):this(name,grade, college = "Default"){
        print("Third")
    }
    fun greatStudent(){
        println("Hello $name")
    }
    fun getStudentInfo(){
        println("Hello $name,your grade is $grade and your college of studeies is $college")
    }

}