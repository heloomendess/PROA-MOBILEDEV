/*
7. Faça um programa que leia 6 números que o usuário vai informar. Todos os números lidos com valor inferior
a 72 devem ser somados. Escreva o valor final da soma efetuada e também todos valores que o usuário informou.
 */
import java.util.Scanner;

public class horaDeCodar2Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[6];
        int soma = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("Informe o número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();

            // Soma se o número for inferior a 72
            if (numeros[i] < 72) {
                soma += numeros[i];
            }
        }

        // Exibição dos resultados
        System.out.println("\nSoma dos números inferiores a 72: " + soma);
        System.out.print("Números informados: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
