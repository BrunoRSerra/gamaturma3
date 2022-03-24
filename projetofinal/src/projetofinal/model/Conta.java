package projetofinal.model;


public abstract class  Conta {
	
	   int numeroConta;
	    protected double saldo;

	    public Conta (int numeroConta, double saldo){
	        this.numeroConta = numeroConta;
	        this.saldo = saldo;
	    }
	    
	    public int getNumero() {
	        return numeroConta;
	    }

	    public double getSaldo() {
	        return saldo;
	    }
	        
	    public String  saca(double valorDoSaque) {
	        if(valorDoSaque >= 0) {
	            saldo -= valorDoSaque;
	            return "Saque efetuado";
	        }
	        return "Saldo insuficiente";
	    }

	    public String deposita(double valorDoDeposito){
	        if(valorDoDeposito > 0) {
	            saldo += valorDoDeposito;
	            return "Deposíto Efetudado";
	        }
	        return "Valor inválido para deposito.";
	    }

	 
	
}
