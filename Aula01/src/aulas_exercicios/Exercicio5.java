package aulas_exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		int numero = 0;
		int resultado=0;
		int digitado;
		int total=0;
		
		
		for(int contador =1;contador>0;contador++) {
			System.out.println("Digite um numero ");
			digitado = teclado.nextInt();
			resultado +=digitado;
			total++;
			if(digitado==0) {
				
				break;
			}
			
		}
		System.out.println("Voc� digitou 0 e por isso o programa parou");
		System.out.println("Voc� digitou "+(total-1)+" n�meros");
		System.out.println("A soma dos valores digitado foi de "+resultado);
			
		
	
			
			
		

					
		
		
	}

}
