import java.util.Scanner

interface InputHandler {
    val input : String

    fun inputHandler () {}
}

fun inChAct () {while (!exit) {
    println(layoutBigList)
    Scanner(System.`in`).nextLine()
    when(this) {
        0 -> BigList.exit.set(true)
        1 ->

    }
    val inChAct = inputCheckAction
    inputCheckAction.inChAct()
}