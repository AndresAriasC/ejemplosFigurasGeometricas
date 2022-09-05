package Ejercicios;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// calculadora
		
		Scanner entrada = new Scanner(System.in);
		
		double num1=0, num2=0;

		System.out.println("Que operacion desea realizar?");
		System.out.println("1- Suma");
		System.out.println("2- Resta");
		System.out.println("3- Multiplicacion");
		System.out.println("4- Division");
		System.out.println("5- Modulo");
		System.out.println("0- Salir");
		
		char op = entrada.next().charAt(0);
		
		switch(op) {
		 
		case '1':
			System.out.println("**************Ingrese los valores**************");
			System.out.println("Ingrese el primer valor: ");
			num1 = entrada.nextDouble();
			System.out.println("Ingrese elsegundo valor: ");
			num2 = entrada.nextDouble();
			System.out.println("El resultado de la suma es: " + (num1+num2));
				break;
			 
		case '2':
			System.out.println("**************Ingrese los valores**************");
			System.out.println("Ingrese el primer valor: ");
			num1 = entrada.nextDouble();
			System.out.println("Ingrese elsegundo valor: ");
			num2 = entrada.nextDouble();
			System.out.println("El resultado de la resta es: " + (num1-num2));
				break;
				 
		case '3':
			System.out.println("**************Ingrese los valores**************");
			System.out.println("Ingrese el primer valor: ");
			num1 = entrada.nextDouble();
			System.out.println("Ingrese elsegundo valor: ");
			num2 = entrada.nextDouble();
			System.out.println("El resultado de la multiplicacion es: " + (num1*num2));
				break;
				 
		case '4':
			System.out.println("**************Ingrese los valores**************");
			System.out.println("Ingrese el primer valor: ");
			num1 = entrada.nextDouble();
			System.out.println("Ingrese elsegundo valor: ");
			num2 = entrada.nextDouble();
			
			if(num2 > 0) {
				System.out.println("El resultado es: " + (num1/num2));
			}else {
				System.out.println("No se puede dividir entre cero");
			}
				break;
		
		case '5':
			System.out.println("**************Ingrese los valores**************");
			System.out.println("Ingrese el primer valor: ");
			num1 = entrada.nextDouble();
			System.out.println("Ingrese elsegundo valor: ");
			num2 = entrada.nextDouble();
			
			if(num2 > 0) {
				System.out.println("El resultado es: " + (num1%num2));
			}else {
				System.out.println("No se puede dividir entre cero");
			}
				break;
		case '0':
			System.out.println("**************Programa finalizado**************");
				break;
				default:
				System.out.println("Opcion no valida");
		
		
		}
		entrada.close();

	}

}
