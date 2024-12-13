package controle.Tarefas__Controle;

import java.util.Scanner;

public class If__DiaDaSemana {
    public static void main(String[] args) {
        // Digite o dia da semana e o programa deve retornar um numero
        // Ex: (digito) domingo = (retorna) 1

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");
        String dia = entrada.nextLine();

        if (dia.equalsIgnoreCase("Domingo")) {
            System.out.println("1) Domingo.");

        } else if (dia.equalsIgnoreCase("Segunda")) {
            System.out.println("2) Segunda - feira.");

        } else if (dia.equalsIgnoreCase("Terça")
                || dia.equalsIgnoreCase("Terca")){
            System.out.println("3) Terça - feira.");

        } else if (dia.equalsIgnoreCase("Quarta")) {
            System.out.println("4) Quarta - feira.");

        } else if (dia.equalsIgnoreCase("Quinta")) {
            System.out.println("5) Quinta - feira.");

        } else if (dia.equalsIgnoreCase("Sexta")) {
            System.out.println("6) Sexta - feira.");

        } else if (dia.equalsIgnoreCase("Sabado")
                || dia.equalsIgnoreCase("Sábado")){
            System.out.println("7) Sabado");
        } else {
            System.out.println("Dia invalido");
        }

        entrada.close();




    }
}
