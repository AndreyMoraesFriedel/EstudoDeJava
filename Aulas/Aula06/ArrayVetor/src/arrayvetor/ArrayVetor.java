package arrayvetor;

import java.util.Scanner;

public class ArrayVetor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int TAM = 5; //Utilizando uma Constante para informar o valor do Array

        char[] gabarito = {'a','b','c','d','e'};
        char[] respostas = new char[TAM];
        int nota = 0;
        
        for(int i = 0;i<respostas.length;i++){
            System.out.printf("Digite a resposta da questao %d:", i+1);
            respostas[i] = scan.nextLine().charAt(0);
        }
        
        for(int i = 0;i<gabarito.length;i++){
            if(respostas[i] == gabarito[i]){
                nota++;
            }
        }

        System.out.printf("A nota do Aluno e: %d", nota);

        scan.close();
    }
    
}
