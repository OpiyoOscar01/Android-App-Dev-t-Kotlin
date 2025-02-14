package OOP

fun main() {
    val user1=User("Oscar",24);
    user1.getName()
    val user2=User("Alex",24);
    user2.getName()
    val user3=User("Ario",24);
    user3.getName()


}
class User(name:String,var age:Int){
    var name: String
    init {
        if(name.lowercase().startsWith("a")){
            this.name=name
        }else{
            this.name="User"
            println("The name does not start with 'a' or 'A");
        }
    }
    fun getName(){
        println("Hello $name");
    }

}