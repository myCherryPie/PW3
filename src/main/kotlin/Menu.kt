class Menu {
    companion object {

        fun archiveMenu(list : MutableList<Archive>) {
            println("Меню архивов")
            if (!list.isEmpty()) {
                println("0 - Создать архив")
                for (i in list.indices) {
                    println("${i + 1} - ${list[i].name}")
                }
                println("\n${list.size + 1} - Выход")
            } else {
                println("Список архивов пуст\n0 - Создать архив\n1 - Выход")
            }
        }
    }
}