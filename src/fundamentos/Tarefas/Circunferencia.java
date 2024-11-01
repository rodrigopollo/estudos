package fundamentos.Tarefas;

import java.util.Scanner;

public class Circunferencia {
    public static void main(String[] args) {
        // Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.

        double base = 10;
        double altura = 5;

        double area = (base * altura) / 2;

        System.out.println(area);

        // --------------------  Alternativa de resposta  --------------------

        Scanner entrada = new Scanner(System.in);

        // Entrada de dados: base e altura do triângulo
        System.out.print("Digite o valor da base do triângulo: ");
        double base1 = entrada.nextDouble();

        System.out.print("Digite o valor da altura do triângulo: ");
        double altura1 = entrada.nextDouble();

        // Cálculo da área do triângulo
        double area1 = (base * altura) / 2;

        // Exibe o resultado da área
        System.out.printf("A área do triângulo com base %.2f e altura %.2f é: %.2f\n", base1, altura1, area1);

        // Fecha o Scanner
        entrada.close();
    }
}



