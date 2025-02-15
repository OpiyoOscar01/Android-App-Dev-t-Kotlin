package OOP

/**
 * Companion objects bring in the concepts of class level variables and functions rather than object variables and functions
 */
fun main() {
    Bicycle.getWheelInfo()
    println(Bicycle.numberOfWheels)

}

class Bicycle(){
   companion object{
       var numberOfWheels:Int=2;
       fun getWheelInfo(){
           println("All bicycles have two wheels.")
       }
   }
}