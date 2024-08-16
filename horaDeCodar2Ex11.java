/*
11. Uma micro calculadora
Escreva um programa para ler 2 valores inteiros informados pelo usuário e uma das seguintes operações a serem executadas (codificada da seguinte forma: 1. Adição, 2. Subtração, 3. Divisão, 4. Multiplicação).
O programa deve calcular e escrever o resultado dessa operação sobre os dois valores lidos.

Observação: Considere que só serão lidos os valores 1, 2, 3 ou 4 para as operações
 */

import java.util.Scanner;

public class horaDeCodar2Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        System.out.println("Escolha a operação desejada:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Divisão");
        System.out.println("4. Multiplicação");
        System.out.print("Informe o número da operação: ");
        int operacao = scanner.nextInt();

        double resultado;
        switch (operacao) {
            case 1: // adição
                resultado = valor1 + valor2;
                System.out.println("Resultado da adição: " + resultado);
                break;
            case 2: // subtração
                resultado = valor1 - valor2;
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3: // divisão
                if (valor2 != 0) {
                    resultado = (double) valor1 / valor2;
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero.");
                }
                break;
            case 4: // multiplicação
                resultado = valor1 * valor2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            default:
                System.out.println("Operação inválida. Informe um número entre 1 e 4.");
                break;
        }
    }
}
