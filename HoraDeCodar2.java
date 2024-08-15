import java.util.Scanner;

public class HoraDeCodar2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maior = 0;

        for (int i = 1; i <= 2; i++) {
            System.out.println("Digite 2 números: ");
            int numero = input.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("O maior número é: " + maior);
    }


}
