fun main(){

// 1. Conditional Statements
// if-else
    val num = 10
    if (num > 5) {
        println("Number is greater than 5")
    } else {
        println("Number is 5 or less")
    }

// when (alternative to switch in other languages)
    val day = 3
    val dayName = when(day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }
    println(dayName)

// 2. Looping Statements
// for loop
    for (i in 1..5) {
        println("Counter: $i")
    }

// while loop
    var x = 5
    while (x > 0) {
        println("Countdown: $x")
        x--
    }

// do-while loop
    var y = 3
    do {
        println("Value: $y")
        y--
    } while (y > 0)

// 3. Jump Statements
// break
    for (i in 1..10) {
        if (i == 5) break
        println("Value: $i")
    }

// continue
    for (i in 1..5) {
        if (i == 3) continue
        println("Iteration: $i")
    }

    // return
    fun calculate(): Int {
        for (i in 1..10) {
            if (i == 5) return i
        }
        return -1
    }
    println("Return value: ${calculate()}")

    fun calculate2(): Int {
        for (i in 1..10){
            if(i==5){
            continue
            }
            println(i);
        }
        return -1
    }
    calculate2();
}