package OOP

fun main() {
    val bk= Book("Modern Pysics","Oscar Steve")
    bk.volume="3"
    println("Book Info: Title:${bk.title},Author: ${bk.author},Volume: ${bk.volume}")

}

class Book(var title:String,var author:String){
    lateinit var volume: String
}