package controle;

public class For_For {
    public static void main(String[] args) {
        /* Dentro do laço FOR ---- (laço) ----- esta sendo usado a variavel i do tipo INT,
         vc NAO pode usar denovo a variavel i dentro do mesmo scopo, mas sim dentro de outro
         FOR diferente ja que a variavel esta presa dentro do FOR e fora do resto do programa.
         */
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // VAR i usada novamente, como esta fora do FOR onde foi usada antes n tem problema.
        int i = 1;
        System.out.println("Saiu do for....");
        System.out.println(i);

        //Outra maneira de usar o for eh colocar a variavel fora do FOR, mas nao eh comum
        // ja que antes de fazer isso eh melhor usar FOR-IT (veremos mais adiante)
        int i1 = 1;
        for (; i1 <= 10; i1++) {
            System.out.println(i1);
        }
        /* O terceiro jeito eh FOR dentro de FOR.
        Executa o 1º) FOR => A = 1
        Executa o 2º) FOR => B = 1 e seguira ate cumprir a regra desse for, ate q B seja = 11.
        EXEMPLO: A = 1
                 B = 1, 2, 3, 4, 5, 6, 7, 8, 9, 10...Quando vai chegar a 11, ele volta e recomeça.
        Executa o 1º) FOR novamente => A = 1 se torna A = 2
        Executa o 2º) FOR novamente => e repete o mesmo processo da linha 28.
        Isso ira acontecer ate que A = 10 e B = 10, entao ele terminara o programa.
         */
        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.printf("[%d ¨%d]", a, b);
            }
        }


    }

}

