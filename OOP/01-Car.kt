package OOP

class Car {
    var name="";
    var model=""
    var door=0;

    fun move(){
        println("The car $name is moving")
    }
    fun stop(){
        println("The car  $name has stopped")
    }
}

fun main(){
    val car1= Car();
    car1.model="Sp 01"
    car1.door=4;
    car1.name="Tesla"
    println("Name: ${car1.name}")
    println("Model: ${car1.model}")
    println("Doors: ${car1.door}")
    car1.move();
    car1.stop();
}