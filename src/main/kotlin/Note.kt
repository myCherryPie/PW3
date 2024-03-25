import Archive.Companion.archive
import Archive.Companion.menuNotes
import Archives.Companion.scanner

class Note (var noteName:String, var text:String):AllFun() {

    override fun create() { //создание заметки

        var noteName = ""
        while (noteName.isEmpty()) {
            print("Введите название заметки: ")
            noteName = scanner.nextLine()
            if (noteName.isEmpty()) println("Поле пустое, попробуйте еще раз.")
        }
        var text = ""
        while (text.isEmpty()) {
            print("Введите тект заметки: ")
            text = scanner.nextLine()
            if (text.isEmpty()) println("Поле пустое, попробуйте еще раз.")
        }
        val newNote = Note(noteName,text)
        Archive.notes.add(newNote)
        println("Заметка '$noteName' создана.\n Введите любой символ чтобы вернуться к списку заметок.")
        scanner.nextLine()
        Check.statusMenu = 2.0
        show()
    }
    open fun read() {  //чтение заметки
        if (Check.statusMenu == 1.2){
            for (n in Archive.archive)
                println(n)
        }
    }
    override fun show() {  //список заметок
        println("Меню заметок\n")
        menuNotes.forEachIndexed { index, String -> println("${index + 1} $String\n") }
        archive.forEachIndexed { index, Note -> println("${index + 3} $String\n") }
        println("Введите целое число соответствующее пункту меню")
    }
}
