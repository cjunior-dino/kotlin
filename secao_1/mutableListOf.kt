fun main(){
    var numeros = mutableListOf(42, 29, 31, 4, 7, 12) // #Mutavel
    var listaVazia = mutableListOf<Int>()

    println(numeros.size) // Tamanho da lIsta
    println(listaVazia.isEmpty()) //Lista Vazia ?
    println(numeros.isNotEmpty()) //Lista não vazia

    println(numeros[0]) //Acesso por Indice 
    println(numeros[1]) //Acesso por Indice
    
    println(numeros.first()) //Primeiro Elemento
    println(numeros.last()) // Ultimo Elemento

    println(numeros.getOrNull(4)) // Elemento encontrado ou Nulo
    println(numeros.getOrNull(0)) // Elemento encontrado ou Nulo

}