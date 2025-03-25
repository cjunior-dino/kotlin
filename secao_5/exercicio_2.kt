fun main(){
    var lista = mutableListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    var soma: Int

    soma = lista.reduce { acumulador, valor -> acumulador + valor }
    println("Soma: $soma")
}