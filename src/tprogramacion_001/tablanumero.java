package tprogramacion_001;

import java.util.Scanner;

public class tablanumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		int a, resultado;
		a = 7;
	
		System.out.println("Ingrese el numero");
		a = lector.nextInt();
		System.out.println("Tabla del:" + a);

		for (int i = 1; i <= 12; i++) {

			System.out.println(a + " * " + i + " = " + a * i);
		}

	}

}
