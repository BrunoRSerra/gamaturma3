package exercicio001;

public class AppVaiculo {

	public static void main(String[] args) {

		Carro v1 = new Carro("Chevrole:","Cruze",10);
		v1.mostrar();
		v1.setConsumo(-12);
		System.out.println("Consumo "+v1.getConsumo());
	}

}
