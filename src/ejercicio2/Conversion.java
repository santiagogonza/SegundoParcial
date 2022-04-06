/*******************************************************
 Autor:Gonzalo Santiago García						   *
 Fecha_de_Imicio: 5 de abril del 2022				   *
 Fecha_de_actualización: 5/04/2022  				   *
 Descripción: realiza la conversion de dolar a pesos   *
 *******************************************************/
package ejercicio2;


public class Conversion {

	private double mxn;
	private double dolar= 20.00;
		//return mxn;
	
	public void setMxn(double mxn) {
		this.mxn = mxn;
	}
	public double getDolar() {
		return dolar;
	}
	public void setDolar(double dolar) {
		this.dolar = dolar;
	}
	public double getConver() {
		return mxn/dolar;
	}
	public void imprimirConver() {
		System.out.println("la conversión es: "+this.getConver());
	}
	
}