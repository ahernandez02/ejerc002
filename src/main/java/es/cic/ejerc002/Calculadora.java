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

public class Calculadora 
{
	private double resultado;
	
	public double getResultado() { return resultado; }
	
	public void sumar(double sumando)
	{
	  	this.resultado += sumando;	  	
	}
	public void restar(double restando)
	{
	 	this.resultado -= restando;
	}
	public void multiplicar(double factor)
	{
		this.resultado *= factor;
	}
	public void dividir(double dividendo)
	{
		this.resultado /= dividendo;
	}
	
}


