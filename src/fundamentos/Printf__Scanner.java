package fundamentos;

import java.util.Scanner;

public class Printf__Scanner {
    public static void main(String[] args) {

        System.out.print("Bom");
        System.out.print(" dia.\n\n");

        System.out.println("Bom");
        System.out.println("dia\n");

        System.out.printf("Megasena: %d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6);

        System.out.printf("Salario: R$%.1f\n", 1450.785249);
        System.out.printf("Nome: %s\n", "Joao");
        //Scanea uma entrada, nesse caso o teclado --"System.in"--. O teclado eh uma entrada e o monitor eh a saida.
        //

        Scanner entrada = new Scanner(System.in); //agora precisamos dar um uso para -- ENTRADA --
        //Para finalizar o programa vc precisa digitar algo, como nao foi configurado uma saida pedindo digitar
        //o console fica pouco intuitivo e se vc nao clicar no console vc nao sabe q tem que digitar algo. EX:
        // --->  entrada.nextLine(); Por isso digitamos a linha abaixo para enchergar que temos q digitar algo.
        System.out.print("Digite o seu nome: "); //vc pede para inserir os dados

        /* O comando --- entrada.nextLine() --- è do tipo string, ou seja, ela eh usada para digitar 1 resposta de
         * texto (EX: Rodrigo), e essa entrada de resposta voce armazena em uma variavel do tipo STRING
         * nesse caso foi a variavel to tipo String -- NOME --
         *
         */
        String nome = entrada.nextLine(); // entrada;nextLine() eh do tipo STRING, se for numeros nao funciona

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();

       System.out.print("Digite a sua idade: ");
       int idade = entrada.nextInt(); //aqui entrada eh tipo INT, se for texto nao funciona

        System.out.printf("O Sr(a) %s %s tem %d anos", nome, sobrenome, idade);

        //sempre tem que fechar o scanner quando vc termina de usar ele, no caso aqui o scanner e ENTRADA (linha 27)
        //que tbm ajuda a economizar memoria e espaço ao fechar
        entrada.close();


    }
}
