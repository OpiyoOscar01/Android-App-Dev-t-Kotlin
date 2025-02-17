package OOP

fun main() {
    val signUpButton= Button("Sign Up",123,object: OnclickListener {
        override fun click() {
            println("Sign Up button clicked!")

        }

    })
    val loggInButton= Button("Logg In",123,object: OnclickListener {
        override fun click() {
            println("Logg in button clicked!")

        }

    })

}
class Button(var text: String,var id:Int,onclickListener:OnclickListener)
interface OnclickListener{
    fun click();
}