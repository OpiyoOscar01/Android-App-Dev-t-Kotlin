package OOP

abstract class Learner(){
    abstract fun study()
    abstract  fun goForLunch()
}
class Nursery(): Learner() {
    override fun study() {
println("It's time to study")    }

    override fun goForLunch() {
println("It's time for lunch")    }
}

fun main() {
    val nursery = Nursery()
    nursery.goForLunch()
    nursery.study()
}