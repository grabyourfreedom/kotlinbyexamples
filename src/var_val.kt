/** This a simple program to demonstrate "val" and "var" in Kotlin
 *  val is immutable meaning that you cannot reassign a value once assigned.
 *  var is mutable meaning that you can assign/reasign
 */

fun main(args : Array<String>) {

    // Create a name for storing a immutable value. Observe, we have not assigned
    // anything yet
    val immutable : Int

    // Create a variable for storing an integer. Observer that we have not yet assigned
    // a value
    var mutable : Int

    // Assign a value to "val". Note, we cannot change it any further once assigned
    immutable = 123

    // Assign a value to "var".
    mutable = immutable
    println("mutable = $mutable")
    println("immutable = $immutable")

    // Let us change "var" to some other value
    mutable = 234
    println("mutable = $mutable")
    println("immutable = $immutable")

    // Uncomment this to see a compile time error :-(
    //immutable = 234
}