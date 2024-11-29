package controle.Tarefas__Controle;


import java.util.Random;
import java.util.Scanner;

public class WhileIF__AdivinhaNumero {
    public static void main(String[] args) {
        /*
         - insira 1 numero aleatorio em 1 variavel de 0 a 100.
         - 10 tentativas de adivinhar o numero
         - cada erro mostre quantas chances ainda restam e se o numero eh maior
         ou menor q o numero inserido
         */

        Scanner entrada = new Scanner(System.in);

        Random random = new Random();

        // Gerar um número aleatório entre 0 e 100
        int numeroAleatorio = random.nextInt(101);
        int tentativasRestantes = 10;
        boolean acertou = false;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Você tem 10 tentativas para adivinhar um número entre 0 e 100.");

        // Loop para as tentativas do jogador
        while (tentativasRestantes > 0 && acertou != true) {
            System.out.print("Insira seu palpite: ");
            int palpite = entrada.nextInt();

            // Verifica se o palpite é o número correto
            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você adivinhou o número!");
                acertou = true; // Define que o jogador acertou
            } else {
                // Dizer se o palpite foi maior ou menor
                if (palpite < numeroAleatorio) {
                    System.out.println(".... é maior.");
                } else {
                    System.out.println(".... é menor.");
                }

                // Decrementar tentativas restantes
                tentativasRestantes--;
                System.out.println("Tentativas restantes: " + tentativasRestantes);
            }
        }

        // Mensagem final se o jogador não acertou
        if (!acertou) {
            System.out.println("Você não conseguiu adivinhar o número. O número era: " + numeroAleatorio);
        }


////////////////////////////////////////////////////////////////////////////////////////////////////////

        // -----------------  Minha Resposta --------------------


        int numeroSecreto;
        int numeroInserido;
        int numeroDeTentativas = 1;

        System.out.println("Voce tem 10 tentativas para adivinhar o numero aleatorio de 0 a 100");
        Random random1 = new Random();
        numeroSecreto = random1 .nextInt(101);

        do {
            System.out.printf("\n%d - Insira um numero:", numeroDeTentativas);
            numeroInserido = entrada.nextInt();

            if (numeroInserido > 0 && numeroInserido <= 100){

                if (numeroInserido < numeroSecreto) {
                    System.out.printf(".... é maior que %d", numeroInserido);

                } else if (numeroInserido > numeroSecreto) {
                    System.out.printf(".... é menor que %d", numeroInserido);
                } else {
                    System.out.printf("PARABENS! Voce venceu. O numero secreto era %d ", numeroSecreto);
                    break;
                }

            } else {
                System.out.println("Numero invalido");
                break;
            }
            numeroDeTentativas++;

        } while (numeroDeTentativas != 10);

        entrada.close();

    }
}


