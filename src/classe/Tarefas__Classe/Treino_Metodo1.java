package classe.Tarefas__Classe;

public class Treino_Metodo1 {
    public static void main(String[] args) {

        // MAIN = Aqui vai o programa e aonde chamaremos os metodos feitos na classe.

        Treino_Metodo1 m1 = new Treino_Metodo1("Rodrigo", 5.7, 6.9, 8.9);
        System.out.printf("Aluno: %s", m1.nome);
        System.out.printf("\nNotas = %.1f, %.1f, %.1f.", m1.nota1, m1.nota2, m1.nota3);
        System.out.printf("\nMedia do aluno = %.1f", m1.calculoDaMedia());


        Treino_Metodo1 m2 = new Treino_Metodo1();
        System.out.printf("\n\nAluno: %s", m2.nome);
        System.out.printf("\nNotas = %.1f, %.1f, %.1f.", m2.nota1, m2.nota2, m2.nota3);
        System.out.printf("\nMedia do aluno = %.1f", m2.calculoDaMedia());
    }
    //Classe = Aqui vao todos os metodos.
    double somaNotas;
    String nome;
    double nota1;
    double nota2;
    double nota3;


    Treino_Metodo1(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    Treino_Metodo1() {
        nome = "Pedro";
        nota1 = 5.3;
        nota2 = 7.8;
        nota3 = 6.7;
    }
    double calculoDaMedia() {

        somaNotas = (nota1 + nota2 + nota3);
        return somaNotas / 3;
    }




}


