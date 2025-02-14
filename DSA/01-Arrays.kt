package DSA

fun main() {
    val names =arrayOf("Oscar","Mark","Johns");
    println(    names[0])
    print("The size of the array is ${names.size}")
    for (name in names){
        println(name)
    }
    val mixedArray=arrayOf("Oscar",1,'A',23.9);
     for (m in mixedArray){
         if(m is Int){
             println(m);
         };
         if(m is Double){
             println(m);
         }
         if(m is Char){
             println(m);
         }
     }
}