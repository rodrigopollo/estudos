package arrays;

import java.util.Arrays;

public class Array__ForEach {
    public static void main(String[] args) {

//               >>>>>>>>>   ARRAY 1  <<<<<<<<<

        //criando 1 array
        double[] aNotaAluno1 = new double[3];

        // imprimindo array para mostrar que antes de setar valores, sao todos defaut.
        System.out.println("Defaut = " + Arrays.toString(aNotaAluno1));

        //setando valores de cada posição array
        aNotaAluno1[0] = 7.9;
        aNotaAluno1[1] = 8;
        aNotaAluno1[2] = 6.7;

        //imprimindo array com os valores de cada posicao setados.
        System.out.println("Valores setados = " + Arrays.toString(aNotaAluno1));

        // usando FOR para percorrer o array, armazenar a soma em 1 variavel e imprimir
        double somaCadaPosicao1 = 0;
        for (int posicao = 0; posicao < aNotaAluno1.length; posicao++) {
            somaCadaPosicao1 += aNotaAluno1[posicao];
        }
        System.out.println("Media 1 = " + somaCadaPosicao1 / aNotaAluno1.length);

//=====================================================================================
//=====================================================================================

//               >>>>>>>>>   ARRAY 2: Usando For Each  <<<<<<<<<

        // Modo menos convencional, cria e seta os valores do array na mesma linha.
        // Eh menos comum de usar por ter os valores setados de maneira ""fixa""
        double[] aNotaAluno2 = {6.9, 8.9, 5.5, 10};


        //FOR EACH => somando cada posiçao do array e armazenando o resultado em 1 variavel
        double somaCadaPosicao2 = 0;
        for (double cadaPosicaoArray : aNotaAluno2) {
            somaCadaPosicao2 += cadaPosicaoArray;
        }
        // dividindo o resultado da soma de das posiçoes array pelo total de arryays usando lenght
        System.out.println("Media 2 = " + somaCadaPosicao2 / aNotaAluno2.length);

    }
}

