package OOP

fun main() {
val success= Result.SUCCESS("SUCCESS")
val error= Result.ERROR("ERROR")
val progress= Result.PROGRESS("PROGRESS")

getData(success);
}
open class Result(var message:String){
    fun showMessage(){
        println("Message: $message")
    }
    class SUCCESS(message:String): Result(message)
    class ERROR(message:String):Result(message)
    class PROGRESS(message:String):Result(message)
}

fun getData(result: Result){
    when(result){
      is Result.SUCCESS-> result.showMessage()
      is Result.ERROR-> result.showMessage()
      is Result.PROGRESS-> result.showMessage()
    }
}