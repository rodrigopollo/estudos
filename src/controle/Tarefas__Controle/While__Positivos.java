package controle.Tarefas__Controle;

import java.util.Scanner;

public class While__Positivos {
    public static void main(String[] args) {

        //Somar todos numeros inseridos SE forem positivos
        // Se for negativo encerrar programa

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int somaNumerosPares = 0;

        while (numero >= 0) {
            System.out.print("Insira um numero:");
            numero = entrada.nextInt();

            if (numero < 0) {
                System.out.println(somaNumerosPares);
            } else {
                somaNumerosPares += numero;
            }
        }
        entrada.close();







    }
}
