fun main() {
    var soma = 0
    var quantidade = 0

    for (numero in 15..100) {
        soma += numero
        quantidade++
    }

    val media = soma / quantidade
    println("A média aritmética dos números inteiros entre 15 e 100 é: $media")
}