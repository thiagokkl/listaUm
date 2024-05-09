class Pessoa(val nome: String, val idade: Int, val altura: Double){
    fun imprimir(){
        println("Nome: $nome \nIdade: $idade anos \nAltura: $altura m")
    }
    
    fun main(){
        
        val pessoa = Pessoa("Thiago", 17, 1.74)
        println("Nome: $nome \nIdade: $idade anos \nAltura: $altura m")
    }
}
