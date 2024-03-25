
import Archives.Companion.scanner
class Check : AllFun() {
    companion object {
        var exit = false
        var statusMenu: Double = 1.0
        fun checkInput() {
            val input: Any = scanner.nextLine()
            if (statusMenu == 1.0) {
                when (input) {
                    "1" -> exit = true
                    "2" -> {statusMenu = 1.1
                        AllFun.create()
                        }
                    "${1 until Archives.archives.size+3}" -> {
                        statusMenu = 1.2
                        AllFun.read(input)
                    }
                    }
                }
                if (statusMenu == 2.0) {
                    when (input) {
                        "1" -> exit = true
                        "2" -> {

                            statusMenu = 1.1
                        }
                    }
                }
            }
        }
    }
}

        fun emptyString() {
            println("Вы ничего не ввели, введите значение повторно")
        }