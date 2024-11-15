package controle;

import java.util.Scanner;

public class While_Condicional {
    public static void main(String[] args) {
        /* While Condicional = Enquanto nao digitar a palabra(numero etc) correto o
        programa vai continuar infitamente, nesse exemplo a palavra eh (sair).

        Vou detalhar essa expressao para que possamos entender melhor
        while (!chave.equalsIgnoreCase("sair"))

        Voce esta dizendo:
          --> Se a (String chave) for DIFERENTE de (sair) entao continue.[]

        NOTA: Vale lembrar que o simbolo "!" eh equivalente a negação no java.
        Sendo assim ao colocar (!chave) voce diz, enquanto CHAVE diferente de SAIR continue.

         */
        Scanner entrada  = new Scanner(System.in);

        String chave = "";

        while (!chave.equalsIgnoreCase("sair")) {
            System.out.print("Digite: ");
            chave = entrada.nextLine();

        } System.out.println("\nObrigado e volte sempre!");

        entrada.close();



        // Ao tentar acessar ou processar uma variável que não foi inicializada (que não possui valor)
        // o código não irá compilar.
        // Isso se chama null pointer exception.





    }
}
