package es.cic.ejerc002;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	private ICalculadora calculadora;
	
	/*
	 * Se ejecuta antes del test
	@BeforeAll
	*/

	//Se ejecuta antes de cada test
	@BeforeEach
	void setUp() throws Exception 
	{
		this.calculadora = new Calculadora();
	}

	@Test
	void testSumar() {
		calculadora.sumar(5.6);
		calculadora.sumar(3.2456);
		
		double resultado = calculadora.getResultado();
	    assertEquals(8.8456, resultado, 0.00001);
	}

	@Test
	void testRestar() {
		calculadora.restar(-3.4);
		calculadora.restar(3.2);
		double resultado = calculadora.getResultado();
		assertEquals(0.2, resultado, 0.00001);
	}

	@Test
	void testMultiplicar() 
	{
		calculadora.sumar(1.5);
		calculadora.multiplicar(3.2);
		
		double resultado = calculadora.getResultado();
		assertEquals(4.8, resultado, 0.00001);
	}

	@Test
	void testDividir() {
		calculadora.sumar(4.8);
		calculadora.dividir(3.2);
		
		double resultado = calculadora.getResultado();
		assertEquals(1.5, resultado, 0.00001);
	}

}
