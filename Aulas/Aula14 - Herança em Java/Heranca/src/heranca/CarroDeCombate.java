package heranca;

public class CarroDeCombate extends Carro{
    
    private final int MAX_ARMAMENTO = 100;
    private final int MIN_ARMAMENTO = 0;
    private int quantArmamento;
    
    
    public CarroDeCombate(String nome, int blindagem) {
        super(nome);
        super.setArmamento(true);
        super.setBlindagem(blindagem);
        this.quantArmamento = MAX_ARMAMENTO;
    }

    public int getQuantArmamento() {
        return quantArmamento;
    }

    public void setQuantArmamento(int quantArmamento) {
        this.quantArmamento += quantArmamento;
        if(this.quantArmamento > MAX_ARMAMENTO){
            this.quantArmamento = MAX_ARMAMENTO;
        }
        if(this.quantArmamento < MIN_ARMAMENTO){
            this.quantArmamento = MIN_ARMAMENTO;
        }
    }
    
    public void atirar(Carro car){
        if(this.quantArmamento > MIN_ARMAMENTO){
            setQuantArmamento(-1);
            car.sofrerDano(10);
        }
        else{
            System.out.println("Sem Municao");
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.printf("Quantidade de Armento: %d%n", this.quantArmamento);
    }
    
    
    
}
