/*************************************************************************************************
 Autor:Gonzalo Santiago García																     *
 Fecha_de_Imicio: 5 de abril del 2022														     *
 Fecha_de_actualización: 5/04/2022  				  											 *
 Descripción:realiza el calculo de area del rectangulo       									 *
 *************************************************************************************************/

package ejercicio5;

public class Rectangulo {
	private double base;
	private double altura;

	public Rectangulo() {

	}

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArea() {
		return this.base * this.altura;

	}

	public void imprimirArea() {
		System.out.println("el area es: " + this.getArea());
	}

}
