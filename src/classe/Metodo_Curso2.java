package classe;

import java.util.Scanner;

public class Metodo_Curso2 {
    public static void main(String[] args) {

        // * NOTA: Metodo_Curso2 e Materias2 sao a separacao entre MAIN, metodos e controres. (sao 1 so)

        //    >>>>>>>>>>>>>>>>>> Metodo (SOMA) <<<<<<<<<<<<<<<<<<<<


        Materias2 aluno = new Materias2();

        // Scanner
        Scanner entrada = new Scanner(System.in);

        int qtdHoras;
        int qtdAlunos;

        for (int contador = 1; contador <= 3; contador += 1){

            System.out.println("Digite a carga horaria do curso: " + contador);
            qtdHoras = entrada.nextInt();

            System.out.println("Digite a quantidade de alunos:");
            qtdAlunos = entrada.nextInt();

            aluno.soma(contador, qtdHoras, qtdAlunos);
        }
        entrada.close();
    }
}
