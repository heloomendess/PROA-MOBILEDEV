/*
5 - Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros informados pelo usuário
 e todos os números inteiros entre eles. Considere que o primeiro sempre será menor que o segundo.
 */
fun main() {

    print("Informe o primeiro número inteiro (menor): ")
    val n1 = readLine()!!.toInt()

    print("Informe o segundo número inteiro (maior): ")
    val n2 = readLine()!!.toInt()

    var soma = 0
    var quantidade = 0
    
    for (numero in n1..n2) {
        soma += numero
        quantidade++
    }

    val mediaResultado = soma / quantidade

    println("A média aritmética dos números inteiros entre $n1 e $n2 é: $mediaResultado")
}
