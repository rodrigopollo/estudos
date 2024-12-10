package controle.Tarefas__Controle;

import java.util.Scanner;

public class If__Media {
    public static void main(String[] args) {
        //2 notas --- Calcula media ---
        // > 7 aprovado
        //entre 4 e 7 recuperação
        // <7 reprovado

        Scanner entrada = new Scanner(System.in);

        // Variáveis para controle e cálculo das notas
        int totalNotasLidas = 0;
        double somaDasNotas = 0;
        double notaAtual;
        double mediaFinal;

        // Ler 2 notas válidas
        while (totalNotasLidas < 2) {
            System.out.print("Insira a nota do aluno (entre 0 e 10): ");
            notaAtual = entrada.nextDouble();

            // Verificar se a nota está dentro do intervalo permitido
            if (notaAtual >= 0 && notaAtual <= 10) {
                somaDasNotas += notaAtual;       // Somar a nota à soma total
                totalNotasLidas += 1;            // Incrementar o número de notas válidas lidas
            } else {
                System.out.println("Nota inválida. Por favor, insira uma nota entre 0 e 10.");
            }
        }

        // Calcular a média final
        mediaFinal = somaDasNotas / totalNotasLidas;

        // Avaliar o aluno com base na média final
        if (mediaFinal >= 7) {
            System.out.printf("Aprovado com a média %.1f%n", mediaFinal);
        } else if (mediaFinal >= 4) {
            System.out.printf("Recuperação com a média %.1f%n", mediaFinal);
        } else {
            System.out.printf("Reprovado com a média %.1f%n", mediaFinal);
        }

        // Fechar o scanner
        entrada.close();
    }
}