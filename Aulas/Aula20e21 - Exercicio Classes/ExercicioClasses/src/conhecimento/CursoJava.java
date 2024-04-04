package conhecimento;

public class CursoJava {

    public static void main(String[] args) {
        
        Sapo obj_Sapo = new Sapo(10, 10, 10);
        Aranha obj_Aranha = new Aranha(5, 5, 5, 3);
        Formiga obj_Formiga = new Formiga(2, 2, 2);
        Vegetal obj_Vegetal = new Vegetal(1);
        Vegetal obj_VegetalDois = new Vegetal(5);
        Vegetal obj_VegetalTres = new Vegetal(10);

        obj_Aranha.info();
        obj_Aranha.atacar(obj_Formiga);
        obj_Aranha.comer(obj_Formiga.getMassa());
        obj_Aranha.info();
        //System.out.println(obj_Formiga.isVivo());

    }

}
