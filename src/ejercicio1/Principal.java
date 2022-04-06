/*******************************************************
 Autor:Gonzalo Santiago García						   *
 Fecha_de_Imicio: 4 de abril del 2022				   *
 Fecha_de_actualización: 4/04/2022  				   *
 Descripción: realiza la multiplicación de dos números *
 *******************************************************/

package ejercicio1;

public class Principal {
	static Multiplicacion r = new Multiplicacion();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		r.setValor1(5);
		r.setValor2(3);
		
		System.out.println("el resultado es: "+r.Resul());
		
	}

}
