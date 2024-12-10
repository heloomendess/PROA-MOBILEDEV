import java.util.*

data class Pessoa(val nome: String, val altura: Double)

fun main() {
    val pessoas = mutableListOf<Pessoa>()
    val scanner = Scanner(System.`in`)

    while (true) {
        println("\n--- Nomes e Alturas ---")
        println("[1] Cadastrar Pessoas")
        println("[2] Menores ou Iguais a 1.5m")
        println("[3] Maiores que 1.5m")
        println("[4] Entre 1.5m e 2.0m")
        println("[5] Média das Alturas")
        println("[6] Sair")
        print("Escolha uma opção: ")

        when (scanner.nextInt()) {
            1 -> cadastrarPessoas(pessoas, scanner)
            2 -> filtrarAltura(pessoas, maxAltura = 1.5)
            3 -> filtrarAltura(pessoas, minAltura = 1.5)
            4 -> filtrarAltura(pessoas, minAltura = 1.5, maxAltura = 2.0)
            5 -> calcularMediaAltura(pessoas)
            6 -> {
                println("Encerrando o programa.")
                break
            }
            else -> println("Opção inválida.")
        }
    }
}

fun cadastrarPessoas(pessoas: MutableList<Pessoa>, scanner: Scanner) {
    pessoas.clear()
    repeat(15) {
        print("Nome: ")
        val nome = scanner.next()
        print("Altura: ")
        val altura = scanner.nextDouble()
        pessoas.add(Pessoa(nome, altura))
    }
    println("Pessoas cadastradas!")
}

fun filtrarAltura(pessoas: List<Pessoa>, minAltura: Double = 0.0, maxAltura: Double = Double.MAX_VALUE) {
    pessoas.filter { it.altura in minAltura..maxAltura }
        .forEach { println("Nome: ${it.nome}, Altura: ${it.altura}") }
}

fun calcularMediaAltura(pessoas: List<Pessoa>) {
    val media = pessoas.map { it.altura }.average()
    println("Média das alturas: $media")
}
