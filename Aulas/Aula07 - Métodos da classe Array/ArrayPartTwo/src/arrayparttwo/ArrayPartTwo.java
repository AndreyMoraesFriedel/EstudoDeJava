package arrayparttwo;

import java.util.Arrays;

public class ArrayPartTwo {

    public static void main(String[] args) {
        
        //final int TAMANHO_DE_ARRAY = 10;
        int[] grupoNumerosJaColocados = {9,4,8,2,7,5,6,1,0,3};
        //int[] grupoNumerosParaSerColocados = new int[TAMANHO_DE_ARRAY];
        int pesquisa = 15;
        int pos;

        //Arrays.sort(grupoNumerosJaColocados); //Ordenar Array
        //Arrays.fill(grupoNumerosParaSerColocados, 10); //Prencher um Array
        //System.arraycopy(grupoNumerosJaColocados, 0, grupoNumerosParaSerColocados, 0, TAMANHO_DE_ARRAY); //Copia de um array para outro
        //System.out.printf("Arrays são iguais: %s", Arrays.equals(grupoNumerosJaColocados, grupoNumerosParaSerColocados)? "Correto":"Não São Iguais");

        Arrays.sort(grupoNumerosJaColocados);
        pos = Arrays.binarySearch(grupoNumerosJaColocados, pesquisa); //Verificar se um elemento esta no Array
        System.out.printf("O elemento %d se encontra no array: %s na posicao %d ", pesquisa, pos > 0 ? "Sim" : "Nao", pos);
        
        //Para ler elementos de Array, mais indicado FOREACH
        //for(int lendoNumeros : grupoNumerosParaSerColocados){
        //  System.out.printf("%d - ", lendoNumeros);
        //} 
        
        
    }
    
}
