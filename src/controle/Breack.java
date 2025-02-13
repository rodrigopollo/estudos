package controle;

import java.util.Scanner;

public class Breack {
    public static void main(String[] args) {
        /*Swtch com BREACK
        O breack faz com que qndo um CASE eh executado ele termina o switch, nesse caso ele pula
        prara o System.out.println("O conceito é " + conceito);
        
        Aqui veremos novamente 2 maneiras diferentes de aplicar o SWITCH, a que armazena em 1 variavel
        e uma normal mas dessa vez, usando breack.
         */

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira uma nota: ");
        int nota = entrada.nextInt();
        
        String conceito = switch (nota) {
            case 5, 4 -> "A";
            case 3, 2 -> "B";
            case 1, 0 -> "C";
            default -> "Invalido";
        };

        System.out.println("O conceito é " + conceito);
        
        String conceito2;
        
        switch (nota) {
            case 5:
            case 4:
                conceito2 = "A";
                break;
            case 3:
            case 2:
                conceito2 = "B";
                break;
            case 1:
            case 0:
                conceito2 = "C";
                break;
            default:
                conceito2 = "Invalido";
            
        }
        System.out.println("O conceito2 é " + conceito2);
        
        
        entrada.close();


    }
}
