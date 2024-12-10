import java.util.*

data class Aluno(val nome: String, val notas: List<Double>) {
    val media: Double get() = notas.average()
    val situacao: String get() = if (media >= 5) "Aprovado" else "Reprovado"
}

fun main() {
    val alunos = mutableListOf<Aluno>()
    val scanner = Scanner(System.`in`)

    while (true) {
        println("\n--- Notas de Alunos ---")
        println("[1] Cadastrar Alunos")
        println("[2] Pesquisar Aluno")
        println("[3] Apresentar Todos")
        println("[4] Sair")
        print("Escolha uma opção: ")

        when (scanner.nextInt()) {
            1 -> cadastrarAlunos(alunos, scanner)
            2 -> pesquisarAluno(alunos, scanner)
            3 -> apresentarTodosAlunos(alunos)
            4 -> {
                println("Encerrando o programa.")
                break
            }
            else -> println("Opção inválida. Tente novamente.")
        }
    }
}

fun cadastrarAlunos(alunos: MutableList<Aluno>, scanner: Scanner) {
    alunos.clear() // Reseta a lista
    repeat(20) {
        print("Nome do aluno: ")
        val nome = scanner.next()
        val notas = mutableListOf<Double>()
        repeat(4) {
            print("Digite a nota bimestral ${it + 1}: ")
            notas.add(scanner.nextDouble())
        }
        alunos.add(Aluno(nome, notas))
    }
    alunos.sortBy { it.nome }
    println("Alunos cadastrados e ordenados por nome!")
}

fun pesquisarAluno(alunos: List<Aluno>, scanner: Scanner) {
    print("Digite o nome do aluno a pesquisar: ")
    val nome = scanner.next()
    val aluno = alunos.find { it.nome.equals(nome, ignoreCase = true) }
    if (aluno != null) {
        println("Aluno: ${aluno.nome}, Média: ${aluno.media}, Situação: ${aluno.situacao}")
    } else {
        println("Aluno não encontrado.")
    }
}

fun apresentarTodosAlunos(alunos: List<Aluno>) {
    if (alunos.isEmpty()) {
        println("Nenhum aluno cadastrado.")
        return
    }
    alunos.forEach { println("Aluno: ${it.nome}, Média: ${it.media}, Situação: ${it.situacao}") }
}
