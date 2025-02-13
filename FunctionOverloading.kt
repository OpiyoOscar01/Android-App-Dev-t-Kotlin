fun main(){
    println(calculateAverage(12,23,47));
    println(calculateAverage(12.78,87.37,234.89));
}
fun calculateAverage(a:Int,b:Int,c:Int):String{
    var average=(a+b+c)/3;
    return "The average of $a ,$b and $c is $average"
}fun calculateAverage(a:Double,b:Double,c: Double):String{
    var average=(a+b+c)/3;
    return "The average of $a ,$b and $c is ${"%.4f".format(average)}"
}