fun main() {
    val p = Person()
    p.nickName = "Jack"
    p.nickName = "Sweet Feet"
    p.printInfo()
    val p2 = Person("tom", "cav")
    p2.printInfo()

}

class Person(val firstName: String = "Jackie", val lastName: String = "Decodes") {
    var nickName: String? = null
        set(value) {
            val oldNickName = nickName
//          field is keword for setting the variable
            field = value
            println("setting field nickName from $oldNickName to $value")
        }

    fun printInfo() {
        println("$firstName $lastName ${nickName ?: "no nickname"}")
    }
}


