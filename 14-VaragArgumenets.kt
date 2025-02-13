fun main(){
println(sum(12,34,87,98,33));
println(sum(12,34,87,98,33,89,34,23,98,34,98));
}

fun sum(vararg numbers:Int): Int{
    var result:Int=0;
    for (number in numbers){
        result+=number;
    }
    return result;
}