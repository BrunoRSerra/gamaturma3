package aulas_exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		int numero,resultado;
		int limiteTabuada =10;
		System.out.println("Digite um número para saber a tabuaa");
		numero= teclado.nextInt();
		System.out.println("A tabuada de  "+numero);
		
		for(int mutilplicador =0;mutilplicador<=limiteTabuada ;mutilplicador++) {
		//	numero = mutilplicador*numero;
			resultado = mutilplicador*numero;
			System.out.println(mutilplicador+" x "+numero+" = "+resultado);
			
		}
		
		
	}

}
