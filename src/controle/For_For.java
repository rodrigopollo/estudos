package controle;

public class For_For {
    public static void main(String[] args) {
        /* Dentro do laço FOR ---- (laço) ----- do for esta sendo usado a variavel i do tipo INT,
         vc nao pode usar denovo a variavel i dentro do mesmo scopo.
         Mas o for te posibilita de usar a variavel i novamente sempre que seja fora do scopo como no
         exemplo abaixo.

         */
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int i = 1;
        System.out.println("Saiu do for....");
        System.out.println(i);


        //Outra maneira de usar o for eh colocar a variavel fora do fora, mas nao eh comum
        int i1 = 1;
        for (; i1 <= 10; i1++) {
            System.out.println(i1);
        }

        /* A terceiro jeito eh FOR dentro de FOR.
        Executa o 1º) FOR => i2 = 1
        Executa o 2º) FOR => J = 1 ate cumprir a regra desse for, ou seja ate j ser <= 10. Quando cumprir.
        Executa o 1º) FOR novamente => i2 = 1 se torna i2 = 2
        Executa o 2º) FOR novamente => e repete o mesmo processo da linha 27.
        Isso ira acontecer ate que i2 = 10 e j = 10, entao ele terminara o programa.
         */
        for (int i2 = 1; i2 <= 10; i2++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("[%d ¨%d]", i2, j);
            }
        }


    }

}

