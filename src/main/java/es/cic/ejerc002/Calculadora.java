package es.cic.ejerc002;

//documentacion: javadoc

/*
* JAVA (alcance)
* 
* public
* private
* protected
* package
* 
*/

public class Calculadora implements ICalculadora 
{
	private double resultado;
	
	@Override
	public double getResultado() { return resultado; }
	
	@Override
	public void sumar(double sumando)
	{
	  	this.resultado += sumando;
	}
	@Override
	public void restar(double restando)
	{
	 	this.resultado -= restando;
	}
	@Override
	public void multiplicar(double factor)
	{
		this.resultado *= factor;
	}
	@Override
	public void dividir(double dividendo)
	{
		this.resultado /= dividendo;
	}
	public void reset() 
	{
		this.resultado = 0;
	}
	
}


