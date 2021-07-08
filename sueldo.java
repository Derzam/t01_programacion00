package diagramasdeflujo;

import java.util.Scanner;

public class sueldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese el sueldo");
		Scanner ob = new Scanner (System.in);
		
		int A = ob.nextInt();
		
		if(A<300) {
			System.out.println("La bonificacion es de 40 dolares");
		}else {
			System.out.println("La bonificacion es igual a 0");
		}
		
		

	}

}
