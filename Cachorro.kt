class Cachorro(val nome: String, val raca: String, val idade: Int){
    fun imprimir(){
        println("Nome: $nome \nIdade: $idade anos \nRaça: $raca ")
    }
    
    fun main(){
        
        val Cachorro = Cachorro("Luke","vira-lata",1)
        println("Nome: $nome \nIdade: $idade anos \nRaça: $raca")
    }
}
