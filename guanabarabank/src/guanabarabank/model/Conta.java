package guanabarabank.model;

public class Conta {
	public int numeroConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	
	public Conta() {
		saldo =0;
		status= false;
	}
	public void setStatus(boolean st) {
		this.status = st;
	}
	
	public boolean getStatus() {
		return status;
	}
	public void setSaldo(double s) {
		this.saldo = s;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void setNumeroConta(int n) {
		this.numeroConta = n;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setTipo(String t) {
		this.tipo = t;
	}
	public String getTipo() {
		return tipo;
	}
	public void setDono(String d) {
		this.dono = d;
	}
	public String getDono() {
		return dono;
	}
	
	public void abrirConta(String t) {
		setTipo(t);
		setStatus(true);
		if(t =="CC" ||t=="cc") {
			setSaldo(50);
		}else if(t =="CP" || t=="cp") {
			setSaldo(150);
		}
		
	}
	public void fechaConta() {
		if(saldo>0){
			System.out.println("Conta tem saldo");
			System.out.println(getSaldo());
		}else if(saldo<0) {
			System.out.println("Saldo negativo precisa zerar");
			System.out.println(saldo);
		}else {
			setStatus(false);
		}
	}
	public void depositar(double v) {
		if(getStatus()==true) {
			setSaldo(getSaldo()+v);
		}else {
			System.out.println("Impossível depositar");
		}
		
	}
	public void sacar(double v) {
		if(getStatus()==true) {
		}else {
			System.out.println("Impossível depositar");
		}
		if(getSaldo()>v) {
			setSaldo(getSaldo()-v);
		}else {
			System.out.println("Sem saldo");
		}
	}
	
	public void pagarMensalidade() {
		int v;
		if(getTipo()=="cc" || getTipo()=="CC") {
			v=12;
		}else if(getTipo()=="cp"|| getTipo()=="CP"){
			v=20;
		}
	}if(getStatus()== true) {
		if(getSaldo()>v) {
			setSaldo(getSaldo()-v);
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	
}
