import java.util.*

data class Funcionario(val matricula: Int, val nome: String, val salario: Double)

fun main() {
    val funcionarios = mutableListOf<Funcionario>()
    val scanner = Scanner(System.`in`)

    while (true) {
        println("\n--- Funcionários ---")
        println("[1] Cadastrar Funcionários")
        println("[2] Pesquisar por Matrícula")
        println("[3] Salários Acima de R$1000")
        println("[4] Salários Abaixo de R$1000")
        println("[5] Salários Iguais a R$1000")
        println("[6] Sair")
        print("Escolha uma opção: ")

        when (scanner.nextInt()) {
            1 -> cadastrarFuncionarios(funcionarios, scanner)
            2 -> pesquisarFuncionario(funcionarios, scanner)
            3 -> filtrarPorSalario(funcionarios) { it > 1000 }
            4 -> filtrarPorSalario(funcionarios) { it < 1000 }
            5 -> filtrarPorSalario(funcionarios) { it == 1000.0 }
            6 -> {
                println("Encerrando o programa.")
                break
            }
            else -> println("Opção inválida.")
        }
    }
}

fun cadastrarFuncionarios(funcionarios: MutableList<Funcionario>, scanner: Scanner) {
    funcionarios.clear()
    repeat(20) {
        print("Matrícula: ")
        val matricula = scanner.nextInt()
        print("Nome: ")
        val nome = scanner.next()
        print("Salário: ")
        val salario = scanner.nextDouble()
        funcionarios.add(Funcionario(matricula, nome, salario))
    }
    funcionarios.sortBy { it.matricula }
    println("Funcionários cadastrados e ordenados por matrícula!")
}

fun pesquisarFuncionario(funcionarios: List<Funcionario>, scanner: Scanner) {
    print("Digite a matrícula do funcionário: ")
    val matricula = scanner.nextInt()
    val funcionario = funcionarios.find { it.matricula == matricula }
    if (funcionario != null) {
        println("Funcionário: $funcionario")
    } else {
        println("Funcionário não encontrado.")
    }
}

fun filtrarPorSalario(funcionarios: List<Funcionario>, condicao: (Double) -> Boolean) {
    funcionarios.filter { condicao(it.salario) }
        .forEach { println(it) }
}
