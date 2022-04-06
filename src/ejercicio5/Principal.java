/*************************************************************************************************
 Autor:Gonzalo Santiago García																     *
 Fecha_de_Imicio: 5 de abril del 2022														     *
 Fecha_de_actualización: 5/04/2022  				  											 *
 Descripción:realiza el cálculo de area del rectangulo       									 *
 *************************************************************************************************/

package ejercicio5;

import java.util.Scanner;

public class Principal {
	private static Scanner sc = new Scanner(System.in);
	private static Rectangulo rectangulo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ingrese la base: ");
		double base = sc.nextDouble();

		System.out.println("ingrese la altura: ");
		double altura = sc.nextDouble();

		rectangulo = new Rectangulo();

		rectangulo.setBase(base);
		rectangulo.setAltura(altura);
		rectangulo.imprimirArea();

	}

}
