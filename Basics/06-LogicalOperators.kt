package Basics// Logical operators in Kotlin:
// 1. '&&' (Logical AND): Returns true if both conditions are true.
// 2. '||' (Logical OR): Returns true if at least one condition is true.
// 3. '!'  (Logical NOT): Negates the Boolean value.

// Example demonstrating logical operators in Kotlin:
fun main() {
    val a = true
    val b = false

    println("a && b: ${a && b}") // Logical AND: false
    println("a || b: ${a || b}") // Logical OR: true
    println("!a: ${!a}")         // Logical NOT: false
    var score =50;
    var attendance=20;
    var grade='A';
    var isStudent=false;

    if(score>=90 && attendance>80 && grade=='A'){
        println("You are eligible for the scholarship")
    }else if(score<30 || attendance<30){
        println("You are not eligible for the scholarship")
    }
    if(!isStudent){
        println("You are not a student")
    }
}
