package controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        /* IF --> Mostrando que voce pode executar 1 expressao so dentro do IF sem precisar usar BLOCOS
        mas o recomendavel eh usar sempre blocos para manter um padrao e facilitar possiveis expansoes
        do codigo.
            -->  if () {}
         */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nota: ");
        double media = entrada.nextDouble();
        //Nao usar  " ; " em extruturas de controle (tem 1 exceção) NOTA: exceção se vera mais pra frente.
        if (media >= 7.0 && media <= 10.0) {
            System.out.println("Aprovado");
            System.out.println("Parabens!");
        }

        if (media >= 5.0 && media < 7.0) {
            System.out.println("Recuperação");
        }

        boolean zeroChance = media <4.5 && media >= 0.0;
        if (zeroChance) {
            System.out.println("Reprovado");
        }
        entrada.close();
    }
}
 // Outra alternativa eh vc usar uma variavel para guardar o resultado, eh util quando voce precisa
// usar varias vezes o mesmo valor.
