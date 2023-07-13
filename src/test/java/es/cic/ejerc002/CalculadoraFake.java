package es.cic.ejerc002;

public class CalculadoraFake implements ICalculadora 
{
	private double resultado;
	
	public double getResultado() { return resultado; }
	public void setResultado(double resultado){this.resultado = resultado;}
	
	@Override
	public void sumar(double sumando)
	{
		
	}
	@Override
	public void restar(double restando)
	{
	 	
	}
	@Override
	public void multiplicar(double factor) {

		
	}
	@Override
	public void dividir(double dividendo) {
	
	}
	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}
}
