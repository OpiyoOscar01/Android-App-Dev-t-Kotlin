package OOP

fun main() {

}
interface A{
    fun print()
}
interface B{
    fun draw()
}

class App: A by FirstDelegate(),B by SecondDelegate() {
    override fun draw(){


    }
    override fun print(){

    }

}

open class FirstDelegate:A{
    override fun print() {
        println("Delegate for class A")
    }

}
open class SecondDelegate:B{
    override fun draw() {
        println("Delegate for class B")
    }

}