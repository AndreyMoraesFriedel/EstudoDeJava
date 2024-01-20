package matrizes;

import java.security.SecureRandom;

public class Matrizes {

    public static void main(String[] args) {
        
        final int LINHAS_ARR = 3;
        final int COLUNAS_ARR = 5;

        //Em cada linha de um Array, possui um outro Array
        int[][] matriz = new int[LINHAS_ARR][COLUNAS_ARR];
        
        //Exemplo Inicializar Matriz
        int[][] mtzInicializada = {{1,2,3,4,5},{10,20,30,40,50},{100,200,300,400,500}};
        
        //Primeiro For manipula as Linhas
        for(int linhas = 0;linhas<LINHAS_ARR;linhas++){ 
            //Segundo For manipula as Colunas
            for(int colunas = 0;colunas<COLUNAS_ARR;colunas++){ 
                matriz[linhas][colunas] = new SecureRandom().nextInt(100);
            }
        }
        
        //Mostrar Conteudo da Matriz com For
        for(int linhas = 0;linhas<LINHAS_ARR;linhas++){ 
            for(int colunas = 0;colunas<COLUNAS_ARR;colunas++){ 
                System.out.printf("%2d | ", matriz[linhas][colunas]);
            }
            System.out.printf("%n");
        }
        
        //Usando ForEach para mostrar Matriz
        for(int[] linhas : mtzInicializada){
            for(int colunas : linhas){
                System.out.printf("%3d | ", colunas);
            }
            System.out.printf("%n");
        }
        
    }
    
}
