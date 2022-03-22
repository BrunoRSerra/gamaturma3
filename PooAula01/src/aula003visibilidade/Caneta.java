package aula003visibilidade;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	public void status() {
		System.out.println("Uma caneta da cor: "+this.cor);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Com a ponta: "+this.ponta);
		System.out.println("Sua carga esta em :"+this.carga+" %");
		System.out.println("Esta tampada?: "+this.tampada);
		
	}
	
	public void rabisca() {
		if(this.tampada==true) {
			System.out.println("ERRo! Não posso rabiscar");
		}else {
			System.out.println("Estou rabiscando");
		}
		
	}
	
	public void tampar() {
		this.tampada=true;
		
	}
	public void destampar() {
		this.tampada= false;
		
	}
	

}
