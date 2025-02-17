package DSA

fun main() {
    /**
     * Immutable list
     */
    val names=listOf<String>("Oscar","Steve","Make")
    println(names[0])

    /**
     * mutable list
     */
    val scores=mutableListOf<Int>(12,34,58,87)
    for(score in scores){
        println(score)
    }
    scores.add(98)
    scores.removeAt(1)
    println("After Modification:")

    for(score in scores){
        println(score)
    }
}
