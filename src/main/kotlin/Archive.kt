
import java.util.Scanner

class Archive(val name: String,val notes: MutableList<Note>) {

        val scanner = Scanner(System.`in`)
        var nameNote = ""
        var text = ""

    fun createNote(archive: Archive) {
        while (nameNote.isBlank()) {
            println("Введите название заметки или 1 чтобы вернуться в меню")
            nameNote = scanner.nextLine()
            if (nameNote == "1") return
            if (nameNote.isBlank()) {
                println("Вы ничего не ввели, попробуйте снова")
            } else {
                while (text.isEmpty()) {
                    println("Введи текст заметки")
                    text = scanner.nextLine()
                    if (text.isEmpty()) {
                        println("Вы ничего не ввели, попробуйте снова")
                    } else {
                        val note = Note(name, text)
                        archive.notes.add(note)
                        println("Заметка $name создана")
                        return
                    }
                }
            }
        }
    }

    fun showNotes(archive: Archive,list: MutableList<Archive>) {

        println("Меню заметок:")
        println("0 - Создать заметку")

        for (i in archive.notes.indices) {
            println("${i + 1} - ${archive.notes[i].name}")
        }

        println("${archive.notes.size + 1} - Назад")
        var inputMenuNotes = ""
        while (inputMenuNotes.isBlank()) {
            inputMenuNotes = scanner.nextLine()
            if (inputMenuNotes.toIntOrNull() == null) {
                println("Введите число")
            } else {
                val exitValue = archive.notes.size + 1
                when {
                    (inputMenuNotes.toInt() == 0) -> createNote(archive)
                    (inputMenuNotes.toInt() == exitValue) -> Menu.archiveMenu(list)
                    (inputMenuNotes.toInt() > 0 && inputMenuNotes.toInt() <= archive.notes.size) -> showNote(
                        archive.notes[inputMenuNotes.toInt() - 1]
                    )

                    else -> println("Некорректный ввод, попробуйте снова")
                }
            }
        }
    }

    fun showNote(note: Note) {
        println("Заметка:")
        println("Название: ${note.name}")
        println("Текст: ${note.text}\n")
        println("1 - Назад")
        while (true) {
            val inputX = scanner.nextLine()
            if (inputX.isBlank()) {
                println("Введите число 1, чтобы вернуться назад")
                scanner.nextLine()
                return
            }
        }
    }
}
