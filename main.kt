fun main() {
    var nomeHotel = "Hotel Terabithia";

    //var nomeDosHospedes = listOf("Fulano", "Beltrano", "Ciclano")
    //Lista imutavel, não pode ser alterada

    var nomeHospedes = mutableListOf("Jorge", "Paulo", "João", "Maria")
    //Lista mutável. pode ser alterada

    //Adicionando um novo hospede na lista
    nomeHospedes.add("José")
    println(nomeHospedes)

    //Removendo um hospede da lista
    nomeHospedes.remove("João")

    //Cliente digita o nome do hospede
    println("Digite o nome do hospede: ")
    var hospede = readln();

    //Encontrando um hospede na lista
    println(nomeHospedes.contains(hospede))

    //Adicionando ou verificando hospedes
    if (nomeHospedes.contains(hospede)) {
        println("$hospede está na lista dos hospedes")
        println("\n")
    } else {
        println("\n")
        println("$hospede não está na lista de hospedes")
        nomeHospedes.add(hospede)
        println("$hospede foi adicionado.")
        println("Lista de hospedes atualizada: $nomeHospedes")
        println("\n")
    }

    //Indices
    println("O primeiro hospede é: ${nomeHospedes[0]}")
    println("O segundo hospede é: ${nomeHospedes[1]}")
    println("O terceiro hospede é: ${nomeHospedes[2]}")

    //For
    println("\n")
    for (hospede in nomeHospedes) {
        println("Enviando email para: $hospede")
        println("O valor da diária é de R$100,00")
        println("Obrigada por se hospedar no $nomeHotel!")
        println("\n")
    }
}