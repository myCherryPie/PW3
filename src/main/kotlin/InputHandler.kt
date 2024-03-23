import java.util.Scanner

open class InputHandler {
    companion object {
        var input: String = ""
        var exit : Boolean = false
        var esc: Boolean = false
        var isInteger = true
        fun inputHandler() {
                println("Введите целое число")
                input = Scanner(System.`in`).nextLine()

                if (input.isEmpty()) {
                    emptyString()
                    inputHandler()
                } else {
                        when (input) {
                            "0" -> exit = true
                            "1" -> println("создаю архив")
                            "2" -> println("открываю архив")
                            else -> {
                                println("Введеное значение не подходит, введите целое число")
                                inputHandler()
                            }
                        }
                    }

            }


        fun emptyString() {
            println("Вы ничего не ввели, введите значение повторно")
        }

    }
}







