package aprendendogetset;

public class Jogador {
    
    private String nomeJogador;
    private int numeroDaCamisa;

    public Jogador(String nomeJogador, int numeroDaCamisa) {
        this.nomeJogador = nomeJogador;
        this.numeroDaCamisa = numeroDaCamisa;
    }
    
    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public int getNumeroDaCamisa() {
        return numeroDaCamisa;
    }

    public void setNumeroDaCamisa(int numeroDaCamisa) {
        this.numeroDaCamisa = numeroDaCamisa;
    }
    
    @Override
    public String toString() {
        return String.format("O Jogador %s eh o camisa %d",nomeJogador, numeroDaCamisa);
    }
    
    
}
