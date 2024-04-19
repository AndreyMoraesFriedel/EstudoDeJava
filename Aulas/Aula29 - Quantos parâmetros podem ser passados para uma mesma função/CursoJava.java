public class CursoJava {

    public static void main(String[] args) {
        int n1 = 10, n2 = 5, n3 = 8;
        int res = soma(n1,n2,n3);
        System.out.println("Resultado soma: " + res);
    }

    public static int soma(int... n){ //Quantidade Indefinida
        int somador = 0;
        for(int v:n){
            somador += v;
        }
        return somador;
    }
    
}