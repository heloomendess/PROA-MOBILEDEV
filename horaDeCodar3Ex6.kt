/*
6 - Escreva um programa para ler 2 notas de um aluno, calcular e imprimir
a média final. Considere que a nota de aprovação é 9,5. Logo após escrever
a mensagem "Calcular a média de outro aluno Sim/Não?" e solicitar um
resposta. Se a resposta for "S", o programa deve ser executado novamente,
caso contrário deve ser encerrado exibindo a quantidade de alunos aprovados.
*/

fun main() {
    var aprovados = 0
    var resposta: String

    do {
        print("Informe a primeira nota: ")
        val nota1 = readLine()!!.toDouble()

        print("Informe a segunda nota: ")
        val nota2 = readLine()!!.toDouble()

        val media = (nota1 + nota2) / 2
        println("Média final: $media")

        if (media >= 9.5) {
            println("Aluno aprovado!")
            aprovados++
        } else {
            println("Aluno reprovado.")

            print("Calcular a média de outro aluno (Sim/Não)? ")
            resposta = readLine()!!.toUpperCase()

        } 

        while ((resposta == "S") || (resposta == "SIM")) {
            println("Quantidade de alunos aprovados: $aprovados")
        }
    }
