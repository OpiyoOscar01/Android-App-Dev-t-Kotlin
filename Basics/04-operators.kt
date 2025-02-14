package Basics

fun main(){
    var x:Double=12.3;
    var y:Float=12.3876F;
    println("The Basics.sum of $x and $y is: ${"%.3f".format(x + y)}")
    println("The product of $x and $y is ${"%.3f".format(x*y)}")
    var p=23;
    println("2 * P is ${2*p}");
    var q:Int=2;
    q+=1;
    println("Q is now $q")
    q%=1;
    println("Q is now $q")
    q-=1;
    println("Q is now $q")
    q*=200;
    println("Q is now $q")

}