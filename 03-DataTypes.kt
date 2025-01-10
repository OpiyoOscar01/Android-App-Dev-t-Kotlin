fun main(){
    /**
     * Int datatype
     */
    val maxIntegerValue:Int=Int.MAX_VALUE;
    val minIntegerValue:Int=Int.MIN_VALUE;
    println("The maximum integer value is $maxIntegerValue") ;
    println("The minimum integer value is $minIntegerValue") ;
    /**
     *Short data type
     */
    val minShortValue:Short=Short.MIN_VALUE;
    val maxShortValue:Short=Short.MAX_VALUE;
    println("The min short value is: $minShortValue")
    print("The max short value is: $maxShortValue")
    /**
     * same for Long,Float,Double
     */
    var longValue:Long=10000000000;
    var floatValue:Float=3.14F;
    var doubleValue:Double=3.14;
    println("Long value is: $longValue")
    println("Float value is: $floatValue")
    println("Double value is: $doubleValue")
    /**
     * Boolean
     */
    val isAlive:Boolean=true;
    if (isAlive){
        println("I'm alive") ;
    }
    var name:String="Mary" ;
    println("My name is $name") ;
    var description:String="""
        Kotlin is a cross-platform, statically typed, general-purpose programming language with type inference.
        Kotlin is easy
        Are you sure?
    """.trimIndent()
    println(description)
    
}

