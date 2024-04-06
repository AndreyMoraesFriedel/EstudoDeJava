package conhecimento;

public class Animal implements SerVivo{

    public Boolean vivo;

    public Animal() {
        this. vivo = true;
    }

    @Override
    public void mover() {
        
    }

    @Override
    public void comer(int massa) {
        
    }

    @Override
    public void info() {
        System.out.printf("Vivo: %s%n", this.vivo ? "Sim" : "Nao");
    }

}
