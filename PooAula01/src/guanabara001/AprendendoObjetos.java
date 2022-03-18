package guanabara001;

import java.util.Scanner;

public class AprendendoObjetos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Caneta c1 = new Caneta();
		c1.cor="azul";
		c1.modelo ="bic";
		c1.ponta=0.5f;
		c1.carga=100;
		c1.tampar();
		c1.rabisca();
		c1.status();
		
		String lercor;
		String modelo;
		
		Caneta c2 = new Caneta();
		System.out.println("Digite a cor da caneta");
		lercor = ler.next();
		System.out.println("Qual  a marcar?");
		modelo = ler.next();
		c2.modelo=modelo;
		c2.cor = lercor;
		c2.destampar();
		c2.rabisca();
		
		c2.status();
	}

}
