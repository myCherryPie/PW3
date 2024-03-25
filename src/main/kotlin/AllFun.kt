import Archives.Companion.archives
import Archives.Companion.scanner

open class AllFun {

    open fun show() { // список архивов
            println("Меню\n")
            Archives.menuArchives.forEachIndexed { index, String -> println("${index + 1} $String\n") }
            Archives.archives.forEachIndexed { index, archive -> println("${index + 3} ${archive.name}\n") }
            println("Введите целое число соответствующее пункту меню")
    }

    open fun create() {  //создание архива
        var archiveName = ""
        while (archiveName.isEmpty()) {
            print("Введите название архива: ")
            archiveName = scanner.nextLine()
            if (archiveName.isEmpty()) {
                println("Поле пустое, попробуйте еще раз.")
            }
            val newArchive = Archives(archiveName)
            Archives.archives.add(newArchive)
            println("Архив '$archiveName' создан.\n Введите любой символ чтобы вернуться к списку архивов.")
            scanner.nextLine()
            Check.statusMenu = 1.0
            show()
        }
    }


    }
