/*
6. Faça um programa que receba quatro valores informados pelo usuário, mas informe somente o primeiro,
o último e o maior de todos eles (considere que todos os números informados serão diferentes)
 */

import java.util.Scanner;

public class horaDeCodar2Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        float n1 = input.nextFloat();

        System.out.println("Informe o segundo número: ");
        float n2 = input.nextFloat();

        System.out.println("Informe o terceiro número: ");
        float n3 = input.nextFloat();

        System.out.println("Informe o quarto número: ");
        float n4 = input.nextFloat();

        //float nMaior = 0;

        if (n1 > n2 && n1 > n3 && n1 > n4) {
            System.out.println("O número maior é o número 1 (" + n1 + ")");
        } else if (n2 > n3 && n2 > n1 && n1 > n4) {
            System.out.println("O número maior é o número 2 (" + n2 + ")");
        } else if (n3 > n4 && n3 > n1 && n3 > n2 ) {
            System.out.println("O número maior é o número 3 (" + n3 + ")");
        } else {
            System.out.println("O número maior é o número 4 (" + n4 + ")");
        }

        System.out.println("O primeiro número é o: " + n1);
        System.out.println(" O quarto número é o: " + n4);

    }
}
