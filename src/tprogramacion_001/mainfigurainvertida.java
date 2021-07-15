package tprogramacion_001;

import java.util.Scanner;

public class mainfigurainvertida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingresa el numero de lineas para el triangulo");
		int i;
		int j;
		
		Scanner ob = new Scanner(System.in);
		 int lineas ;
		lineas = ob.nextInt();
		
		
		
		for(i =lineas; i >= 1; i--) {
			
			for (j = 0; j < i; j++) {
		
			System.out.print("*");
			}
			
			System.out.println("");
		}
	}
}
	
	 
	
