package projetofinal.model;

public class ContaCorrenteEspecial extends Conta {
	
		    private double limite;

	    public ContaCorrenteEspecial(int numeroConta, double saldo, double limite){
	        super(numeroConta, saldo);
	        this.limite = limite;
	    }

	    public double getLimite() {
	        return limite;
	    }

	    @Override
	    public String saca(double valorDoSaque) {
	        if(valorDoSaque <= getSaldo()+limite) {
	            return super.saca(valorDoSaque);
	        }
	        return "Saldo insuficiente";
	    }

	    @Override
	    public String deposita(double valorDeposito) {
	            return super.deposita(valorDeposito);
	        }
	    
}
