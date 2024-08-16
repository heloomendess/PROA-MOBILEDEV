/*
Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela
poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).
 */
import java.util.Scanner;

public class horaDeCodar2Ex9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o ano do seu nascimento: ");
        int anoDeNascimento = input.nextInt();

        int idade = 2024 - anoDeNascimento;

        if (idade >= 16) {
            System.out.println("Você poderá votar esse ano. Você tem: " + idade);
        } else {
            System.out.println("Você não poderá votar nesse ano. Você tem: " + idade);
        }
    }
}
