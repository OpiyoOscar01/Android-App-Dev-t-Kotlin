package OOP

fun main() {
    val car1= Car("Tesla","S123",4);
    println("Name: ${car1.name}")
    println("Model: ${car1.model}")
    println("Doors: ${car1.doors}")
    car1.move()
    car1.stop()

}
class  Car(var name:String, var model:String,var doors:Int){
    fun move(){
        println("$name is moving");
    }
    fun stop(){
        println("$name has stopped")
    }

}