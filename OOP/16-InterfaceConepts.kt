package OOP

fun main() {
    val pickUp = PickUp("Tesla",4)
    pickUp.startEngine()
    pickUp.stopEngine()
    val truck = Truck("SinoTruck",4.76)
    truck.startEngine()
    truck.stopEngine()


}



interface Engine {
    fun startEngine()
    fun stopEngine()

}
class  PickUp(var name:String,var doors:Int): Engine{
    override fun startEngine() {
println("$name with $doors has started the Engine")
    }

    override fun stopEngine() {
        println("$name with $doors has stopped the Engine")
    }

}

class Truck(var name:String,var weight:Double):Engine{
    override fun startEngine() {
        println("$name with $weight tonnes has started the Engine")
    }

    override fun stopEngine() {
        println("$name with $weight tonnes has stopped the Engine")
    }

}