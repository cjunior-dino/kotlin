import kotlin.text.toDouble
fun main(){
    println("Informe o primeiro Numero: ")
    var n1: Double = readLine()!!.toDouble()
    println("Informe o primeiro Numero: ")
    var n2: Double = readLine()!!.toDouble()
    println("Informe o primeiro Numero: ")
    var n3: Double = readLine()!!.toDouble()

    var soma = n1+n2
    var mult = n2*n3

    println("A soma do dois primeiros é: $soma   \nA multiplicação do dois ultimos é: $mult")
}