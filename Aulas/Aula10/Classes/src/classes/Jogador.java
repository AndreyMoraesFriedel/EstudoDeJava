package classes;

public class Jogador {
    
    private String nomeJogador;
    private int idadeJogador;

    public Jogador(String nomeJogador, int idadeJogador){
        this.nomeJogador = nomeJogador;
        this.idadeJogador = idadeJogador;
    }

    @Override
    public String toString() {
        return String.format("Jogador %s, tem %d de idade", nomeJogador, idadeJogador);
    }

}
