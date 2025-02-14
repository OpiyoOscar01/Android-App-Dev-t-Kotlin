package Basics// Null values in Kotlin:
// Kotlin's type system prevents null pointer exceptions by distinguishing between nullable and non-nullable types.
// Use '?' for nullable types, '?:' (Elvis operator) for providing default values, and safe calls (?.) to handle null values.

fun handleNullable(value: String?): String {
    return value?.uppercase() ?: "Default Value"
}

fun main() {
    val name: String? = null;
    if (name != null) {
        println("Your name is $name")
        println("Your name is ${name.uppercase()}")
        println(name.length)
    } else {
        println("Your name is not found")
    }
    name?.let {
        println("Your name is $it")
        println("Your name is ${it.uppercase()}")
        println(it.length)
    } ?:
    println("No name provided")
    var message=name?: println("Your name is not found")
    println(message)
    println(handleNullable(null))
    println(handleNullable("Hello"))

    var age:Int?=null;
    var middleName:String?=null;
    var statment:String= (middleName?:println("No middle Name")).toString();
    print(statment);
}
