fun main() {
    var dentroIntervalo = 0
    var foraIntervalo = 0

    println("Por favor, informe 10 valores:")

    for (i in 1..10) {
        print("Valor $i: ")
        val valor = readLine()!!.toInt()
        
        if (valor in 24..42) {
            dentroIntervalo++
        } else {
            foraIntervalo++
        }
    }

    println("Quantidade de valores dentro do intervalo [24, 42]: $dentroIntervalo")
    println("Quantidade de valores fora do intervalo [24, 42]: $foraIntervalo")
}
