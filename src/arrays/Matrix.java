package arrays;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int qtdeAlunos= entrada.nextInt();

        System.out.print("Quantas notas por aluno? ");
        int qtdeNotas = entrada.nextInt();
        System.out.println("===============================");
        double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];


        System.out.println(notasDaTurma.length);

        double total = 0;
        for (int aluno = 0; aluno < notasDaTurma.length; aluno += 1) {
            for (int nota = 0; nota < notasDaTurma[aluno].length; nota++) {

                System.out.printf("Informe a nota %d do aluno %d: ", nota + 1, aluno + 1);
                notasDaTurma[aluno][nota] = entrada.nextDouble();

                total += notasDaTurma[aluno][nota];
            }
        }
    System.out.println(total);

        double media = total / (qtdeAlunos * qtdeNotas);
        System.out.println("Media = " + media);

        entrada.close();
    }
}
