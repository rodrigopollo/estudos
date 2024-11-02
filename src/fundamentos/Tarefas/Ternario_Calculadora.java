package fundamentos.Tarefas;

import java.util.Scanner;

public class Ternario_Calculadora {
    public static void main(String[] args) {

        System.out.println("1) Somar");
        System.out.println("2) Subtrair");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");

        int escolha1 = 1;
        int escolha2 = 2;
        int escolha3 = 3;
        int escolha4 = 4;

          Scanner entrada = new Scanner(System.in);

        System.out.print("\nDigite o 1º valor: ");
        double n1 = entrada.nextDouble();
        System.out.print("Digite o 2º valor: ");
        double n2 = entrada.nextDouble();
        System.out.print("Qual operação matematica deseja fazer? ");
        double operacao = entrada.nextDouble();

        double resultado = operacao == escolha1 ? n1 + n2 :
                           operacao == escolha2 ? n1 - n2 :
                           operacao == escolha3 ? n1 * n2 :
                           operacao == escolha4 ? n1 / n2 : 0;

        System.out.print("O resultado eh: " + resultado);


        //  ------------------  Resposta Professor  ------------------

        //Scanner entrada1 = new Scanner(System.in);

        System.out.print("\nDigite o 1º valor: ");
        double numero1 = entrada.nextDouble();
        System.out.print("Operação matematica ");
        String operacaoMatematica = entrada.next();
        System.out.print("Digite o 2º valor: ");
        double numero2 = entrada.nextDouble();

        // Logica
        double resultadoTotal = 0;

        resultadoTotal = operacaoMatematica.equals("+") ? numero1 + numero2 : resultadoTotal;
        resultadoTotal = operacaoMatematica.equals("-") ? numero1 - numero2 : resultadoTotal;
        resultadoTotal = operacaoMatematica.equals("*") ? numero1 * numero2 : resultadoTotal;
        resultadoTotal = operacaoMatematica.equals("/") ? numero1 / numero2 : resultadoTotal;
        resultadoTotal = operacaoMatematica.equals("%") ? numero1 % numero2 : resultadoTotal;

        System.out.printf("%.1f %s %.1f = %.2f",numero1, operacaoMatematica, numero2, resultadoTotal);

        entrada.close();
        //entrada1.close();
    }
}
