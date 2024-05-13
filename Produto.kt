class Produto(val nome: String, val preco: Double, val quantidade: Int) {
    fun calcularTotal(){
        println(preco*quantidade)
    }
    
    fun main() {
        val produto = Produto("Cereal", 80.00,3)
    }
}
