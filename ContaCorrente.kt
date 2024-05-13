class ContaCorrente(val numConta: Int, var saldo: Double){
    fun depositar(valor: Double){
		saldo -= valor        
    }
    
    fun sacar(valor: Double){
        saldo += valor
    }
    
    fun imprimir(){
        println("número da conta: $numConta\nsaldo: $saldo")        
    }
 
    fun main(){      
        val continha = ContaCorrente(1458, 571.99)
        println("número da conta: $numConta\nsaldo: $saldo")
    }
    
}
