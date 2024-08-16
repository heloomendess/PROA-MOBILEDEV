/*
5.  Faça um programa que leia 6 valores informados pelo usuário, calcule, exiba os números informados
e escreva a média aritmética desses valores lidos.
 */
import java.util.Scanner;

public class horaDeCodar2Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva o primeiro número: ");
        int n1 = input.nextInt();

        System.out.println("Escreva o segundo número: ");
        int n2 = input.nextInt();

        System.out.println("Escreva o terceiro número: ");
        int n3 = input.nextInt();

        System.out.println("Escreva o quarto número: ");
        int n4 = input.nextInt();

        System.out.println("Escreva o quinto número: ");
        int n5 = input.nextInt();

        System.out.println("Escreva o sexto número: ");
        int n6 = input.nextInt();

        int mediaAritmetica = (n1 + n2 + n3 + n4 + n5 + n6)/6;

        System.out.println("A média aritmetica dos números é: " + mediaAritmetica);
    }
}
