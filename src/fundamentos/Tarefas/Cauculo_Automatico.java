package fundamentos.Tarefas;

import java.util.Scanner;

public class Cauculo_Automatico {
    public static void main(String[] args) {
        // Um programa que calcule o valor inserido ao cubo e ao quadrado e mostre
        // para o usuario o resultado.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira um numero:");
        int a = entrada.nextInt();

        int a2 = (int) Math.pow(a, 2);
        int a3 = (int) Math.pow(a, 3);

        System.out.printf("O numero %d² = %d", a, a2);
        System.out.printf("\nO numero %d³ = %d", a, a3);

        entrada.close();


    }
}
