fun main(){
    // Discussion on Kotlin Functions:

    // 1. Function Declaration:
// A basic function in Kotlin is declared using the 'fun' keyword.
    fun greatUsers(dayTime:String):String{
        return "Good $dayTime!"
    }
println(greatUsers("morning"));
println(greatUsers("afternoon"));
println(greatUsers("evening"));
    // 2. Default Arguments:
// Functions can have default parameter values to handle optional arguments.

    fun welcomeUser(name:String="Guest"){
        println("Welcome $name!")
    }
    welcomeUser();
    welcomeUser("John")
    // 3. Named Arguments:
// Functions in Kotlin support named arguments for better readability.
    fun createFullName(firstName: String, lastName: String): String {
        return "$firstName $lastName"
    }

// Usage of named arguments:
    val fullName = createFullName(lastName = "Doe", firstName = "John")
    println(fullName);

    // 4. Higher-Order Functions:
// Kotlin allows functions to be passed as parameters or returned as results.
    fun performOperation(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
        return operation(x, y)
    }

// Example of passing a lambda expression as an argument:
    val result = performOperation(5, 3) { a, b -> a * b }

}