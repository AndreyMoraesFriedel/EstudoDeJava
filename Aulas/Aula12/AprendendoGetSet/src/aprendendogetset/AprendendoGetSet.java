package aprendendogetset;

public class AprendendoGetSet {

    public static void main(String[] args) {
        // TODO code application logic here
        Jogador obj_jogador = new Jogador("Andrey", 17);
        System.out.println("Nome do Jogador: " + obj_jogador.getNomeJogador());
        System.out.printf("Numero da Camisa: %d", obj_jogador.getNumeroDaCamisa());
    }
    
}
