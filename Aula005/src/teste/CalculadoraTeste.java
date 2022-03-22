package teste;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import main.Calculadora;


public class CalculadoraTeste {
	private Calculadora c = new Calculadora();
	private double resultado;
	
	@BeforeEach
		public void setup() {
		c = new Calculadora();
	}
	@Test
	public void deveRetornarsoma() {
		resultado = c.somar(10,20);
		assertEquals(30,resultado);
		
				
	}
	@Test
	public void retornaSubtracao() {
	resultado = c.subtracao(20,10);
	assertEquals(10, resultado);
	}
	@Test
	public void retornarDivisaoDifDeZero() {
		resultado = c.dividir(10,2);
		assertEquals(5, resultado);
	}
	@Test
	public void retornarDivisaoNegativoDifDeZero() {
		resultado = c.dividir(10,0);
		assertEquals(-1, resultado);
	}
	@Test
	public void retornaMultiplicacao() {
	resultado = c.multiplicar(5,2);
	assertEquals(10, resultado);
	}
	
	
	
	

}
