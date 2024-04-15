public class CursoJava {

    public static void parImpar(int[] arr){
        for(int n:arr){
            if(n % 2 == 0){
                System.out.println(n +":Par");
            }else{
                System.out.println(n +":Impar");
            } 
        }
    }
    public static void main(String[] args) {
        
        int[] numeros = {10,15,5,20,25,5,100,8,3,98,75,62};
        parImpar(numeros);

    }
    
}