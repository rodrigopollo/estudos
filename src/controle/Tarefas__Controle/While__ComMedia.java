package controle.Tarefas__Controle;

import java.util.Scanner;

public class While__ComMedia {
    public static void main(String[] args) {
        /* Inserir notas dos alunos e contar quantas notas voce inseriu
          calcular media da turma => soma de todas notas / qnts de notas foram inseridas
          para sair -> -1
         */


        Scanner entrada = new Scanner(System.in);

        double nota = 0;
        double somaTodasNotas = 0;
        int quantidadeDeNotas = 0;

        while (nota != -1) {
            System.out.println("Insira uma nota");
            nota = entrada.nextDouble();

            if (nota <= 10 && nota >= 0) {
                somaTodasNotas += nota;
                quantidadeDeNotas += 1;

            } else if (nota != -1) {
                System.out.println("Nota invalida\n");
            }
        }
        // -->  Codigo ADD para evitar NaN (NaN = null pointer).
        if (quantidadeDeNotas > 0) {
            double media = somaTodasNotas / quantidadeDeNotas;
            System.out.println("A media da turma eh de " + media);
        }

        entrada.close();


    /* ----------------------  Explicaçao do programa e como funciona -------------------------

    - Linha 18: Enquanto o valor inserido  em nota (linha 20) seja diferente de -1 continue.
    - Linha 22: SE for (TRUE) execute os statements do bloco IF (linha 23 + 24)
    - Linha 26: Se a linha 22 for (FALSE) entao execute o bloco ELSE IF "Nota invalida"

        * Qndo nota = -1 realiza o calculo da media e mostra o resultado.
//=============================================================================================
        - Enquanto a nota inserida nao for -1 FAÇA.
             pedir para inserir nota
        - SE a nota inserida for valida (<= 10 e >= 0) entao:
             nota inserida sera armazenada/somada em soma de todas notas ..... E
             armazene que foi inserida 1 nota em quantidade de notas.
        - Mas se o valor inserido em nota nao for -1 (que sai do programa) ou uma nota valida de 0 a 10 entao
             Diga nota invalida.

        - Como metodo adicional a prova de NULL POINTER (ponto nulo) foi adicionado a seguinte condição
        SE a quantidade de notas for >0 entao
             faça o calculo da media
             mostre o resultado do calculo da media.
        Caso contrario apenas finalize o programa




    */







    }
}
