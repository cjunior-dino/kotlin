

fun main(){
    var caractere: String?
    println("Digite um caracter: ")
    caractere = readLine()

    when (caractere?.lowercase()) {
        "a", "e", "i", "o", "u" -> println("É vogal!")
        else -> println("É consoante!")
    }
}