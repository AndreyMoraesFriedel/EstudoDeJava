package tiposloops;

public class TiposLoops {

    public static void main(String[] args) {
  
        //FOR
        for(int i = 0; i <5; i++){
            System.out.println("Loop: " + (i + 1));
        }   
        
        //WHILE
        int cont2 = 0;
        while(cont2<5){
            System.out.println("Loop: " + (cont2 + 1));
            cont2 += 1;
        }
        
        //DO - WHILE
        int cont3 = 0;
        do{
            System.out.println("Loop: " + (cont3 + 1));
            cont3 += 1;
        }while(cont3<5);
        
        System.out.println("---------------");
        System.out.println("Fim do Programa!");
    }
    
}
