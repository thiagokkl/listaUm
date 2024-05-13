class Animal(val nome: String, val idade: Int) {
    fun emitirSom(){
        println("RAWRRR")
    }
    
    fun main() {
        val animal = Animal("Tigre", 80)
    }
}
