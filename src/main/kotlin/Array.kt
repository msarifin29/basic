fun main() {
    val fruits: Array<String> = arrayOf("Apple","Banana","Lemon")
    fruits[1] = "Strawberry"
    println(fruits.size)
    println(fruits[0])
    println(fruits[1])

val members: Array<Int?> = arrayOfNulls(3)
    members[0] = 0
    members[1] = 1
    members[2] = null
    println(members.size)
}