package OOP

fun main() {
    val staff1= NonTeachingStaff("Job","job@gmail.com","I am a passionate cook.I love to prepare delicious meals")
    staff1.greatStaff()
    staff1.getJobDescription()
    val staff2= TeachingStaff("Robins","robins@gmail.com","I am a passionate Chemistry Teacher.I love to teach Chemistry in the most Practical and relatable way possible.")
    staff2.greatStaff()
    staff2.getSubjectDescription()

}
open class Staff(val name:String,val email:String){
   open fun greatStaff(){
        println("Hello staff")
    }
}
class NonTeachingStaff(name: String, email: String, var work:String): Staff(name,email){
    fun getJobDescription(){
        println("Job Description: $work")
    }

    override fun greatStaff() {
        nts()
        super.greatStaff()
    }
    fun nts(){
        println("Hello non teaching staff!")
    }
}
class TeachingStaff(name:String,email:String,var subject:String):Staff(name,email){
    fun getSubjectDescription(){
        println("Subject Description: $subject")
    }

    override fun greatStaff() {
        println("Hello Teaching staff!")
        super.greatStaff()
    }
}