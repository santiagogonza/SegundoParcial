/**********************************************************
 Autor:Gonzalo Santiago García						      *
 Fecha_de_Imicio: 5 de abril del 2022				      *
 Fecha_de_actualización: 5/04/2022  				      *
 Descripción: realiza el calculo de factura de una compra *
 **********************************************************/
package ejercicio7;
import java.util.Scanner;

public class Principal {
	private static Scanner fac= new Scanner(System.in);
    static Factura factur;
	public static void main(String[] args) {
	factur=new Factura();
		// TODO Auto-generated method stub
		
	System.out.println(" ingrese el total de compra: ");
	double factu =fac.nextDouble();
	
		factur.setSubtotal(factu);
		factur.imprimirFactu();
	}
}