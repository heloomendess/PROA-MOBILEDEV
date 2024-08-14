import java.util.Scanner;

public class horaDeCodar1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeDoCarro = "Fusca";

        System.out.println(nomeDoCarro);

        System.out.println("Qual é o seu nome?");
        String nomeDoUsuario = input.next();

        System.out.println("Olá, " + nomeDoUsuario);

        System.out.println("Quantos anos você tem?");
        int idade = input.nextInt();

        System.out.println("Olá, " + nomeDoUsuario + " você tem " + idade + " anos.");

        System.out.printf("\n");
        // Areas de Figuras planas

        // Retangulo
        System.out.printf("Bem-vindos a área do retangulo :) \n");

        System.out.println("Informe o valor da base: ");
        float base = input.nextFloat();

        System.out.println("Informe o valor da altura: ");
        float altura = input.nextFloat();

        float areaDoRetangulo = (base * altura);

        System.out.println("Área do retangulo: " + areaDoRetangulo);

        System.out.printf("\n");
        // Quadrado
        System.out.printf("Bem-vindos a área do quadrado :) \n");

        System.out.println("Informe o valor do lado: ");
        float lado = input.nextFloat();

        float areaDoQuadrado = (lado * lado);

        System.out.println("Área do quadrado: " + areaDoQuadrado);

        System.out.printf("\n");
        // Losango
        System.out.printf("Bem-vindos a área do losango :) \n");

        System.out.println("Informe o valor da diagonal maior: ");
        float diagonalMaior = input.nextFloat();

        System.out.println("Informe o valor da diagonal menor: ");
        float diagonalMenor = input.nextFloat();

        float areasLosango = (diagonalMaior * diagonalMenor / 2);

        System.out.println("Área do losango: " + areasLosango);

        System.out.printf("\n");
        // Trapézio
        System.out.printf("Bem-vindos a área do losango :) \n");

        System.out.println("Informe o valor da base maior: ");
        float baseMaior = input.nextFloat();

        System.out.println("Informe o valor da base menor: ");
        float baseMenor = input.nextFloat();

        System.out.println("Informe da altura do trapézio: ");
        float alturaTrapezio = input.nextFloat();

        float areasTrapezio = ((baseMaior + baseMenor) * alturaTrapezio / 2);

        System.out.println("Área do trapézio: " + areasTrapezio);

        System.out.printf("\n");
        // Paralelograma
        System.out.printf("Bem-vindos a área do paralelograma :) \n");

        System.out.println("Informe o valor da altura: ");
        float alturaP = input.nextFloat();

        System.out.println("Informe o valor da base: ");
        float baseP = input.nextFloat();

        float areaParalelograma = (alturaP * baseP);

        System.out.println("Área do paralelograma: " + areaParalelograma);

        System.out.printf("\n");
        // Triangulo
        System.out.printf("Bem-vindos a área do triangulo :) \n");

        System.out.println("Informe o valor da altura: ");
        float alturaT = input.nextFloat();

        System.out.println("Informe o valor da base: ");
        float baseT = input.nextFloat();

        float areaTriangulo = (alturaT * baseT / 2);

        System.out.println("Área do triangulo: " + areaTriangulo);

        System.out.printf("\n");
        // Circulo
        System.out.printf("Bem-vindos a área do circulo :) \n");

        System.out.println("O valor de PI é 3,14");

        System.out.println("Informe o valor do raio: ");
        float raio = input.nextFloat();

        float areaCirculo = (3.14f * (raio * raio));

        System.out.println("Área do circulo: " + areaCirculo);

    }
}
