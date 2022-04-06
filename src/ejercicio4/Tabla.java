package ejercicio4;

public class Tabla {
	private double num1;
	private double num2;
	
	public Tabla() {
		
	}
	public Tabla (double num1, double num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public double getResultado() {
		//return this.num1 + this.num2;
		return this.num1  * this.num2;
		
	}
	
	public double getResultado1() {
		//return this.num1 + this.num2;
		return this.num1  * this.num2;
		
	}
	
//	public void impripirResultado() {
	//	System.out.println("la suma es: "+this.getResultado());
		
		public void impripirResultado1() {
			System.out.println("la suma es: "+this.getResultado1());
		
		
		
	}
	
}
