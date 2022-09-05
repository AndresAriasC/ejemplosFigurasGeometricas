package Ejercicios;

public class Cono {

	public static void main(String[] args) {
		float r=2,h=8;
		double g,areaLateral,areaTotal,volumen;
		
	
	g=Math.sqrt((Math.pow(h,2)+(Math.pow(r,2))));
	areaLateral=Math.PI*r*g;
    areaTotal = Math.PI*r*(g+r);
	volumen=(Math.PI*Math.pow(r,2)*h)/3;
	
	
	System.out.println("Datos del cono");
	System.out.println("1.Area lateral: "+areaLateral);
	System.out.println("2.Area Total: "+areaTotal);
	System.out.println("3.Volumen: "+volumen);
	
	

	}

}
