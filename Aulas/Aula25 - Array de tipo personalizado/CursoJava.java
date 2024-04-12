public class CursoJava {

    public static void main(String[] args) {
        
        final int NUM_CARROS = 5;
        Carro[] carros = new Carro[NUM_CARROS];
        String[] nomesCarros = {"Gol", "Santana", "Voyage", "Onix", "Tiggo 3X"};
        
        //inicializar o array carros
        for(int i = 0;i<NUM_CARROS;i++){
            carros[i] = new Carro(nomesCarros[i]);
        }

        //Imprimir carros:
        for(Carro c : carros){
            c.info();
        }
    }

}
