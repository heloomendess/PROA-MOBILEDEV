/*
3- Vamos criar uma lista de compras. 
Crie uma array de frutas, exiba-a ao usuário e, em seguida, peça ao usuário para digitar o nome de uma das frutas.
Caso a fruta esteja no array, remova-a e exiba a mensagem "Fruta foi retirada da lista". 
Peça novamente para o usuário digitar o nome de uma fruta para ser removida. 
Sempre que o usuário procurar por uma fruta que não está no array exiba a mensagem "Fruta indisponível no nosso 
mercado". 
Quando o array não possuir mais itens dentro de si, escreva "Lista de compras finalizada".
*/

fun main() {
    val frutas = arrayOf("banana", "maçã", "uva", "laranja", "melancia", "melão", "morango", "abacaxi", "mamão", 
    "pera", "kiwi", "limão", "tangerina", "maracujá")

    println("Vamos criar uma lista de compras!")
    println("Digite o nome da fruta desejada: ")
    val frutaInformada = readLine()

    if (frutaInformada in frutas) {
        frutas.remove(frutaInformada)
        println("Fruta foi retirada da lista")
    } else {
        println("Fruta indisponível no mercado")
    }
        frutas.remove(frutaInformada)
        println("Fruta foi retirada da lista")
    } else {
        println("Fruta indisponível no nosso mercado")
    }

    println("Digite o nome da próxima fruta a ser removida: ")
    val proximaFruta = readLine()

    if (frutas.isEmpty()) {
        println("Lista de compras finalizada")
    } else {
        if (proximaFruta in frutas) {
            frutas.remove(proximaFruta)
            println("Fruta foi retirada da lista")
        } else {
            println("Fruta indisponível no nosso mercado")
        }
}