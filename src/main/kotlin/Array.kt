fun main() {
    val fruits: Array<String> = arrayOf("Apple","Banana","Lemon")
    // get index of array
    fruits[1] = "Strawberry"
    // get length of array
    fruits.size
    // set value in array
    fruits.set(0, "Lemon")
    // or
    fruits[0] = "Orange"

    println(fruits.size)
    println(fruits[0])
    println(fruits[1])

    // Array nullable
val members: Array<Int?> = arrayOfNulls(3)
    members[0] = 0
    members[1] = 1
    members[2] = null
    println(members.size)
}