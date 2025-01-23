package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_NumeroCrescente {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quantidadeDeVezes = 3;
        int[] arrayNumeros = new int[quantidadeDeVezes];

        for (int i = 0; i < quantidadeDeVezes; i++) {
            System.out.print("Digite um numero:");
            arrayNumeros[i] = entrada.nextInt();

        // Voce pode usar o JOption em vez do Scanner, basta tirar scaner e colocar a linha abaixo
        // no lugar de entrada.nextLine();
        // Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
        }

        System.out.println("Numeros na ordem digitada");

        for (int lendo : arrayNumeros) {
            System.out.println(lendo);
        }

        System.out.println("Numeros na ordem crescente");

        // sort => Eh um meto que organiza os numeros em ordem crescente.
        Arrays.sort(arrayNumeros);
        for (int lendo : arrayNumeros) {
            System.out.println(lendo);
        }

        entrada.close();
    }
}
