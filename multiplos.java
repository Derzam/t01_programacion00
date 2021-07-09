package deberes;

import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2;
		
		Scanner multiplos = new Scanner(System.in);
		
		System.out.println("Ingrese el numero mayor");
		 n1 = multiplos.nextInt();
		 System.out.println("Ingrese el segundo numero");
		 n2 = multiplos.nextInt();
		 
		 if(n1 % n2 ==0) {
			 System.out.println( n1 +"Es multiplo de:"+n2);
			 
		 }else {
			 System.out.println(n2 +"No es divisor de:"+n1);
		

	}

}
	
}
	
