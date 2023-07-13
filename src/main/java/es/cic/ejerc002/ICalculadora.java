package es.cic.ejerc002;

public interface ICalculadora {

	double getResultado();

	void sumar(double sumando);

	void restar(double restando);

	void multiplicar(double factor);

	void dividir(double dividendo);

	void reset();
}