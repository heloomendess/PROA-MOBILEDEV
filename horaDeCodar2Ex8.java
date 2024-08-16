/*
8. Escreva um programa que calcule a média de quatro números informados pelo usuário, mas somente se
 esses números forem maiores que 0 e menores que 10. No final, se a média for maior que cinco o usuário receberá
 uma mensagem "Você passou no teste". Em qualquer outra situação, ele receberá uma mensagem de "tente novamente"
 */

import java.util.Scanner;

public class horaDeCodar2Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador = 0;
        double soma = 0;
        
        for (int i = 1; i < 5; i++) {
            System.out.print("Informe o número " + i + ": ");
            double numero = input.nextDouble();

            if (numero > 0 && numero < 10) {
                soma += numero;
                contador++;
            } else {
                System.out.println("Número fora do intervalo permitido (0 < número < 10).");
            }
        }

        if (contador > 0) {
            double media = soma / contador;

            System.out.println("Média dos números válidos: " + media);

            if (media > 5) {
                System.out.println("Você passou no teste");
            } else {
                System.out.println("Tente novamente");
            }
        } else {
            System.out.println("Nenhum número válido foi informado.");
        }
    }
}
