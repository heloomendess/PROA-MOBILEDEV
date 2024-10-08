/*
1 - Escreva um algoritmo para ler 2 valores informados pelo usuário e se o segundo valor informado for igual ou
 menor que ZERO, deve ser lido um novo valor. Ou seja, para o segundo valor não pode ser aceito o valor zero, nem
 um valor negativo.
 O seu programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor.
 */
import java.util.*

fun main() {
    val input = Scanner(System.`in`);

    println("Digite o primeiro valor: ")
    val n1 = input.nextDouble()

    var n2: Double
    do {
        println("Digite o segundo valor(Não pode ser zero ou negativo): ")
        n2 = readLine()!!.toDouble()
    } while (n2 <= 0)

    val result = n1/n2
    println(message = "O resultado da divisão é: " + result)

}

