package classe;

public class Materias1 {

    // * NOTA: Metodo_Curso e Materias sao a separacao entre MAIN, metodos e controres. (sao 1 so)

    String nomeMateria;
    int quantidadeHoras = 0;
    int quantidadeAlunos = 0;

    //    >>>>>>>>>>>>>>>>>> Construtor (aluno) <<<<<<<<<<<<<<<<<<<<
    Materias1(String nMateria, int qtdHoras, int qtdAlunos) {

        System.out.println("Materia: " + nMateria);
        System.out.println("Carga Horaria: " + qtdHoras);
        System.out.println("Alunos Matriculados: " + qtdAlunos);
        System.out.println("-----------------------------");
    }
}
