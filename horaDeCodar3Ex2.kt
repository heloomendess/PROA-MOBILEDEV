/*
Crie uma bomba relógio (usando somente código - para deixar claro!) cuja contagem regressiva vá de 30 a 0.
No final da repetição escreva "EXPLOSÃO".
 */

fun main() {
    for (tempo in 30 downTo 0) {
        println(tempo)
        Thread.sleep(1000)
    }

    println("EXPLOSÃO!!!!")
}