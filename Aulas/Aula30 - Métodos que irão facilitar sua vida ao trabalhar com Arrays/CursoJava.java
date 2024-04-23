import java.util.Arrays;

public class CursoJava {
    public static void main(String[] args) {
        
        int[] num = {1,6,9,2,0,7,5};
        int[] num2 = new int[10];

        // Arrays.sort(num); //Ordenar Array
        //Arrays.fill(num2, 10); //Prencher Array com valor indicado
        //System.arraycopy(num, 0, num2, 0, num.length); //Copiando outro array
        //System.out.printf("São iguais? %s%n", Arrays.equals(num, num2)?"Sim":"Nao"); //Verificando se Array são iguais

        int valor = 7;
        int pos = Arrays.binarySearch(num, valor); //Verificar se determinado elemento está no array. Se estiver, retorna a posição no array, se não, retorna numero negativo

        System.out.printf("O elemento esta no array? %s - posicao: %d", pos>=0?"SIM":"NAO", pos);

        //for(int n:num2){
        //    System.out.printf(" %d - ", n);
        //}

    }
}