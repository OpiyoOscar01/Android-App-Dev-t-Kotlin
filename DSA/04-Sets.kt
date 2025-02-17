package DSA

fun main() {
    /**
     * Immutable set
     */
    val names=setOf<String>("Oscar","Steve","Johns")
    names.forEach { name->println(name) }
    /**
     * Fruits:mutable sets
     */
    val fruits=mutableSetOf<String>("Apples","Pineapples","Pawpaw")
    names.forEach {fruit-> println(fruit) }

}