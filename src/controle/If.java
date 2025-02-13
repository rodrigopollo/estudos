package controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        /* IF --> Eh uma estrutura condicional que verifica se as expressoes dentro dos parenteses
        sao verdadeiras ou falsas (TRUE or FALSE) e executa de forma condicional. Ou seja, depended
        do que voce coloca entre ( ) depois o IF.
        EXEMPLO: media = 7.3
          
            -->  if (media >= 7.0 && <= 10.00) {
                     System.out.println("O aluno esta aprovado.");
                 }
                 
         O exemplo verifica a nota do aluno, no caso 7.0, e comprova a media eh maior ou igual a 7 e
         menor ou igual a 10??? --> a media foi 7.3 entao a resposta eh TRUE
         Si for TRUE ele executar os comanos que estao dentro de { }, no caso eh informar que o aluno
         esta aprovado.
         Neste exemplo, caso a media fosse menor que 7, seria FALSE entao ele nao executaria o println
         e continuaria o programa com oq viesse depois.
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
        /* Como ja vimos encima, a condição do IF trabalha quase igual q 1 boolean, ou seja:
        if (condição TRUE or FALSE) faça o seguinte { bla bla bla } fim.
        Sendo assim, voce tambem pode usar a condiçao do if em 1 boolean, salvar em 1 variavel
        e usar essa variavel como condiçao do IF...
        Aabaixo vou mostrar o exemplo isso e oq seria normal sem usar variavel como condição.
        
            if (media < 4.5 && media >= 0.0) {
                System.out.println("Reprovado");
            }
        */
        
        //Aqui usaremos a condição da media em forma BOOLEAN e armazenaremos em 1 variavel ZERO CHANCE
        // e usaremos essa mesma variavel como conição de verificação dentro o IF
        boolean zeroChance = media < 4.5 && media >= 0.0;
        if (zeroChance) {
            System.out.println("Reprovado");
        }
        
        
        entrada.close();
    }
}

