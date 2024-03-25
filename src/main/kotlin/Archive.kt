import Archives.Companion.scanner

class Archive(var name:String, var notes : MutableList<Note> = mutableListOf()) :AllFun() {
    companion object {
        var name = ""
        var cancle = "Вернуться в меню архивов"
        var createNote = "Создать заметку"
        var archive = mutableListOf<Archives>()
        var notes = listOf<String>(cancle, createNote)
    }




}


