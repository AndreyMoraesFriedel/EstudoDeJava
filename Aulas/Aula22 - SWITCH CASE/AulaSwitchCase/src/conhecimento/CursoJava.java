package conhecimento;

import java.util.Scanner;

public class CursoJava {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual posição o corredor ficou? ");
		int posicao = sc.nextInt();
		sc.nextLine();
		
		switch(posicao) {
			case 1:
				System.out.printf("%s%n", "Medalha de Ouro");
				break;
			case 2:
				System.out.printf("%s%n", "Medalha de Prata");
				break;
			case 3:
				System.out.printf("%s%n", "Medalha de Bronze");
				break;
			default:
				System.out.printf("%s%n", "Sem Medalha");
				break;
		}

	}

}
