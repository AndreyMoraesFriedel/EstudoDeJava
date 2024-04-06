package pkgstatic;

public class Static {

    public static void main(String[] args) {
        Jogador obj_jogador = new Jogador("Andrey", 17);
        
        System.out.println("Nome do Jogador: " + obj_jogador.getNomeJogador());
        System.out.printf("Numero da Camisa: %d%n", obj_jogador.getNumeroDaCamisa());
        System.out.printf("Perna boa: %s", Jogador.pernaBoa ? "Direita":"Esquerda");
    }
    
}
