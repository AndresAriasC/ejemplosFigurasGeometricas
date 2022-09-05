package Ejercicios;

public class Prisma {

	public static void main(String args[]) {

		double areaLateral = 0, perimetroBase = 4, altura = 7, areaTotal = 0, volumen = 0;
		double base = 0;
		double apotema = 4.2;
		int lados = 5;
		/*********************************************/
		areaLateral = (lados * perimetroBase)*altura;
		base = (lados*apotema*perimetroBase)/2;
		areaTotal = areaLateral + (2*base);
		volumen = (base * altura);
			System.out.println("El valor del area Lateral es: " + areaLateral + " metros cuadrados.");
			System.out.println("El calculo de la base es: " + base + " metros cuadrados.");
			System.out.println("El Area total es: " + areaTotal + " metros cuadrados.");
			System.out.println("El Volumen es: " + volumen + " metros cuadrados.");
	}
}
