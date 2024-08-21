/*
1- Crie um programa onde o usuário possa cadastrar estudantes sem limites, e, em seguida, Se o usuário digitar
"PARE" o programa deve exibir a quantidade de estudantes cadastrados e a lista com cada um deles. 
*/

fun main() {
    var quantidadeEstudantes = 0

    while (true) {
        print("Digite o nome do estudante (ou 'PARE' para sair): ")
        val nome = readLine()

        if (nome.equals("PARE", ignoreCase = true)) {
            break
        }

        quantidadeEstudantes++
    }

    println("Quantidade de estudantes cadastrados: $quantidadeEstudantes")
}
