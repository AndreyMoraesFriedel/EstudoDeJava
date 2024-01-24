package metodos;

public class Metodos {

    public static void main(String[] args) {
        //String print = "print";
        //helloWorld(print);
        System.out.println(somaValoresInteiros(10,20,30,40,50));
    }

    public static int somaValoresInteiros(int... valores){
        int somador = 0;
        for(int leitor : valores){
            somador+=leitor;
        }
        return somador;
    }

    public static void helloWorld(String print){
        System.out.println(print);
    }
    
}
