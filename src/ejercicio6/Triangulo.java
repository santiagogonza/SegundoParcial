/*************************************************************************************************
 Autor:Gonzalo Santiago García																     *
 Fecha_de_Imicio: 5 de abril del 2022														     *
 Fecha_de_actualización: 5/04/2022  				  											 *
 Descripción:realiza el cálculo de area del triangulo        									 *
 *************************************************************************************************/

package ejercicio6;

public class Triangulo {
	private double base;
	private double altura;
	public Triangulo (double base, double altura) {
		this.base=base;
		this.altura= altura;
		
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
	public Triangulo() {
		
	}
	public double getArea() {
		return (this.base*this.altura)/2;
	}
	public void imprimirArea() {
		System.out.println("El área del triangulo es: "+this.getArea());
	}
	
}
