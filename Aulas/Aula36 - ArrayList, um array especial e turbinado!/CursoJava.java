import java.util.ArrayList;

public class CursoJava {

    public static void main(String[] args) {
        //Criacao de ArrayList
        ArrayList<String> carros = new ArrayList<>(100);

        //Adicionar Elementos
        carros.add("Gol");
        carros.add("Voyage");
        //carros.add(1,"Santana"); //Criando passando possição

        carros.trimToSize(); //Eliminar elementos que não estão sendo utilizados

        //carros.clear(); //limpa o arraylist

        System.out.println(carros.indexOf("Gol")); //Mostrar Posicao do elemento

        carros.remove("Voyage"); //Remove elemento do arrayList

        //Mostrando Elementos
        for(int i = 0;i<carros.size();i++){
            System.out.println(carros.get(i));
        }
        /*
        for(String s:carros){
            System.out.println(s);
        } 
        */
        
    }
    

}