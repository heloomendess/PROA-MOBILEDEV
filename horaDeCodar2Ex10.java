import java.util.Scanner;

public class horaDeCodar2Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe sua altura em metros (Ex. 1,70): ");
        double altura = input.nextDouble();

        System.out.print("Informe seu sexo (1 para feminino, 2 para masculino): ");
        int sexo = input.nextInt();

        double pesoIdeal;
        if (sexo == 1) {
            // Sexo feminino
            pesoIdeal = (62.1 * altura) - 44.7;
        } else if (sexo == 2) {
            // Sexo masculino
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            System.out.println("Sexo inválido. Informe 1 para feminino ou 2 para masculino.");
            return;
        }
        System.out.printf("Seu peso ideal é: %.2f kg\n", pesoIdeal);
    }
}
