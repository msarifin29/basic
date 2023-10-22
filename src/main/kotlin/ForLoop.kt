fun main() {
    val group = arrayOf("Budi","Joko","Tono","Ani")
    for (person in group){
        println(person)
    }
    val total = group.size - 1
    for (i in 0..total){
        println("Index $i : ${group.get(i)}")
    }
}