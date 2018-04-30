/* This is a simple program that prints the arguments
 * passed to the programs one by one. This is no different
 * than Java
 */

fun main(args: Array<String>) {

    /* Notice here, we are printing the number of elements in the array
     * ${args.size} inside the double quotes. Kotlin automatically
     * formats it for you
     */

    println("Number of arguments - ${args.size}")

    /* Check out the simple for loop. In each iteration of
    * for loop, the value at the each index is assigned to
    * arg which gets printed
    *
    */
    for (arg in args) {
        println(arg)
    }
}

/* Did you observe the having a class definition is not mandatory
 * You can write a code like you write in a procedural language like
 * C or C++ (very much like a Python)
 */