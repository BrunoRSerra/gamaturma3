package carromodelo;

public class Carro {
	int ano;
	String modelo;
	String cor;
	int qtdePortas;
	int capidadePortaMalas;
	int capacidadeTanque;
	int qtdePassageiros;
	boolean etanol;
	boolean gasolina;
	boolean hibrido;
	boolean estepe;
	
	void Carro(){
		
	}
	void mostraCarro() {
		System.out.println("Ano de fabrica��o: "+this.ano);
		System.out.println("Modelo "+this.modelo);
		System.out.println("Cor "+this.cor);
		System.out.println("Portas "+this.qtdePortas);
	}
	
	void passageiros() {
		if(this.qtdePassageiros>0 && this.qtdePassageiros<7) {
			System.out.println("Passageiros: "+this.qtdePassageiros);

		}else {
			System.out.println("N�mero de passageiros incop�tivel");

		}
		
	}
	
	void portaMalas() {
		if(this.capidadePortaMalas>20 && this.capidadePortaMalas<=400) {
			System.out.println("Capaciddade em listro do porta Malas "+this.capidadePortaMalas);

		}else {
			System.out.println("Capacidade inv�lida");

		}
	}
	void validatanque() {
		if(this.capacidadeTanque>=30 && this.capacidadeTanque<=80) {
			System.out.println("O tanque tem capacidade para "+this.capacidadeTanque+" l");

		}else
			System.out.println("Capacidade incom�tivel para carro");

	}
	
	void validaAno() {
		if(this.ano<=1900) {
			System.out.println("Esse ano esta inv�lido");
		}
	}
	
	
	
}
