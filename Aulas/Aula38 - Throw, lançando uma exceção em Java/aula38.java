package EstruturaThrow;

import java.util.ArrayList;

public class aula38 {

    public static void main(String[] args) {
        /*
        ArrayList<String> carros = new ArrayList<String>();

        carros.add("Gol");
        carros.add("Voyage");
        carros.add("Santana");
        carros.add("Virtus");
        carros.add("Jetta");
        */
        int nota1 = 50, nota2 = 70, res;

        if(nota1 > 50){
            throw new IllegalArgumentException("Valor de nota invalido");
        }
        if(nota2 > 50){
            throw new IllegalArgumentException("Valor de nota invalido");
        }

        res = nota1 + nota2;
        System.out.println("Resultado: " + res);

        /*try{
            System.out.println(carros.get(1));
        }catch(IndexOutOfBoundsException e){
            System.out.println("ERROR: Valor fora do indice do array");
        }finally{
            System.out.println("Fim do Try!");
        } */
 
        
    }
    
}
