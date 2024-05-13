class Data(var dia: Int, var mes: Int, var ano: Int) {
    fun imprimir() {
        println("$dia,$mes,$ano")
    }
}

fun main() {
    var d = Data(13, 3, 2007)
    d.imprimir()
    
}
