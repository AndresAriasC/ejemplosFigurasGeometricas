package Ejercicios;

public class Cilindrito {

	public static void main(String args[]) {
		
		double AL=0, AT=0, V=0,PB=0;
		 double r = 3, h = 10;
		
		 PB = 2*Math.PI*3;
		 
		 AL = (PB*h);
		 AT = (PB*(h+r));
		 V = (Math.PI*(r*r)*h);
		 
		 System.out.println("El area lateral es de un cilinro es: " + AL);
		 System.out.println("El area total es de un cilindro es: " + AT);
		 System.out.println("El Volumen es de un cilindro es: " + V);
	}
}
