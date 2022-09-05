package Ejercicios;

public class Piramide {
	public static void main(String[] args) {
		
		float  apo,h,b,lados;
		double areaTotal,volumen,areaLateral;
		
		h=8;
		b=12;
		apo=10;
		lados=4;
		
		areaLateral= (lados*(b*apo)/2);
		areaTotal = (b*b)+areaLateral;
		volumen = (b*h)/3;
		
		System.out.println("5.Area Lateral: "+ areaLateral);
		System.out.println("6.Area Total: "+ areaTotal);
		System.out.println("7.Volumen: "+ volumen);
		
	
	

}
	
}
