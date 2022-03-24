package guanabarabank.model;

public class ContaCorrrente extends Conta{

	public ContaCorrrente(String dono, int numeroConta, double saldo) {
		super(dono, numeroConta, saldo);
	}

	@Override
	public boolean saque(double valorSaque) {
		return super.saque(valorSaque);
	}

	@Override
	public boolean numerodaConta() {
		return super.numerodaConta();
	}

	@Override
	public boolean deposita(double valorDeposito) {
		return super.deposita(valorDeposito);
	}

	@Override
	public boolean aberta() {
		return super.aberta();
	}

	@Override
	public boolean fechada() {
		return super.fechada();
	}

	@Override
	public String getDono() {
		return super.getDono();
	}

	@Override
	public void setDono(String dono) {
		super.setDono(dono);
	}

	@Override
	public int getNumeroConta() {
		return super.getNumeroConta();
	}

	@Override
	public void setNumeroConta(int numeroConta) {
		super.setNumeroConta(numeroConta);
	}

	@Override
	public double getSaldo() {
		return super.getSaldo();
	}

	@Override
	public void setSaldo(double saldo) {
		super.setSaldo(saldo);
	}

	@Override
	public void setStatus(boolean status) {
		super.setStatus(status);
	}
	
	
}
