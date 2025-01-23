package classe;

public class Metodo_Curso1 {

    public static void main(String[] args) {

        // * NOTA: Metodo_Curso e Materias sao a separacao entre MAIN, metodos e controres. (sao 1 so)

        //    >>>>>>>>>>>>>>>>>> Construtor (aluno) <<<<<<<<<<<<<<<<<<<<

        Materias1 aluno = new Materias1("Phyton", 120, 59);

        aluno.nomeMateria = "Algebra";
        aluno.quantidadeAlunos = 40;
        aluno.quantidadeHoras = 50;

        System.out.println(aluno.nomeMateria);
        System.out.println(aluno.quantidadeAlunos);
    }
}
