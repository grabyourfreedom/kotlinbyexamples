/** Write a program to find the greatest of three numbers. This program introduces
 *  nested if structure in Kotlin
 */

fun main(args : Array<String>) {
    val a : Int = 30
    val b : Int = 10
    var c : Int = 20
    var largest : Int

    if (a > b) {
        if (a > c) {
            largest = a
        } else {
            largest = c
        }
    } else {
        if (b > c) {
            largest = b
        } else {
            largest = c
        }
    }
    println(largest)
}