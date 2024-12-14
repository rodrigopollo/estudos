package controle.Tarefas__Controle;

import java.util.Scanner;

public class If__AnoBissexto {
    public static void main(String[] args) {
        // Identificar se o ano atual eh um ano bissexto ou normal

        Scanner entrada = new Scanner(System.in);

        double anoAtual;

        System.out.print("Insira o ano atual:");
        anoAtual = entrada.nextInt();

        if (anoAtual % 4 == 0) {
            System.out.println("Estamos em um ano Bissexto!");
        } else {
            System.out.println("Mais um ano normal.");
        }


        entrada.close();











    }
}
