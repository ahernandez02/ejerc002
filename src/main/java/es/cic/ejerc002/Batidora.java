package es.cic.ejerc002;

public class Batidora 
{
	private double totalTiempo;
	private ICalculadora calculadora; //Debe implementar alguna de las interfaces en los test 
									 //"conectar"
	
	public double getTotalTiempo() 
	{
		return this.totalTiempo;
	}

	public void calcularTiempoTotal(double tiempoIng1, double tiempoIng2)
	{	
		this.calculadora.reset();
		
		calculadora.sumar(tiempoIng1);
		calculadora.sumar(tiempoIng2);
		
		this.totalTiempo = calculadora.getResultado();
	}

	public ICalculadora getCalculadora() {
		return calculadora;
	}

	public void setCalculadora(ICalculadora calculadora) {
		this.calculadora = calculadora;
	}	
}
