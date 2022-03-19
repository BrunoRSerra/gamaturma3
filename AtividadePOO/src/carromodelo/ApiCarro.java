package carromodelo;

public class ApiCarro {
	public static void main(String[] args) {
		
		Carro carro= new Carro();
		carro.ano= 1990;
		carro.capacidadeTanque=29;
		carro.qtdePassageiros=2;
		carro.cor="Azul";
		carro.capidadePortaMalas=50;
		carro.modelo="Carmar";
		carro.validaAno();
		carro.validatanque();
		carro.portaMalas();
		carro.passageiros();
		
		
		carro.mostraCarro();
		
		
	}
}
