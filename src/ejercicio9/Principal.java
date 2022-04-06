/**********************************************************
 Autor:Gonzalo Santiago García						      *
 Fecha_de_Imicio: 5 de abril del 2022				      *
 Fecha_de_actualización: 5/04/2022  				      *
 Descripción: calcula el volumen de un cono               *
 **********************************************************/
package ejercicio9;

import java.util.Scanner;

public class Principal {
	private static Scanner vol=new Scanner(System.in);
	private static Cono cono;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.err.println("ingrese el radio del cono: ");
		double radio =vol.nextDouble();
		
		System.out.println("ingrese la altura del cono: ");
		double altura=vol.nextDouble();
		
		cono = new Cono();
		
		cono.setRadio(radio);
		cono.setAltura(altura);
		cono.imprimirVol();
		
		
	}

}
