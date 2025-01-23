package arrays.Tarefa__Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Media {
    public static void main(String[] args) {

        /* Usando ARRAY e FOR.
        - O usuario escolhera a quantidade de notas que deveram ser inseridas.
        - Armazene as notas inseridas
        - Faça o calculo da media com as notas.
        ººº NOTA: NAO PODE USAR 1 FOR PARA INSERIR NOTAS E FAZER O CALCULO AO MESMO TEMPO.
        DICA: use 2 for.
         */
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas deseja inserir?");
        int qtdNotasDesejadas = entrada.nextInt();

        double[] arrayDeNotas = new double[qtdNotasDesejadas];

        for (int posicao = 0; posicao < arrayDeNotas.length; ) {
            System.out.printf("Insira a %dº nota: ", posicao + 1);
            double notaInserida = entrada.nextDouble();

            if (notaInserida <= 10 && notaInserida >= 0) {
                arrayDeNotas[posicao] = notaInserida;
                posicao += 1;
            } else {
                System.out.println("Error: Nota invalida.");
            }
        }
        System.out.println("As notas inseridas foram: " + Arrays.toString(arrayDeNotas));

        double somaDosArrays = 0;
        for (double cadaPosicaoArray : arrayDeNotas) {
            somaDosArrays += cadaPosicaoArray;
        }
        double media = somaDosArrays / arrayDeNotas.length;
        System.out.println("Media = " + media);

        entrada.close();


    }
}
