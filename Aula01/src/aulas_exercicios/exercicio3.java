package aulas_exercicios;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Digite um numero ");
		numero= teclado.nextInt();
		
		for(int contador=1;contador<=numero;contador++) {
			System.out.print("-"+contador);
		}
		
	}

}
