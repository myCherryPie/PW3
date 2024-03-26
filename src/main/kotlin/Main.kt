import java.util.Scanner
val scanner = Scanner(System.`in`)

fun main(args: Array<String>) {
    val archiveList = mutableListOf<Archive>()
    val menu = Menu()
    var exit = true
    while (exit) {
        menu.archiveMenu(archiveList)
        val input = scanner.nextLine()
        if (input.toIntOrNull() == null) {
            println("Введите номер пункта меню")
        } else {
            val cmd = input.toInt()
            when {

                (cmd > archiveList.size + 1 || cmd < 0) -> println("Такого пункта меню нет\n Повторите ввод\n")
                (cmd == archiveList.size + 1) -> exit = false
                (cmd == 0) -> {
                    var name = ""
                    while (name.isBlank()){
                    println("Введите название архива")
                    name = scanner.nextLine()
                    if (name.isNullOrEmpty()) {
                        println("Вы ничего не ввели\n Повторите ввод\n")
                    } else {
                        archiveList.add(Archive(name, mutableListOf()))
                    }}
                }
                (cmd > 0 && cmd <= archiveList.size) -> archiveList[cmd - 1].showNotes(
                    archiveList[cmd - 1],
                    archiveList
                )

            }
        }
    }
}