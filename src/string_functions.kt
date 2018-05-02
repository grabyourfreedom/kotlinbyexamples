/** This program does some string operations and outputs the modified
 *  string or values
 */

fun main(args : Array<String>) {
    var str : String? = "This is a string"
    str = null
    println(str)

    var strNonNullable : String = "Non nullable reference"
    strNonNullable = null.toString()
    println(strNonNullable)
}