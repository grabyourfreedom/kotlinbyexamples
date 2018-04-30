/** This program like any other program is a simple program
 *  that demonstrates how a for loop looks like and works. Shortly later,
 *  we will see little advanced usage of for loops, iterate over
 *  items in a collection
 */

fun main(args: Array<String>) {

    /** Assign a number starting from 1 to 10 incrementally in each
     *  iteration of this loop. Exit the loop after 10 iterations
     */
    for (i in 1..10) {
        println(i)
    }

    /** Let us print the even numbers between 2 and 20.
     *  Observe the keyword "step"
     */
    for (i in 2..20 step 2) {
        println(i)
    }

    /** Now, let us print the numbers in reverse order from 10 to 1.
     *  Observe the key word "downTo"
     */
    for(i in 10 downTo 1) {
        println(i)
    }

    /** Let us print the even numbers between 2 and 20 in reverse order.
     *  Observe the keyword "step"
     */
    for (i in 20 downTo 2 step 2) {
        println(i)
    }
}