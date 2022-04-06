/*************************************************************************************************
 Autor:Gonzalo Santiago García																     *
 Fecha_de_Imicio: 5 de abril del 2022														     *
 Fecha_de_actualización: 4/04/2022  				  											 *
 Descripción: realiza la suma, resta, multiplicacion, divicion;											 *
 *************************************************************************************************/

package ejercicio4;
	import java.util.Scanner;
	
public class Principal {
	
	private static Scanner res=new Scanner(System.in);
	private static Tabla tabla;
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		res=new Scanner(System.in);
		
		System.out.println("ingrese un valor: ");
		double num1 = res.nextDouble();
		
		System.out.println("ingresa el segundo numero: ");
		double num2 =res.nextDouble();
		
		tabla =new Tabla();
		
		tabla.setNum1(num1);
		tabla.setNum2(num2);
		//tabla.impripirResultado();
		tabla.impripirResultado1();
		
	}
	
}	