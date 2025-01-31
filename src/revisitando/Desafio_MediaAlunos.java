package revisitando;

import java.util.Scanner;

public class Desafio_MediaAlunos {
    
    public static void main(String[] args) {
        
        // media alunos (nao importa o numero). O usuario ira digitar a nota.
        // armazena as notas inseridas em 1 VARIAVEL.
        // outra variavel para verificar a quantidade de notas validas e ter a media.
        // para sair do programa sera -1.
        
        Scanner entrada = new Scanner(System.in);
        
        double notas = 0;
        double totalNotas = 0;
        int notasValidas = 0;
        
        System.out.print("Insira o nome do aluno(a): ");
        String nome = entrada.nextLine();
        System.out.println("\nDigite -1 para sair do programa.");
        
        while (notas != -1) {
            System.out.print("Insira a nota do aluno: ");
            notas = entrada.nextDouble();
            
            if (notas >= 0 && notas <= 10) {
                notasValidas += 1;
                totalNotas += notas;
                
            } else if (notas == -1) {
                System.out.print("\nCalculando media...\n");
                
            } else {
                System.out.print("Error: Nota invalida! Por favor insira uma nota entre 0 e 10!\n");
            }
        }
        // Esse IF esta aqui por si algum engraçadinho nao coloca nenhuma nota.
        if (notasValidas > 0) {
            double media = totalNotas / notasValidas;
            System.out.printf("%s tem a média de %.1f\n", nome, media);
        } else {
            System.out.println("Error: Nenhuma nota foi inseria.");
            System.out.println("Volte ao inicio e lembre-se de inserir uma nota valida.");
        }
        
        entrada.close();
        
        
    }
}
