package controle.Tarefas__Controle;

import java.util.Scanner;

public class While__ParImpar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int quantidadePar = 0;
        int quantidadeImpar = 0;

        while (numero >= 0){
            System.out.print("Insira um numero :");
            numero = entrada.nextInt();

            if (numero % 2 == 0) {
                quantidadePar += 1;
            } else if (numero % 2 == 1){
                quantidadeImpar += 1;
            }
        }
        System.out.print("Quantidade de numeros pares: " + quantidadePar);
        System.out.print("\nQuantidade de numeros impar: " + quantidadeImpar);
        entrada.close();
    }
}
