public class CursoJava {

    public static void main(String[] args) {
        
        char[] texto_c = {'c','u','r','s','o',' ','d','e',' ','j','a','v','a'};
        char[] texto_c2 = new char[10];
        String texto_s = new String("CFB Cursos");
        int tam = 0;
        char c;

        String stringPadrao = new String();
        String recebendoArrayChar = new String(texto_c);
        String lendoValoresEspecificos = new String(texto_c, 0, 5);

        //lengh -> Retorna tamanho da String
        tam = texto_s.length();
        System.out.println("Tamanho do texto: " + tam);

        //charAt -> Retorna o caractere que esta na posicao
        c = texto_s.charAt(0);
        System.out.println("charAt: " + c);

        //getChars -> Copiar chars de uma String para outra String
        texto_s.getChars(4, 10, texto_c2, 0);
        System.out.println(texto_c2);
    }

}