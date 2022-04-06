/**********************************************************
 Autor:Gonzalo Santiago García						      *
 Fecha_de_Imicio: 5 de abril del 2022				      *
 Fecha_de_actualización: 5/04/2022  				      *
 Descripción: calcula el volumen de un cono               *
 **********************************************************/
package ejercicio9;

public class Cono {
	private double radio;
	private double altura;
	private double PI = 3.14;
	
	public Cono() {
		
	}
	public Cono(double radio, double altura) {
		this.radio= radio;
		this.altura=altura;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPI() {
		return PI;
	}

	public void setPI(double pI) {
		PI = pI;
	}

	public double getVol() {
		 return (((1/3)*Math.PI*(this.radio*this.radio)*this.altura));
		 
	 }
	public void imprimirVol() {
		System.out.println("el volumen del cono es: "+this.getVol());
	}

}
