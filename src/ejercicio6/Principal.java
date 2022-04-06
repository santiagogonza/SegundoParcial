/*************************************************************************************************
 Autor:Gonzalo Santiago García																     *
 Fecha_de_Imicio: 5 de abril del 2022														     *
 Fecha_de_actualización: 5/04/2022  				  											 *
 Descripción:realiza el cálculo de area del triangulo        									 *
 *************************************************************************************************/

package ejercicio6;
import java.util.Scanner;

public class Principal {
	private static Scanner sca= new  Scanner(System.in);
	private static Triangulo triangulo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ingrese la base del triangulo: ");
		double base =sca.nextDouble();
		
		System.out.println("ingrese la altura del triangulo: ");
		double altura=sca.nextDouble();
		
		triangulo = new Triangulo();
		
		triangulo.setBase(base);
		triangulo.setAltura(altura);
		triangulo.imprimirArea();
	}

}
