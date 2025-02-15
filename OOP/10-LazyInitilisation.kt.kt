package OOP

fun main() {
    val client1= Client("Oscar",24)
    val clien2 by lazy {
        Client("James",12)
    }
    println(clien2.name)

}

class Client(var name: String,var age:Int) {
    init {
        println("Client: $name was created"
        )
    }
}