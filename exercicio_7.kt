

fun main(){
    println("Informe o valor da Variavel A:")
    var a: Any = readLine()!!
    println("Informe o valor da Variavel B:")
    var b: Any = readLine()!!
    var c: Any = a
    println("Valor de A: $a\nValor de B: $b")
    a = b
    b = c

    println("Valor trocado de A: $a\nValor trocado de B: $b")
    
}