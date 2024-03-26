import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    while (true) {
        val archiveMenu = mutableListOf<Archive>()
        Menu.archiveMenu(archiveMenu)
        println("Введите номер пункта меню")
        val nextLine = scanner.nextLine()
        if (nextLine.toIntOrNull() == null) {
            println("Введите число")
        } else {
            var input = nextLine.toInt()
            when {
                (input > archiveMenu.size + 1 || input < 0) -> println("Такого пункта нет, попробуйте снова")
                (input == archiveMenu.size + 1) -> return
                (input == 0) -> {
                    println("Введите название архива")
                    val name = scanner.nextLine()
                    if (name.isNullOrEmpty()) {
                        println("Название не может быть пустым")
                    } else {
                        val archive = mutableListOf<Archive>()
                        archiveMenu.add(Archive(name, mutableListOf()))
                        println("Архив созан\n")

                    }
                }

                (input > 0 && input <= archiveMenu.size) -> {
                    archiveMenu[input - 1].showNotes()
                }

            }
        }
    }
}