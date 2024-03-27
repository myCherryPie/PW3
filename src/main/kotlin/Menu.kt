class Menu {
    fun archiveMenu(list: MutableList<Archive>) {
        println("Список архивов:\n")
        if (!list.isEmpty()) {
            println("0 - Создать архив\n")
            for (i in list.indices) {
                println("${i + 1} - ${list[i].name}\n")
            }
            println("${list.size + 1} - Выход из программы\n")
        } else {
            println("0 - Создать архив\n1 - Выход из программы\n")
        }
    }
}