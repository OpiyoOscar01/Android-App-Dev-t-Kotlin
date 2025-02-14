package Basics

fun main(){
    print(getMaximumValue(2453,40));
}

fun getMaximumValue(mark1:Int,mark2:Int):Int{
    var max=if(mark1>mark2) mark1 else
        mark2
    return max;
}