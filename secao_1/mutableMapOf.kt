fun main(){
    // Imutavel
    val mapaImutavel = mapOf("x" to 10, "y" to 20, "z" to 30)
    println(mapaImutavel)

    // Mutavel
    val mapaMutavel = mutableMapOf("nome" to "Will", "idade" to 29, "linguagem" to "Python")
    print(mapaMutavel)

    val mapaVazio = mutableMapOf<String, Int>()
    println(mapaVazio)

    // Adicionar Chave e Valor
    mapaMutavel["Cidade"] = "Manaus"
    println(mapaMutavel)

    // Adicionar Varias chaves e Valores
    mapaMutavel.putAll(mapOf("Sobrenome" to "Ferreira", "Casa" to 461))
    println(mapaMutavel)
}