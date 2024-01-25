package publicprivate;

public class PublicPrivate {

    public static void main(String[] args) {
        // TODO code application logic here
        Jogador obj_jogador = new Jogador();
        
        obj_jogador.numeroDaCamisa = 10; //Modificando Atributo Publico
        obj_jogador.setNomeJogador("Andrey"); //Modificando Atributo Privado
        
        System.out.println(obj_jogador.toString());
    }
    
}

