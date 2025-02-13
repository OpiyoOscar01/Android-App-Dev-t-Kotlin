fun main(){
   var fullName= getFullName(
        firstName = "Oscar",
        lastName = "Opiyo"
    );
    println(fullName);
}
fun getFullName(firstName:String,middleName:String="",lastName:String): String{
    return "$lastName $middleName $firstName";
}