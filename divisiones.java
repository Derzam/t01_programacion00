package deberes;

import java.util.Scanner;

public class divisiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float numero1 = 0;
		float numero2 = 0;
		float resultado;

		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero");
		 
		numero1 = lector.nextFloat();
		
		System.out.println("Ingrese el segundo numero");
		
		numero2 = lector.nextFloat();
		
		resultado = numero1/numero2;
		System.out.println("La división es " + numero1 + " / " + numero2 + " = " + resultado);
		
	
	}

}
