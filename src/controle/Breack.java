package controle;

import java.util.Scanner;

public class Breack {
    public static void main(String[] args) {
        /*Swtch com BREACK
        O breack faz com que qndo um CASE eh executado ele termina o switch, nesse caso ele pula
        prara o System.out.println("O conceito é " + conceito);
         */

        Scanner entrada = new Scanner(System.in);

        String conceito = "";
        System.out.println("Insira uma nota");
        int nota = entrada.nextInt();

        switch (nota) {
            case 5:
            case 4:
                conceito = "A";
                break;
            case 3:
            case 2:
                conceito = "B";
                break;
            case 1:
            case 0:
                conceito = "C";
                break;
            default:
                conceito = "Invalido";

        }

        System.out.println("O conceito é " + conceito);

        entrada.close();


    }
}
