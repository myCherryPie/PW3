import java.util.Scanner
class Archive(val name: String, val noteList: MutableList<Note>) {
    val scanner = Scanner(System.`in`)
    fun createNote(archive: Archive, archiveList: MutableList<Archive>) {
        var text = ""
        while (name.isNullOrBlank() || text.isNullOrBlank()) {
            println("Введите название заметки")
            val name = scanner.nextLine()
            if (name.isNullOrBlank()) {
                println(
                    "Вы ничего не ввели\n" +
                            " Повторите ввод"
                )
            } else {
                println("Введи текст заметки")
                text = scanner.nextLine()
                if (text.isNullOrBlank()) {
                    println("Вы ничего не ввели\n Повторите ввод")
                } else {
                    val note = Note(name, text)
                    archive.noteList.add(note)
                    println("Заметка сохранена")

                }
            }
        }
        showNotes(archive, archiveList)
    }

    fun showNotes(archive: Archive, archiveList: MutableList<Archive>) {
        println("Список заметок:\n")
        println("0 - Создать заметку\n")
        for (i in archive.noteList.indices) {
            println("${i + 1} - ${archive.noteList[i].name}")
        }
        println("${archive.noteList.size + 1} - Вернуться к списку архивов\n")
        var inputNotes = ""
        while (inputNotes.isBlank()) {
            inputNotes = scanner.nextLine()
            if (inputNotes.toIntOrNull() == null) {
                println("Такого пункта меню нет\nПовторите ввод\n")
                showNotes(archive, archiveList)
            } else {
                val cmd = inputNotes.toInt()
                val exitToArchive = archive.noteList.size + 1
                when {
                    (cmd == 0) -> createNote(archive, archiveList)
                    (cmd == exitToArchive) -> return
                    (cmd > 0 && cmd <= archive.noteList.size) -> showNote(
                        archive.noteList[cmd - 1],
                        archive,
                        archiveList
                    )

                    else -> println("Такого пункта меню нет\nПовторите ввод\n")
                }
            }
        }
    }

    fun showNote(note: Note, archive: Archive, archiveList: MutableList<Archive>) {
        println("Заметка:\n")
        println("Название: ${note.name}\n")
        println("Текст: ${note.text}\n")
        println("Нажмите любую клавишу, чтобы вернуться в меню заметок\n")
        scanner.nextLine()
        showNotes(archive, archiveList)
    }
}

