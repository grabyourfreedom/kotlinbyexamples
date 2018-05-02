/** Write a program to find the greatest of two numbers. This program introduces
 *  if structure in Kotlin
 */

fun main(args : Array<String>) {
    val a : Int = 10
    val b : Int = 20
    var largest : Int

    if (a > b) {
        largest = a
    } else {
        largest = b
    }

    println(largest)
}