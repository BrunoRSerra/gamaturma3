package projetofinal.model;


public abstract class  Conta {
	
	private int numeroConta;
	private int numeroAgencia;
	protected double saldo;
	
	public Conta(int numeroConta,int numeroAgencia, double saldo) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta= numeroConta;
		this.saldo= saldo;
	}
	
	
	 public  double deposita(double valorDeposito) {
		if(valorDeposito>0) {
			return saldo+=valorDeposito;	
		}else {
			System.out.println("Valor inválido");
			return saldo;
		}


	 }

	public int getNumeroConta() {
		return numeroConta;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public double getSaldo() {
		return saldo;
	}

	
}
