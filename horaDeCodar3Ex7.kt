fun main() {
    var soma = 0.0
    var nota: Double

    for (i in 1..6) {
        do {
            print("Informe a nota $i (de 0 a 10): ")
            nota = readLine()!!.toDouble()
            if (nota < 0 || nota > 10) {
                println("Nota inválida! Por favor, insira um valor entre 0 e 10.")
            }
        } while (nota < 0 || nota > 10)

        soma += nota
    }

    val media = soma / 6
    println("A média simples das 6 notas é: $media")
}
