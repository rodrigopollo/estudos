package classe.Tarefas__Classe;

import java.util.Scanner;

public class Treino_Metodo22 {
    public static void main(String[] args) {

        // Programa para verificar o maior e o menor numero inserido.
        Treino_Metodo2 m1 = new Treino_Metodo2();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite números (ou -1 para parar): ");

        while (true) {
            System.out.print("Número: ");
            int numero = scanner.nextInt();

            if (numero == -1) { // Condição de saída
                break;
            }
            m1.verificaNumero(numero);
        }

        System.out.println("Maior número: " + m1.getMaiorNumero());
        System.out.println("Menor número: " + m1.getMenorNumero());
        scanner.close();
    }
}

/*   >>>>>>>>>>>>>>  ALTERNATIVA PARA LOOP <<<<<<<<<<<<<<<<

        while (true) {
            System.out.print("Número: ");
            int numero = scanner.nextInt();

            if (numero == -1) { // Condição de saída
                break;
            }
            verificador.verificaNumero(numero);
        }
 */