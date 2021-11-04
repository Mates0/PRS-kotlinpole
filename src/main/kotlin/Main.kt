import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    println("Zadej počet zelenin:")
    val vegetablecount = sc.nextLine()
    val vegetablesarray = Array(vegetablecount.toInt() + 1) {""}
    for (i in 1 until vegetablecount.toInt() + 1) {
        println("Zadej $i zeleninu")
        val vegetable = sc.nextLine()
        vegetablesarray[i] = vegetable
    }
    println("Zadejte počet ovocí:")
    val fruitcount = sc.nextLine()
    val fruitsarray = Array(fruitcount.toInt() + 1) {""}
    for (i in 1 until fruitcount.toInt() + 1) {
        println("Zadej $i ovoce")
        val fruit = sc.nextLine()
        fruitsarray[i] = fruit
    }
    while (true) {
        println("Zadejte hledaný název:")
        val search = sc.nextLine()
        if (search == "END")
            break
        if (fruitsarray.contains(search))
            println("ovoce")
        if (vegetablesarray.contains(search))
            println("zelenina")
    }
}