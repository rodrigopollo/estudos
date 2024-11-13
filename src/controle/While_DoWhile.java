package controle;

import java.util.Scanner;


public class While_DoWhile {
    public static void main(String[] args) {

        /* do while -> do {} while (....);

        O do while eh a unica estrutura de controle que termina com ";".
        Diferente do while... o (do while) ele obrigatoriamente executa pelo menos 1x
        Vejamos em detalhes o do while:

        - do {  -->  Execute os statemensts dentro dobloco {...} No caso da (linha 37) ate (linha 40)
        - Linha 38  -->  O primeiro statement a ser executado
        - Linha 39  -->  O segundo statement a ser executado
        - }  -->  fecha e termina o bloco (do)
        - while  --> Apos terminar de executar o DO, o programa diz, comprove se a seguinte
        expressao eh TRUE or FALSE.

        while (!texto.equalsIgnoreCase("sair"));
        --> Se a (String texto) for DIFERENTE de (sair) entao continue.[]

        texto = entrada.nextLine(); -> texto eh oq voce ira digitar, se for qualquer coisa
        que nao seja a palvra (sair), ele ira retornar para a linha 38 e perguntar novamente

        Deseja continuar?, se digitar sair ele comprova que TEXTO = sair entao pula
        para a linha 43 e agrade por participar terminando o programa.

         */
        Scanner entrada = new Scanner(System.in);

        String texto;

        do {
            System.out.println("Deseja continuar?");
            texto = entrada.nextLine();
        }
        while (!texto.equalsIgnoreCase("sair"));

        System.out.println("\nObrigado por partipar!");

        entrada.close();


    }
}
