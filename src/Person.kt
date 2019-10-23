fun main() {
    val p = Person()
    p.nickName = "Jack"
}

class Person {
    var nickName: String? = null
        set(value) {
//          field is keword for setting the variable
            field = value
            println("setting field $nickName to $value")
        }
}


