package tprogramacion_001;

import java.util.Scanner;

public class mainfigurainvertida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//trabajo revisado
		System.out.println("Ingresa la cantidad de lineas para el triangulo");
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
	
	 
	
