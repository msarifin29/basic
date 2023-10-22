fun main() {
    // range of 1 to 100
    val numbers = 1..100
    println(numbers.count())
    println(numbers.contains(50))
    println(numbers.contains(500))
    println(numbers.first)
    println(numbers.last)
    println(numbers.step)

    val members = 100 downTo 1
    println(members.count())
    println(members.contains(50))
    println(members.contains(500))
    println(members.first)
    println(members.last)
    println(members.step)

    val coins = 100 downTo 1 step 3
    println(coins.count())
    println(coins.contains(50))
    println(coins.contains(500))
    println(coins.first)
    println(coins.last)
    println(coins.step)
}