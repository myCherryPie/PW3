import java.util.Scanner

class Archive {
    companion object {
        var archive: MutableList<Note> = mutableListOf() //List of notes
        var archiveName = ""

        fun createArchive(archiveName:String) {
            Archives.archives.add(archiveName)
            println(" Архив $archiveName создан")
        }
    }
}