package guanabara001;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	void status() {
		System.out.println("Uma caneta da cor: "+this.cor);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Com a ponta: "+this.ponta);
		System.out.println("Sua carga esta em :"+this.carga+" %");
		System.out.println("Esta tampada?: "+this.tampada);
		
	}
	
	void rabisca() {
		if(this.tampada==true) {
			System.out.println("ERRo! Não posso rabiscar");
		}else {
			System.out.println("Estou rabiscando");
		}
		
	}
	
	void tampar() {
		this.tampada=true;
		
	}
	void destampar() {
		this.tampada= false;
		
	}
	

}
