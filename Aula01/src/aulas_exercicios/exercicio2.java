package aulas_exercicios;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double salario, parcela, prestacao;
		
		
		System.out.println("Qual seu salário ");
		salario = teclado.nextDouble();
		System.out.println("Digite o valor da prestação  ");
		prestacao = teclado.nextDouble();
	
		
		
		parcela = salario*0.30;
		
		if(prestacao<=parcela) {
			System.out.println("Você pode pegar pegar o emprestimo");
		
		}else {
			System.out.println("Não pode pegar o emprestimoo");
		}
		
		System.out.println(parcela);
		
		
	}

}
