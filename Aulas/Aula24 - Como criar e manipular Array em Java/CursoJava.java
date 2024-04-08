public class CursoJava {

    public static void main(String[] args) {
        //Criação do Array
        final int TAMANHO = 5;
        int[] num = new int[TAMANHO];

        //int[] exmp = {1,2,3,4,5}; Array já com elementos dentro

        //Passando Valores
        num[0] = 52;
        num[1] = 100;
        num[2] = 70;
        num[3] = 50;
        num[4] = 11;

        //Mostrando Valores
        for(int n:num){
            System.out.printf("%d%n", n);
        }

        

    }
    
}