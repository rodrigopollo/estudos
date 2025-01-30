package fundamentos;


import java.util.Scanner;

public class Tipo__StringEquals {
    public static void main(String[] args) {
        /* Comparação entre (STRING EQUALS)

         A mesma String com o mesmo conteudo nao significa q seja TRUE ao fazer a comparação ==
        Abaixo dou os exemplos:
        */

        //--> Exemplo 1 = Se voce tem 2 valores iguais de texto atribuidos a String o resultado eh (TRUE)
        System.out.println("2" == "2"); // String 2 eh igual String 2? --> TRUE

        //--> Exemplo 2 = Se vc tem tem 1 valor atribuido a uma variavel o resultado eh (FALSE)
        String s1 = new String("2"); // atribuimos o valor 2 a s1 tipo String
        System.out.println("2" == s1); // String 2 eh igual a s1?? -->  FALSE
        
        /*--> Exemplo 2.1 = Esse eh o mesmo caso do Exemplo 2... SS nao eh igual 2 mesmo tendo
         atribuido o valor 2 a SS. Ou seja, 2 != SS, mas eh igual a 2 (ex 1) que esta atribuido a SS.
         2 == 2
         2 != SS
         */
         
        String ss = "2";
        System.out.println("2" == "ss");
        
        //--> Exemplo 3 = Se vc quer fazer o exemplo 2 e 2.1 ter o resultado (TRUE), use (equals)
        System.out.println("2".equals(s1)); // O conteudo das Strings eh igual? --> TRUE

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero"); // digite o numero 2 para o exemplo
        String s2 = entrada.nextLine();

        System.out.println("2" == s2); // texto 2 = var s2? (FALSE)
        System.out.println("2".equals(s2)); // conteudo 2 = conteudo 2? (TRUE)

        entrada.close();
    }
}


        /* Explicação equals

         O equals ele vai comparar o conteudo (objeto), explico.
            - String A = "2";   ------- O conteudo da String eh 2
            - String s1 = new String("2");   -------  O conteudo tambem é 2

         Olhe o exemplo 2, o resultado da comparação eh (FALSE) pq String eh do tipo texto e o texto
         "2" nao eh igual s1, so o conteudo eh o memso, entao para fazer esse tipo de comparação
         a gente precisa usar o (EQUALS) que compara so o conteudo da String e nao o texto.

         O exemplo 3 ao usar (equals) e comparar so o conteudo o resultado eh igual, ou seja, (TRUE).
         */