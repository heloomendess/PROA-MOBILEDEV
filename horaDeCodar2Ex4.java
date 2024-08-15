/*
4. Faça um programa que leia 3 valores informados pelo usuário (considere que não serão informados
valores iguais) e escrever a soma dos 2 maiores.
 */

import java.util.Scanner;

public class horaDeCodar2Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = input.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = input.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int valor3 = input.nextInt();

        int maior1 = valor1, maior2 = valor2;;

        // Determina os dois maiores valores
        if (valor2 > maior1) {
            maior1 = valor2;
            maior2 = valor1;
        }

        if (valor3 > maior1) {
            maior2 = maior1;
            maior1 = valor3;
        } else if (valor3 > maior2) {
            maior2 = valor3;
        }

        // Calcula a soma dos dois maiores valores
        int soma = maior1 + maior2;

        // Exibe o resultado
        System.out.println("A soma dos dois maiores valores é: " + soma);
    }
}
