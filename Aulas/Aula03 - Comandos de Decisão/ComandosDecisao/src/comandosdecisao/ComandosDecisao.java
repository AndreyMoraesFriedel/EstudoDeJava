package comandosdecisao;

public class ComandosDecisao {

    public static void main(String[] args) {
        
        int nota1 = 4, nota2 = 2, nota3 = 10;
        int faltas = 5;
        int maxFaltas = 10;
        float media = (nota1 + nota2 + nota3) / 3;
        String resp;
        int pos = 7;
        
        //IF
        if(media>=7){
            System.out.println("Passou de Ano");
        }
        System.out.println("Fim do Programa");
        
        System.out.println("---------------");
        //ELSE IF
        if(media>=7 && faltas<=maxFaltas){
            System.out.println("Passou de Ano");
        }else if(media>=5 && media<6 && faltas<=maxFaltas){
            System.out.println("Recuperacao");
        }else{
            System.out.println("Reprovado");
        }
        System.out.println("Fim do Programa");
        
        System.out.println("---------------");
        //?
        resp = (media>=6)? "Aprovado":"Reprovado";
        System.out.printf("O aluno esta %s%n", resp);
        System.out.println("---------------");
        //SWITCH
        switch(pos){
            case 1:
                System.out.println("Parabens ao Vencedor!");
                break;
            case 2:
                System.out.println("Uhmm, foi quase!!");
                break;
            case 3:
                System.out.println("Você foi muito bem!");
                break;
            default:
                System.out.println("Continue Praticando!!");
                break;
        }
        
    }
    
}
