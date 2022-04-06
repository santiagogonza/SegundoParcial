/*******************************************************
 Autor:Gonzalo Santiago García						   *
 Fecha_de_Imicio: 5 de abril del 2022				   *
 Fecha_de_actualización: 5/04/2022  				   *
 Descripción: realiza la conversion de pesos a dolares *
 *******************************************************/
package ejercicio3;



	public class Conversion2 {
		private double dolar;
		private double mxn=19.98;
		
		public double getDolar() {
			return dolar;
		}
		public void setDolar(double dolar) {
			this.dolar = dolar;
		}
		public double getMxn() {
			return mxn;
		}
		public void setMxn(double mxn) {
			this.mxn = mxn;
		}
		public double getConvert() {
			return dolar*mxn;
		}
			public void imprimirConver() {
				System.out.println("conversión de dolar a pesos es: "+this.getConvert());
		}

	}
	

	
	

