/** This is again simple program (i think i should stop saying simple,
 *  as the programs are simple anyway) that greets the user with their
 *  first name when it is passed as command line argument or prints
 *  "Friend" if you do not share your name
 */

fun main(args : Array<String>) {

    // a variable to store the greeting
    var greetings = "Hello, "

    // if the list is empty meaning that the user did not give
    // her first name, say her "Friend". Else print her name as
    // received in args
    if (args.isEmpty()) {
        greetings += "Friend"
    }
    else {
        greetings += args[0]
    }

    greetings += "!"

    println(greetings)
}
