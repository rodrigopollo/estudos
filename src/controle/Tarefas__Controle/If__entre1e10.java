package controle.Tarefas__Controle;

import java.util.Scanner;

public class If__entre1e10 {
    public static void main(String[] args) {

        // Inserir um numero e verificar se esta entre 1 e 10 e se eh par.

        Scanner entrada = new Scanner(System.in);

        int numero;
        boolean resultado = true;

        System.out.print("Insira um numero: ");
        numero = entrada.nextInt();

        if (numero >=0 && numero <=10) {
            resultado = numero % 2 == 0;
        }else {
            System.out.println("Numero Invalido");
        }
        System.out.println("O numero eh par? " + resultado);

///////////////////////////////////////////////////////////////////////////

        System.out.print("Insira um número: ");
        int numero1 = entrada.nextInt();

        if (numero1 >= 0 && numero <= 10) {
            // Verifica se o número é par
            if (numero1 % 2 == 0) {
                System.out.printf("O numero %d é par", numero1);
            } else {
                System.out.printf("O numero %d é impar", numero1);
            }
        } else {
            System.out.println("Número fora do intervalo [0, 10].");
        }

        entrada.close();
    }
}




