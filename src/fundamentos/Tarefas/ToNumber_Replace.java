package fundamentos.Tarefas;

import java.util.Scanner;

public class ToNumber_Replace {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o nome do funcionario?");
        String nome = entrada.nextLine();

        System.out.print("Salario 1: ");
        String sal1 = entrada.nextLine().replace(",", ".");
        System.out.print("Salario 2: ");
        String sal2 = entrada.nextLine().replace(",", ".");
        System.out.print("Salario 3: ");
        String sal3 = entrada.nextLine().replace(",", ".");

        double c1 = Double.parseDouble(sal1);
        double c2 = Double.parseDouble(sal2);
        double c3 = Double.parseDouble(sal3);

        double media = (c1 + c2 + c3) / 3;

        System.out.printf("A média dos ultimos 3 salarios do(a) funcionario(a) %s é de R$%.2f", nome, media);


        entrada.close();

        /* --------------  ALTERNATIVA DE RESULTADO (MOSTRADA PELO PROFESSOR) ----------------
         */

    }
}
