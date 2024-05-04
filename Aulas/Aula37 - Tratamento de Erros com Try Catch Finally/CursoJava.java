import java.util.ArrayList;

public class CursoJava {

    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<>(100);

        carros.add("Gol");
        carros.add("Voyage");
        carros.add("Santana");

        try{
            System.out.println(carros.get(10));    
        }catch(IndexOutOfBoundsException e){
            System.out.println("ERRO[R]: Value Outside The Array Index");
        }finally{
            System.out.println("Fim do Try");
        }

        /*
        for(String s:carros){
            System.out.println(s);
        } 
        */

    }

}