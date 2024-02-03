package heranca;

public class Heranca {

    public static void main(String[] args) {
        // TODO code application logic here
        Carro parati = new Carro("parati");
        CarroDeCombate golfDeZumbi = new CarroDeCombate("golfDeZumbi", 100);
        CarroDeCombate saveiroZumbi = new CarroDeCombate("saveiroZumbi", 75);
        
        golfDeZumbi.atirar(saveiroZumbi);
        
        
        parati.info();        
        golfDeZumbi.info();
        saveiroZumbi.info();
        
        
    }
    
}
