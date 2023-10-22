// Immutable variable global using const
const val VERSION = 0.1

fun main() {
    // variable Mutable using var
    var name: String = "boy"
    // variable Immutable (cannot be changed) using val
    val age = 30
    // variable Nullable
    var nickName: String? = null
    nickName = "paijo"
    println(name)
    // call nullable value using key ? (question mark)
    println(nickName?.length)
    println("$VERSION")
}