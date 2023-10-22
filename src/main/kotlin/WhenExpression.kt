fun main() {
    // When expression with single option
    val value = "C" // expectation is Not bad
    when(value){
        "A" -> {
            println("Amazing")
        }
        "B" -> {
            println("Good")
        }
        "C" -> {
            println("Not bad")
        }
        else -> {
            println("Try again")
        }
    }

    // When expression with Multiple Option
    val value1 = "B" // expectation is Congratulation
    when(value1){
        "A", "B", "C" -> {
            println("Congratulation")
        }else ->{
            println("Try again")
        }
    }

    // When expression in
    val value2 = "E" // expectation is  Try again
    val values = arrayOf("A","B","C")
    when(value2){
        in values -> println("Congratulation")
        !in  values -> println("Try again")
    }

    val examValue = 90 // Good job
    when{
        examValue > 90 -> println("Amazing")
        examValue > 80 -> println("Good job")
        examValue > 60 -> println("Not bad")
        else -> println("Try again")
    }
}