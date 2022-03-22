package aula003visibilidade;

import java.util.Scanner;

public class AprendendoObjetos {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		c1.modelo="Big Cristal";
		c1.cor="Azul";
		c1.carga=30;
		//c1.tampada=false;
		c1.destampar();
		c1.status();
		
		
	}

}
