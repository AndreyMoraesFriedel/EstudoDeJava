package calculadora;

import java.util.Scanner;

public class Calc {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Numero n1 = new Numero();
		Numero n2 = new Numero();
		Numero result = new Numero();
		
		String opc = "Y";
		
		while(opc.equals("Y") || opc.equals("y")){
			System.out.printf("%nGive me a number: ");
			n1.setValor(sc.nextInt());
			
			System.out.printf("%nGive me a number: ");
			n2.setValor(sc.nextInt());
			
			result.setValor(n1.getValor() + n2.getValor());
			
			System.out.printf("%nThe sum result of %d plus %d is: %d", n1.getValor(), n2.getValor(), result.getValor());
			
			System.out.printf("%nDo you want continue? N/Y: ");
			opc = sc.next();
			
			System.out.printf("%n%n%n");
		}
		
	}

}
