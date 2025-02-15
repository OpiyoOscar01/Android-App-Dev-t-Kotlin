/**
 * This program explores the concepts of enum classes in Kotlon
 */
fun main() {
    println(Direction.NORTH.direction)
    println(Direction.NORTH.distance)
    println(Direction.WEST)
    println(Direction.EAST)
    println(Direction.SOUTH)
    Direction.NORTH.printData()
    /**
     * Looping through enum values
     */
    for (direction in Direction.values()){
        println("$direction:${direction.direction} and distance: ${direction.distance} KM")
    }
    /**
     * Using enum with the when statement
     */
    var direction:Direction=Direction.WEST
    when(direction){
        Direction.EAST->Direction.EAST.printData()
        Direction.SOUTH->Direction.SOUTH.printData()
        Direction.WEST->Direction.WEST.printData()
        Direction.NORTH->Direction.NORTH.printData()
    }
}

enum class Direction(var direction:String,var distance:Int){
    NORTH("north",278),
    SOUTH("south",236),
    EAST("east",232),
    WEST("west",130);
    fun printData(){
        println("Direction: $direction and distance: $distance");
    }
}