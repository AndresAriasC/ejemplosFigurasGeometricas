package Ejercicios;

public class Tetraedro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double area,A,Vol,H;
		
		area=4.55;
		A=Math.pow(area, 2) * Math.sqrt(3);
			Vol=Math.sqrt(2)/12 * Math.pow(area, 3);
				H=area * Math.sqrt(6)/3;
		
		System.out.println("la altura: "+ H);	
	    System.out.println("area menor es: "+ area);
	    System.out.println("el area mayor: "+ A);
	    System.out.println("el volumen es: "+ Vol);

		
	}

}
