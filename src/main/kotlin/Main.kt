
fun main(args: Array<String>) {

    println("добро пожаловать")
    start()


}

fun start () {

    while (!Check.exit) {
        Archives.showArchives()
        Check.checkInput()
    }
}



