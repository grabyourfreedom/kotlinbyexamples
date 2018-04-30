package kotlinbyexamples.forloop

fun main(args: Array<String>) {
    for (i in 1..10) {
        println(i)
    }

    for (i in 1..10 step 2) {
        println(i)
    }

    for (i in 1..10 step 3) {
        println(i)
    }

    for (i in 10 downTo 0 step 4) {
        println(i)
    }
}