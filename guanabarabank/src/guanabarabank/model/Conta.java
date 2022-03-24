package guanabarabank.model;

public class Conta {
	public String dono;
	private int numeroConta;
	private double saldo;
	
	
	
	public Conta(String dono, int numeroConta,double saldo) {
		this.fechada();
		this.numeroConta = numeroConta;
		this.dono= dono;
		this.saldo= saldo;
		
	}
	public boolean saque(double valorSaque) {
		if(saldo>valorSaque) {
			saldo-=valorSaque;
			return true;
		}else {
			System.out.println("Você não tem saldo ");
			return false;
		}
	}
	
	public boolean numerodaConta() {
		if(this.numeroConta>0) {
			return true;
		}else {
			System.out.println("Você não tem saldo o suficiente");
			return false;
		}
	}
	
	public boolean deposita(double valorDeposito) {
		if(valorDeposito<0) {
			saldo += valorDeposito;
			return true;
		}else {
			System.out.println("Valor depoisto invalido");
			return false;
		}
	}
	public void visiibilidade() {
		System.out.println("Titular"+this.getDono());
		System.out.println();
	}
	
	public boolean aberta() {
		return true;
	}
	public boolean fechada() {
		return false;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
}
