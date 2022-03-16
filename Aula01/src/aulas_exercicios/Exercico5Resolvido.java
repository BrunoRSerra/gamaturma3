package aulas_exercicios;

import java.util.Scanner;

public class Exercico5Resolvido {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int numero,soma,total=0;
		
		numero=1;
		soma=0;
		while( numero !=0) {
			System.out.println("Digite um numero ");
			numero= teclado.nextInt();
			soma += numero;
			total++;
			
		}
		System.out.println("O valor total foi de "+soma);
		System.out.println("o Total de numero somados foi "+total);
	}

}
