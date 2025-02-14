package DSA

/**
 * This program computes the minimum and maximum value in an array.
 */

fun main() {
    val numbers=arrayOf(12,37,45,99,45,98);
    var maxValue=getMaximumValue(numbers)
    println("The maximum value is $maxValue");
    var minValue=getMinimumValue(numbers);
    println("The minimum value is $minValue");

}
fun getMaximumValue(numbers: Array<Int>):Int{
    var max=numbers[0]
    for(value in numbers){
        if(value>max){
            max=value
        }
    }
    return max;
}
fun getMinimumValue(numbers: Array<Int>):Int{
    var minValue=numbers[0];
    for (value in numbers){
        if(value<minValue){
            minValue=value;
        }
    }
    return minValue;
}