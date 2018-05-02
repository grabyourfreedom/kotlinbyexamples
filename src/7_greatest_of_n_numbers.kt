/** This is an improvement of finding greatest of two numbers. But we will find we
 *  would find the greatest of "N" numbers. The numbers are stored in an integer
 *  array
 */

fun main(args : Array<String>) {
    var largest : Int
    val numbers : IntArray = intArrayOf(10, 20, 30, 40, 50, 60, 70, -1, -2)

    largest = numbers[0]
    for (num in numbers) {
        if (num > largest) {
            largest = num
        }
    }
    println(largest)
}