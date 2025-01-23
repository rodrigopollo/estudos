package arrays;

public class Array_SomaEMedia {
    public static void main(String[] args) {

        //    >>>>>>>>>>>>>>>>>> Array 1 <<<<<<<<<<<<<<<<<<<<

        // Os 3 arrays criados neste exercicio iram usar os valores do Array 1 {5, 15, 18}
        // Criar um array que some os numeros e faça uma media no final.
        double[] arrayNumero = new double[]{5, 15, 18};
        double somaArray;
        double media;

        somaArray = arrayNumero[0] + arrayNumero[1] + arrayNumero[2];

        media = somaArray / arrayNumero.length;
        System.out.print("================================");
        System.out.printf("\nA media é = %.2f", media);
        System.out.println(somaArray);

        //==================================================================================================

        //    >>>>>>>>>>>>>>>>>> Array 2 <<<<<<<<<<<<<<<<<<<<

        double somaArray2 = 0;

        for (int i = 0; i < arrayNumero.length; i += 1) {
        /*   arrayNumero[posicao] => Significa que a soma sera feita entre o soma e os numeros armazenados
             na posição arrey.
                Exemplo: posiçoes array[5, 15, 18]
                        soma(0) = soma(0) + arrayNumero[posicao 0](vale 5)
                        soma(5) = soma(5) + arrayNumero[posicao 1](vale 15)
                        soma(20) = soma(20) + arrayNumero[posicao 2](vale 18)
                        soma (33) resultado final da conta.                                               */
            somaArray2 += arrayNumero[i];
        }
        double media2 = somaArray2 / arrayNumero.length;
        System.out.print("================================");
        System.out.print("\nSoma 2 = " + somaArray2);
        System.out.printf("\nMedia 2 = %.2f", media2);
        System.out.println(somaArray2);


        //==================================================================================================

        //    >>>>>>>>>>>>>>>>>> Array 3 <<<<<<<<<<<<<<<<<<<<

        // Outra maneira de fazer o mesmo calculo que da linha 19.
        // Este se chama for-each, ele passa por cada posição do Array e executa (neste caso) a soma.

        double somaArray3 = 0;
        for (double cadaPosicaoArray : arrayNumero) {
            somaArray3 = somaArray3 + cadaPosicaoArray;
        }
        double media3 = somaArray3 / arrayNumero.length;
        System.out.print("================================");
        System.out.print("\nSoma 3 = " + somaArray3);
        System.out.printf("\nMedia 3 = %.2f", media3);
        System.out.print("\n================================");
    }
}
