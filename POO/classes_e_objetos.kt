class Carro {
    var marca: String? = null
    var modelo: String? = null
    var ano: Int? = null
}

fun main(){
    val meuCarro = Carro()
    meuCarro.ano = 2025
    println(meuCarro)
    println(meuCarro.ano)
    println(meuCarro.marca)
}