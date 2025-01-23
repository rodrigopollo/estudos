package arrays;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {

        final int tamanho = 3;

        int[] precos = new int[tamanho];

        precos[0] = 10;
        precos[1] = 20;
        precos[2] = 30;

        System.out.println("Imrpimindo Array de preços:");

        for (int posicao = 0; posicao < precos.length; posicao++) {
            System.out.printf("Preço do produto %d = %d\n", posicao, precos[posicao]);
        }

        //===============================================================================

        String[] arrayLetras = {"A", "B", "C", "D"};

        System.out.println("\n>>>> For Array Letras <<<<:");

        // O FOR aqui esta sendo usado para ler os itens do Array. Poderia ser outro tipo (int etc..)
        for (String lendo : arrayLetras) {
            System.out.println(lendo);
        }

        //===============================================================================

        int[] arrayNumeros = {10, 20, 30, 40, 50};

        System.out.println("\n>>>> For Array Numeros <<<<:");

        // O FOR aqui esta sendo usado para ler os itens do Array. Poderia ser outro tipo (int etc..)
        for (int lendo2 : arrayNumeros) {
            System.out.println(lendo2);
        }
        //===============================================================================

        // Voce basicamente esta substituindo todos os valores de -- arrayNumeros -- para 5
        // E o Array String seta o valor como "W"
        Arrays.fill(arrayNumeros, 5);
        Arrays.fill(arrayLetras, "W");

        System.out.println("\n>>>> For Array Numeros <<<<:");

        for (int lendo2 : arrayNumeros) {
            System.out.println(lendo2);
        }
        for (String lendo : arrayLetras) {
            System.out.print(lendo);
        }



    }
}
