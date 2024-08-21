/*
1-Ao acessar o sistema, pergunte o nome do usuário e diga "Olá {Nome} é um prazer ter você por aqui!"
2-Na função "inicio", utilize escolha/caso (switch/case) para validar a opção escolhida pelo usuário.
3-Sempre que o usuário for sacar dinheiro, o valor restante não pode ser negativo, ou seja, caso o usuário tente
sacar mais do que tem em saldo, a ação não deve ocorrer. Exiba uma mensagem de "Operação não autorizada".
4-Sempre que o usuário for sacar dinheiro, o valor a ser sacado não pode ser igual ou menor que zero. Exiba uma
mensagem de "Operação não autorizada".
5-Adicionar a opção para ver o extrato (Coloque algumas compras ou depósitos fictícios).
6-Adicionar a opção para fazer uma transferência. A transferência consiste em você informar o número de uma conta
(pode ser qualquer número, mas obrigatoriamente um número, ou seja, nenhum outro caractere deve ser aceito),
perguntar o valor da transferência e remover o valor da conta da mesma forma como na ação do saldo. Caso o usuário
tente transferir mais do que tem em saldo, a ação não deve ocorrer. Exiba uma mensagem de "Operação não autorizada".
7-Sempre que o usuário for transferir dinheiro,  o valor a ser transferido não pode ser igual ou menor que zero, ou
seja, caso o usuário tente transferir mais do que tem em saldo, a ação não deve ocorrer. Exiba uma mensagem de
"Operação não autorizada".
8-No menu principal, a ordem das opções deve ser: Saldo, Extrato, Saque, Depósito, Transferência e Sair.
9-Atualize a função "erro" com as novas opções do menu.
10-Caso o usuário informe um valor para depósito igual ou menor que zero, não deixe a operação ocorrer. Exiba uma
mensagem de "Operação não autorizada".
11-Sempre que o usuário for acessar o saldo, sacar, retirar o extrato ou transferir dinheiro é necessário que ele
informe uma senha. Essa senha deve ser validada com uma condicional. A senha é 3589.
12-Caso a senha informada não seja a correta, é necessário chamar a função atual novamente.
13-Quando o usuário escolher sair do sistema, exiba uma mensagem agradecendo por utilizar os serviços do banco:
"{Nome}, foi um prazer ter você por aqui!".

 */
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Bem-vindo ao sistema bancário PROAMASTER!")
    println("Por favor, informe seu nome:")
    val nome = scanner.nextLine()
    println("Olá $nome, é um prazer ter você por aqui!")
    inicio(nome)
}

fun inicio(nome: String) {
    val scanner = Scanner(System.`in`)
    var saldo = 0.0
    var senhaValida = false

    while (true) {
        println("\nMenu Principal:")
        println("1 - Saldo")
        println("2 - Extrato")
        println("3 - Saque")
        println("4 - Depósito")
        println("5 - Transferência")
        println("6 - Sair")
        println("Escolha uma opção:")
        val opcao = scanner.nextInt()

        when (opcao) {
            1 -> {
                if (validarSenha()) {
                    println("Saldo: R$$saldo")
                } else {
                    erro(nome)
                }
            }
            2 -> {
                if (validarSenha()) {
                    exibirExtrato()
                } else {
                    erro(nome)
                }
            }
            3 -> {
                if (validarSenha()) {
                    println("Informe o valor do saque:")
                    val valorSaque = scanner.nextDouble()
                    if (valorSaque <= 0) {
                        println("Operação não autorizada")
                    } else if (valorSaque > saldo) {
                        println("Saldo insuficiente")
                    } else {
                        saldo -= valorSaque
                        println("Saque de R$$valorSaque realizado com sucesso")
                    }
                } else {
                    erro(nome)
                }
            }
            4 -> {
                if (validarSenha()) {
                    println("Informe o valor do depósito:")
                    val valorDeposito = scanner.nextDouble()
                    if (valorDeposito <= 0) {
                        println("Operação não autorizada")
                    } else {
                        saldo += valorDeposito
                        println("Depósito de R$$valorDeposito realizado com sucesso")
                    }
                } else {
                    erro(nome)
                }
            }
            5 -> {
                if (validarSenha()) {
                    println("Informe o número da conta de destino:")
                    val numeroConta = scanner.nextInt()
                    println("Informe o valor da transferência:")
                    val valorTransferencia = scanner.nextDouble()
                    if (valorTransferencia <= 0) {
                        println("Operação não autorizada")
                    } else if (valorTransferencia > saldo) {
                        println("Saldo insuficiente")
                    } else {
                        saldo -= valorTransferencia
                        println("Transferência de R$$valorTransferencia para a conta $numeroConta realizada com sucesso")
                    }
                } else {
                    erro(nome)
                }
            }
            6 -> {
                println("$nome, foi um prazer ter você por aqui!")
                break
            }
            else -> {
                println("Opção inválida")
            }
        }
    }
}

fun validarSenha(): Boolean {
    val scanner = Scanner(System.`in`)
    println("Informe a senha:")
    val senha = scanner.nextLine()
    return senha == "3589"
}

fun exibirExtrato() {
    println("Extrato:")
    print("- 23,00 Shopping")
    println("+ 2.000 Salário")
    println("- 100,00 Internet")
}

fun erro(nome: String) {
    println("Operação não autorizada")
    inicio(nome)
}