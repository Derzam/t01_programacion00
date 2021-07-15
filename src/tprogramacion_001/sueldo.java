package tprogramacion_001;

import java.util.Scanner;

public class sueldo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sueldo;
		int bonificacion1 = 100;
		int bonificacion2 = 70;
		int bonificacion3 = 50;
		
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingrese el sueldo del empleado");
		sueldo = lector.nextInt();
		
		if(sueldo<300) {
			System.out.println("Su bonificacion es igual a:"+bonificacion1);
			System.out.println("Su sueldo total es igual a:"+ (sueldo + bonificacion1));
			
			
		}else if(sueldo <=300 && sueldo<400) {
			System.out.println("Su bonificacion es igual a:"+ bonificacion2);
			System.out.println("Su sueldo total es igual a:"+ (sueldo + bonificacion2));
			
			
		}else if(sueldo > 400) {
			System.out.println("Su bonificacion es igual a:"+ bonificacion3);
			System.out.println("Su sueldo total es igual a:"+ (sueldo + bonificacion3));
			
			
		
		}
		
	
		
		
		


}
}


