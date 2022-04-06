/**********************************************************
 Autor:Gonzalo Santiago García						      *
 Fecha_de_Imicio: 5 de abril del 2022				      *
 Fecha_de_actualización: 5/04/2022  				      *
 Descripción: realiza el calculo de factura de una compra *
 **********************************************************/
package ejercicio7;


public class Factura {
	
	private double iva =16;
	private double subtotal;
	private double factu;
	
	
	public double getIva() {
		return iva;
	}
	public void Factu(double factu, double subtotal) {
		
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getFactu() {
		return factu;
	}
	public void setFactu(double factu) {
		this.factu = factu;
	}
	public double fac() {
		return subtotal+(subtotal/100)*iva;
	}
	public void imprimirFactu() {
		System.out.println("el total a pagar es: "+fac());
	}
}
