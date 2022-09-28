package Ejercicios;

public class Octaedrito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a,A,v;
		
		a = 12;
		A = 2*Math.pow(a, 2)*Math.sqrt(3);
		v = Math.sqrt(2)/3*Math.pow(a, 3);
		
        System.out.println("el area menor: "+ a);
        System.out.println("el area mayor es: "+ A);
        System.out.println("el volumen es: "+ v);

	}

}
