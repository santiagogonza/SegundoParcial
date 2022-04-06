/*******************************************************
 Autor:Gonzalo Santiago García						   *
 Fecha_de_Imicio: 5 de abril del 2022				   *
 Fecha_de_actualización: 5/04/2022  				   *
 Descripción: realiza la conversion de dolar a pesos   *
 *******************************************************/

package ejercicio2;
import java.util.Scanner;
public class Principal {
	private static Scanner sc= new Scanner(System.in);
	private static Conversion conversion;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ingrese un valor mxn");
		double mxn = sc.nextDouble();
	
		conversion =new Conversion();
		

		
		conversion.setMxn(mxn);

		conversion.imprimirConver();
	

	}

}
	
	
	