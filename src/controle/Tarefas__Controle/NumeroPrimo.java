package controle.Tarefas__Controle;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {


        int contadorDeDivisores = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite um numero para verificar se é primo:");
        int numero2 = scanner.nextInt();

        for (int i = 2; i < numero2; i++) {
            if (numero2 % i == 0) {
                contadorDeDivisores++;
            }
        }

        if (contadorDeDivisores == 0) {
            System.out.println("\nO numero " + numero2 + " é primo.");
        } else {
            System.out.println("\nO numero " + numero2 + " não é primo.");
        }

        scanner.close();

//////////////////////////////////////////////////////////////////////////////////////////////////

        // --------------------- Resposta Alternativa (Betinho) ---------------------

        double numero = 10091;

        for (int contador = 2; contador < numero; contador++) {

            if (numero % contador == 0) {
                System.out.println("\n Não é primo");
                return;
            }
        }
        System.out.println("\n É um numero primo.");


    }

}
