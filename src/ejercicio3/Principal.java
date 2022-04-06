/*******************************************************
 Autor:Gonzalo Santiago García						   *
 Fecha_de_Imicio: 5 de abril del 2022				   *
 Fecha_de_actualización: 5/04/2022  				   *
 Descripción: realiza la conversion de pesos a dolares *
 *******************************************************/

package ejercicio3;

import java.util.Scanner;

public class Principal {
	private static Scanner cv=new Scanner(System.in);
	private static Conversion2 conversion2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ingrese un valor de dolar");
		double dolar =cv.nextDouble();
	
	conversion2 =new Conversion2();
	
		conversion2.setDolar(dolar);

		conversion2.imprimirConver();
	

	}

}


