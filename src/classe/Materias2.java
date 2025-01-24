package classe;

public class Materias2 {

    // * NOTA: Metodo_Curso2 e Materias2 sao a separacao entre MAIN, metodos e controres. (sao 1 so)

    Materias2() {
    }

    void soma(int turma, int qtdHoras1, int qtdAlunos1){

        int somaHoras = 0;
        int somaAlunos = 0;
        somaHoras += qtdHoras1;
        somaAlunos += qtdAlunos1;

        System.out.println("\nTurma: " + turma);
        System.out.println("nHoras: " + qtdHoras1 + " - Alunos: " + qtdAlunos1);
        System.out.println("Acumulado de horas: " + somaHoras + " - Acumulado de Alunos: " + somaAlunos);
        System.out.println("-----------------------------");


    }

}
