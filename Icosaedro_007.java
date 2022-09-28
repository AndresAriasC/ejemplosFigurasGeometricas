package Ejercicios;

public class Icosaedro_007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a,A,v;
		
		a=2;
		
		A = 5 * Math.pow(a, 2)*Math.sqrt(3);
		v = 5 * (3+Math.sqrt(5)*Math.pow(a, 3)/12);
		
		
		System.out.println("el Area:"+String.format("%.2f ",A));
		System.out.println("el Volumen"+String.format("%.2f ",v));

	}

}
