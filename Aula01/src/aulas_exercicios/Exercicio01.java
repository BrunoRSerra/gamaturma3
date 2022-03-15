package aulas_exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		double nota1, nota2,media;
		int total=2;
		double nota=0;
		Scanner ler = new Scanner (System.in);

		System.out.println("Qual a primeira nota: ");
		nota1 = ler.nextDouble();
		
		
		System.out.println("Qual segunda nota: ");
		nota2 = ler.nextDouble();
		
				
		System.out.println("Suas notas "+nota1+" + "+nota2);
		System.out.println(media = (nota1+nota2)/2);
				
				
		
		
	}
	
	

}
