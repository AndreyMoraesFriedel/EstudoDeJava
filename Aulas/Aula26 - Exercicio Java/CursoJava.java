import java.util.Scanner;

public class CursoJava {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] respostasCertas = {"a","c","b","a","c"};
        final int RESPOSTAS = 5;
        String[] respostasDigitas = new String[RESPOSTAS];

        String[] perguntas = {"Qual a maior estrela do nosso sistema solar?",
                              "Qual a primeira letra do nosso alfabeto?",
                              "2x10 e igual a?",
                              "O fantastico mundo de ___. (desenho anos 80)",
                              "Valor de PI?"
                            };

        String[] respostas = {"a)Sol | b)Lua | c)Marte",
                              "a)Z | b)C | c)A",
                              "a)10 | b)20 | c)12",
                              "a)Bob | b)Carl | c)Zec ",
                              "a)3.10 | b)3 | c)3.14"
                            };

        System.out.print("Digite seu nome: ");
        String nomeDoEstudante = sc.nextLine();

        int nota = 0;
        for(int i = 0;i<RESPOSTAS;i++){
            System.out.println("-------------------------");
            System.out.printf("Pergunta %d:%n", i + 1);
            System.out.println(perguntas[i]);
            System.out.println(respostas[i]);
            respostasDigitas[i] = sc.nextLine();
            if(respostasDigitas[i].equals(respostasCertas[i])){
                nota += 2;
            }
        }
        
        System.out.println("Fim da Prova, confira o resultado");
        System.out.printf("Ola %s, sua nota foi de %d, voce foi %s", nomeDoEstudante, nota, nota>=6?"aprovado":"reprovado");
    }

}
