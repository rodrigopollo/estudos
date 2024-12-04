package controle.Tarefas__Controle;

import java.util.Scanner;

public class While__MaiorNumero {
    public static void main(String[] args) {

        // Programa deve dizer qual o maior numero que voce colocou.
        Scanner entrada = new Scanner(System.in);

        int numero;
        int maiorNumero = 0;
        int quantidadeDeNumero = 3;

        while (quantidadeDeNumero >= 0) {
            System.out.print("Insira um numero:");
            numero = entrada.nextInt();
            quantidadeDeNumero -= 1;

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        System.out.println("O maior numero inserido foi o " + maiorNumero);
        entrada.close();

        // ------------------- Resposta Professor -------------------

        Scanner scanner = new Scanner(System.in);

        int maiorValor = 0;
        int contador = 0;

        do {
            System.out.println("\nDigite um numero: ");
            int valor = scanner.nextInt();

            if (valor > maiorValor) {
                maiorValor = valor;
            }

            contador++;
        } while (contador != 3);

        System.out.printf("O maior valor foi: " + maiorValor);

        scanner.close();

    }
}
