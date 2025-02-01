package controle;

import java.util.Scanner;


public class While_DoWhile {
    public static void main(String[] args) {

        /* do while -> do {} while (....);

        O do while eh a unica estrutura de controle que termina com ";".
        Diferente do while... o (do while) ele obrigatoriamente executa pelo menos 1x
        Vejamos em detalhes o do while:

        - do {  -->  Execute os statemensts dentro do bloco { } do
        - Linha 38  -->  texto != sair, o programa pergunta quer sair?
        - Linha 39  -->  se voce digitar qualquer coisa diferente de SAIR (String texto) ele ira continuar,
        se for SAIR ele finaliza o while (linha 41)
        - }  -->  fecha e termina o bloco (do)
        
        - while (Linha 41) --> Apos terminar de executar o DO, o programa diz, se a String texto
        eh igual a SAIR... TRUE (sim) or FALSE(nao).
              ==>  while (!texto.equalsIgnoreCase("sair"));  <==  texto = sair? TRUE OR FALSE?
              
        --> Se a (String texto) for DIFERENTE de sair (FALSE) entao continue.[]

        texto = entrada.nextLine(); -> texto eh oq voce ira digitar, se for qualquer coisa
        que nao seja a palavra (sair), ele ira retornar para a linha 38 e perguntar novamente

        Deseja continuar?, se digitar sair ele comprova que TEXTO = sair entao pula
        para a linha 43  agrade por participar e termina o programa.
         */
        Scanner entrada = new Scanner(System.in);

        String texto;

        do {
            System.out.println("Deseja continuar ou sair?");
            texto = entrada.nextLine();
        }
        while (!texto.equalsIgnoreCase("sair"));

        System.out.println("\nObrigado por partipar!");

        entrada.close();


    }
}
