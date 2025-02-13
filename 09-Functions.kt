fun main() {
    // 1. Function Declaration:
    fun greatUsers(dayTime: String): String {
        return "Good $dayTime!"
    }

    println(greatUsers("morning"))
    println(greatUsers("afternoon"))
    println(greatUsers("evening"))

    // 2. Default Arguments:
    fun welcomeUser(name: String = "Guest") {
        println("Welcome $name!")
    }

    welcomeUser()
    welcomeUser("John")

    // 3. Named Arguments:
    fun createFullName(firstName: String, lastName: String): String {
        return "$firstName $lastName"
    }

    // Usage of named arguments:
    val fullName = createFullName(lastName = "Doe", firstName = "John")
    println(fullName)

    // 4. Higher-Order Functions:
    fun operation(i: Int, y: Int): Int {
        return (i + y) / 2
    }

    // The calc function needs to be declared before usage:
    fun calc(num1: Int, num2: Int, operation: (Int, Int) -> Int) {
        println(operation(num1, num2))
    }

    // Corrected usage of calc with a function reference
    calc(2, 3, ::operation)

    //5.Lamda functions
    var result:(Int,Int)->Int={x,y->x+y};
    println(result)
}
