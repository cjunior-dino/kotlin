fun main(){
    var lista = mutableListOf<Int>()

    for (i in 0..9){
        println("Informe o numero da posiçao ${i+1}: ")
        var numero:Int = readLine()!!.toInt()
        lista.add(numero)
    }


}