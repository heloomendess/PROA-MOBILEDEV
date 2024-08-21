/*
2- Crie uma array de planetas que inclua "Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno"  e, em seguida,
peça ao usuário para digitar o nome de um planeta. 
Verifique se o planeta que o usuário informou está na array e informe ao usuário.
*/

fun main() {
    val planetas = arrayOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno")

    println("Digite o nome de um planeta:")
    val planetaInformado = readLine()

    if (planetaInformado in planetas) {
        println("O planeta informado está na lista!")
    } else {
        println("O planeta informado não está na lista.")
    }
}