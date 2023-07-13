package es.cic.ejerc002;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BatidoraTest {
	
	private Batidora cut;

	@BeforeEach
	void setUp() throws Exception 
	{
		cut = new Batidora();
	}

	@Test
	void testCalcularTiempoTotal() {
		
	    CalculadoraFake calculadoraFake = new CalculadoraFake();
		calculadoraFake.setResultado(4.75);
		
		//remplaza la instancia de la calculadora original con la de la fake
		cut.setCalculadora(calculadoraFake); 
		
		cut.calcularTiempoTotal(1.5, 3.25);
		assertEquals(4.75, cut.getTotalTiempo(), 0.01);
	}

}
