package OOP


fun main() {

    val dbInstance= Database.getInstance()
    println(dbInstance)
    println(DB)
    println(DB)
    println(DB)


}

class Database private constructor(){
    companion object{
        private var instance: Database?=null;
        fun getInstance(): Database?{
            if(instance==null){
            instance= Database()
            }
            return instance

        }
    }
}

/**
 * A more concise way of creating singleton
 */
object DB{

init {
    println("This is a singleton.")
}
}