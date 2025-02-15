package OOP

fun main() {
    val child1= Child();
    child1.getChildInfo()
    println("\n")
    val child2= Child("Oscar","Opiyo");
    child2.getChildInfo()
    println("\n")
    val child3= Child("Jude ","Steve",12);
    child3.getChildInfo()

}
class Child(var firstName:String="FirstName",var lastName: String="LastName",var age:Int=0){
    fun getChildInfo(){
        println("Hello $lastName $firstName, you are $age years old")
    }
}