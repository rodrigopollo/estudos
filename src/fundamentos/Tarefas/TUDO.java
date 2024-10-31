package fundamentos.Tarefas;

import java.util.Scanner;

public class TUDO {
    public static void main(String[] args) {

        String dia = "20";
        String tempo = "nublado";

        System.out.println(dia.replace("20", "dia 20").startsWith("dia")); //true
        System.out.println(tempo.replace("nublado", "esta nublado"));
        System.out.println(dia.startsWith("dia")); // false pq ja volta pro valor original 20

        String n1 = "8";
        String n2 = "10";

        int conversaoN1 = Integer.parseInt(n1);
        int conversaoN2 = Integer.parseInt(n2);
        int resultado = conversaoN1 * conversaoN2;

        System.out.println(resultado);

        short intToLong1 = (short) conversaoN1;
        short intToLong2 = (short) conversaoN2;

        long resultado2 = intToLong1 + intToLong2;
        System.out.println(resultado2);

        /* Inserir notas dos alunos e contar quantas notas voce inseriu
          calcular media da turma => soma de todas notas / qnts de notas foram inseridas
          para sair -> -1
         */

        Scanner entrada = new Scanner(System.in);

        double nota = 0;
        double somaDeNotas = 0;
        double media = 0;
        int quantidadeDeNotas = 0;


        while (nota != -1) {
            System.out.println("Insira a nota");
            nota = entrada.nextDouble();

            // Verifica se a nota eh valida
            if (nota <= 10 && nota >= 0) {
                somaDeNotas += nota;
                quantidadeDeNotas += 1;
            } else {
                System.out.println("Nota invalida");
            }
        }

        // Verifica se foi ou nao inserida pelo menos 1 nota.
        if (quantidadeDeNotas <= 0) {
            System.out.println("Error: Nenhuma nota inserida");
        } else {
            media = somaDeNotas / quantidadeDeNotas;
            System.out.println(media);
        }


        entrada.close();


    }
}
