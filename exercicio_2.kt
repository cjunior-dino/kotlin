import kotlin.text.toDouble
fun main(){

    
    println("Informe o seu Salario")
    var sal_base = readLine()!!.toDouble()
    var sal5 = sal_base*0.05
    var imposto = sal_base*0.07
    var sal = (sal_base + sal5) - imposto
    println("O salario a receber é : $sal")
}