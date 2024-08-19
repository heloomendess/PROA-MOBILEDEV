/*
8 - Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Considere que
o N será sempre maior que ZERO. N  é um valor informado pelo usuário
 */
fun main() {
    print("Informe um valor para N (maior que zero): ")
    val N = readLine()!!.toInt()

    // Verifica se N é maior que zero
    if (N > 0) {
        // Imprime todos os valores entre 1 e N, inclusive
        for (i in 1..N) {
            println(i)
        }
    } else {
        println("O valor de N deve ser maior que zero.")
    }
}
