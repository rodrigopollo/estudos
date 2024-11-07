package fundamentos.OperadoresLogicos;

import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = entrada.nextLine();
        System.out.print("\nDigite a media do aluno: ");
        double media = entrada.nextDouble();

        //Aqui estamos usando a String Ternario
        String resultadoParcial = media >= 5.0 ? "em recuperação." : "reprovado.";
        String resultadoFinal = media >= 7.0 ? "aprovado." : resultadoParcial;

        System.out.printf("\nO aluno %s tem a media %.1f e esta %s", nome, media, resultadoFinal);

        double nota = media;
        boolean bomComportamento = true;
        boolean passouNaMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouNaMedia;
        String resultado = temDesconto ? "Sim." : "Não.";

        System.out.println("\nTem desconto? -> " + resultado);

        entrada.close();
    }
}
     /* double media = 8.6;
        String resultadoFinal = media >= 7.0 ? "aprovado." : "em recuperação.";
        O ternario parece mt com a funçao (SE)....
        Exemplo 1:  String resultadoFinal = media >= 7.0 ? "aprovado." : "em recuperação.";

                    -->  caso media >= 7.0 retorne "aprovado"
                    -->  caso contrario, se media for < 7.0 retorne "em recuperação"

        Exemplo 2:
        String resultadoParcial = media >= 5.0 ? "em recuperação." : "reprovado.";
        String resultadoFinal = media >= 7.0 ? "aprovado." : resultadoParcial;

             -->  caso media >= 5.0 retorne "em recuperação" e verifique a linha abaixo.
             -->  caso contrario retorne "reprovado"
             -->  caso media >= 7.0 retorne "aprovado"
             -->  caso contrario, se media for < 7.0 retorne "em recuperação"

        Esse exemplo eh diferente porque se a nota de (resultadoParcial) for >= 5.0 (ex: 6.5)
        ele passa pra linha de baixo e pergunta.
            - Oq eu tenho que fazer com essa nota de (resultadoParcial)?
            R.: Verifica se essa nota (6.5) eh maior ou menor que 7.0!
            se for maior retorne APROVADO!!!
            caso contrario pode continuar com a regra de (resultadoParcial) e retornar "em recuperação".

      */