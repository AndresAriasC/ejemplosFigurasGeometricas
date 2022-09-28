package Ejercicios;

public class Hexaedro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double A,a,V,d;
		
		
		a=2.25;
		A=6*Math.pow(a, 2);
			V=Math.pow(a, 3);
			d=a*Math.sqrt(3);
			
		    System.out.println("D:" + d);
	    System.out.println("el Area menor:" + a);
	    System.out.println("el Area mayor:" + A);
	    System.out.println("el Volumen:" + V);


	}

}
