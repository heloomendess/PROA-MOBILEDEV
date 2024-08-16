//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*

fun main() {
     val input = Scanner(System.`in`);

    var nomeDoCarro = "fusca";
    println(nomeDoCarro);

    println("Insira o seu nome: ");
    val nome = input.next();
    println("Olá, " + nome)

    println("Insira a sua idade: ")
    val idade = input.nextInt();

    println("Olá, " + nome + "! Você tem " + idade + " anos")

    println("\n")

    //Areas de figuras planas

    println("Bem-vindos a área do retângulo!")

    System.out.printf("\n")

    println("Informe o valor da base: ")
    val base = input.nextFloat()

    println("Informe o valor da altura")
    val altura = input.nextFloat()

    val areaDoRetangulo = (base * altura)

    println("Área do Retângulo: " + areaDoRetangulo)

    // Quadrado
    System.out.printf("Bem-vindos a área do quadrado :) \n")

    println("Informe o valor do lado: ")
    val lado = input.nextFloat()

    val areaDoQuadrado = (lado * lado)

    println("Área do quadrado: $areaDoQuadrado")

    System.out.printf("\n")

    // Losango
    System.out.printf("Bem-vindos a área do losango :) \n")

    println("Informe o valor da diagonal maior: ")
    val diagonalMaior = input.nextFloat()

    println("Informe o valor da diagonal menor: ")
    val diagonalMenor = input.nextFloat()

    val areasLosango = (diagonalMaior * diagonalMenor / 2)

    println("Área do losango: $areasLosango")

    System.out.printf("\n")

    // Trapézio
    System.out.printf("Bem-vindos a área do losango :) \n")

    println("Informe o valor da base maior: ")
    val baseMaior = input.nextFloat()

    println("Informe o valor da base menor: ")
    val baseMenor = input.nextFloat()

    println("Informe da altura do trapézio: ")
    val alturaTrapezio = input.nextFloat()

    val areasTrapezio = ((baseMaior + baseMenor) * alturaTrapezio / 2)

    println("Área do trapézio: $areasTrapezio")

    System.out.printf("\n")

    // Paralelograma
    System.out.printf("Bem-vindos a área do paralelograma :) \n")

    println("Informe o valor da altura: ")
    val alturaP = input.nextFloat()

    println("Informe o valor da base: ")
    val baseP = input.nextFloat()

    val areaParalelograma = (alturaP * baseP)

    println("Área do paralelograma: $areaParalelograma")

    System.out.printf("\n")

    // Triangulo
    System.out.printf("Bem-vindos a área do triangulo :) \n")

    println("Informe o valor da altura: ")
    val alturaT = input.nextFloat()

    println("Informe o valor da base: ")
    val baseT = input.nextFloat()

    val areaTriangulo = (alturaT * baseT / 2)

    println("Área do triangulo: $areaTriangulo")

    System.out.printf("\n")

    // Circulo
    System.out.printf("Bem-vindos a área do circulo :) \n")

    println("O valor de PI é 3,14")

    println("Informe o valor do raio: ")
    val raio = input.nextFloat()

    val areaCirculo = (3.14f * (raio * raio))

    println("Área do circulo: $areaCirculo")

}

