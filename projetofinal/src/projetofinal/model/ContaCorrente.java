package projetofinal.model;

public class ContaCorrente extends Conta {

    public ContaCorrente(int numeroConta, double saldo){
        super(numeroConta, saldo);
    } 
    
    @Override
    public String saca(double valorDoSaque) {
        if(valorDoSaque <= getSaldo()) {
            return super.saca(valorDoSaque);
        }
        return "Saldo insuficiente";
    }

    @Override
    public String deposita(double valorDoDeposito) {
        return super.deposita(valorDoDeposito);
    }
	
	
	
}
