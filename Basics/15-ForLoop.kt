package Basics

fun main(){
    println("Looping from 1 upto 5")
    for (i in 1..5){
        println(i)
    }
    println("Looping from 1 until 4 using until keyword");
    for(i in 1 until 5){
        println(i)
    }
    println("Looping from 10 downto 4 using downTo keyword");

    for (i in 10 downTo 1){
        println(i)
    }
    println("Looping through a given range with a step size.")
    for (i in 1..10 step 3){
        println(i);
    }

}