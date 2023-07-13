package es.cic.ejerc002;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BatidoraIntegrationTest {
	
	private Batidora cut;
	private ICalculadora dependencia;

	@BeforeEach
	void setUp() throws Exception 
	{
		cut = new Batidora();
		dependencia = new Calculadora();
		cut.setCalculadora(dependencia);
	}

	@Test
	void testCalcularTiempoTotal() 
	{
		cut.calcularTiempoTotal(1.5, 3.25);
		assertEquals(4.75, cut.getTotalTiempo(), 0.01);
	}

}
