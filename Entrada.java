package Ejercicios;

import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int edad;
		
		try{
			System.out.println("Ingrese su edad");
			edad = entrada.nextInt();

			if(edad < 18) {
				System.out.println("No puedes pasar porque es menor de edad");
			}else if(edad >= 18 && edad <= 22) {
				System.out.println("Puede pasar pero no consumir alcochol");
			}else if(edad > 22) {
				System.out.println("Puede pasar y consumir alcohol");
			}else{
				System.out.println("No puede pasar porque porta armas");
			}

			
		}catch(Exception e){System.out.println("error tipo " + e);}
		
	entrada.close();

	}

}
