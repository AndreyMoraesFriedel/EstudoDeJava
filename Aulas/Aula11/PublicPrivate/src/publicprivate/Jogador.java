package publicprivate;

public class Jogador {
    
    public int numeroDaCamisa = 0;
    private String nomeJogador;

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }
    
    @Override
    public String toString() {
        return String.format("O Jogador %s eh o camisa %d",nomeJogador, numeroDaCamisa);
    }
    
   
}
