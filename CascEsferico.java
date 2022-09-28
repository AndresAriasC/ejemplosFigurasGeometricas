package Ejercicios;

public class CascEsferico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double h=4, R=2, vC, aC;

		aC = 2*Math.PI*R*h;
		vC = Math.PI*Math.pow(h, 2)*(3*R-h)/3;
		
		
		System.out.println("*****************");
		System.out.println("El area del Casquete es: " + aC);
		System.out.println("El volumen del Casquete es: " + vC);
		
		
	}

}
