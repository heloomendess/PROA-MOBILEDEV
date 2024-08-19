fun main() {
    print("Informe o valor de N para gerar as tabuadas (N deve ser maior que zero): ")
    val N = readLine()!!.toInt()

    if (N > 0) {
        for (i in 1..N) {
            println("Tabuada do $i:")
            for (j in 1..10) {
                println("$i x $j = ${i * j}")
            }
            println()
        }
    } else {
        println("O valor de N deve ser maior que zero.")
    }
}
