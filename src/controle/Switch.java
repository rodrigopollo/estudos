package controle;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // Swith sem breack, ele executa tudo oq estiver abaixo da linha executada.
        
        
        
        /* SWITCH SEM BREACK EXEMPLO 1:
        
        Nesse exemplo, temos uma variavel FAIXA2 com um valor atribuido "marrom".
        Quando o programa execute este exemplo ele vai exibir "FAIXA MARROM" e como nao usamos breack
        ele vai exibir todos os CASE que estiverem abaixo dele, no caso so "FAIXA ROXA".
         */
        System.out.println(">>>>>>>> Switch sem Breack tipo String <<<<<<<<");
        
        String faixa2 = "marrom";
        
        switch (faixa2.toLowerCase()) {
            case "preta":
                System.out.println("Faixa preta");
            case "marrom":
                System.out.println("Faixa marrom");
                // break;  -> desse jeito ele executa o comando "FAIXA MARROM" e finaliza.
            case "roxa":
                System.out.println("Faixa roxa");
        }
//////////////////////////////////////////////////////////////////////////////
        /* SWITCH SEM BREACK EXEMPLO 2:
        
        Este exemplo usa a classe do tipo INT e nao do tipo STRING, mas faz exatamente
        a mesma coisa que o exemplo numero 1, como nao tem breack ao executar o comando
        do CASE 2: ele tbm vai executar tudo que estiver abaixo
         */
        System.out.println("===============================================");
        System.out.println(">>>>>>>> Switch sem Breack tipo INT <<<<<<<<");
        
        int idade = 2;

        switch (idade) {
            case 2:
                System.out.println("Sabe falar");
                // break;  -> desse jeito ele executa o comando 2 e finaliza.
            case 1:
                System.out.println("Sabe andar");
        }
        
///////////////////////////////////////////////////////////////////////////////
        
        /* SWITCH SEM BREACK EXEMPLO 3:
        
        Esse exemplo eh bem diferente. Neste exemplo armazenamos o switch em 1 variavel e
        obrigatoriamente TEM que ter DEFAUT ou ele nao funciona.
        Desse jeito mesmo sem usar BREACK o programa so executa o CASE correto e finaliza
        e avisa caso o comando INSERIDO em COR seja invalido ou incorreto.
        
         */
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("===============================================");
        System.out.println(">>>>>>>> Switch dentro de 1 variavel <<<<<<<");
        
        System.out.print("Insira a cor da faixa: ");
        String cor = entrada.nextLine();
        
        String faixa = switch (cor.toLowerCase()) {
            case "preta" -> "Faixa preta";
            case "marrom" -> "Faixa marrom";
            case "roxa" -> "Faixa roxa";
            default -> "Invalida"; // comando obrigatorio ou nao funciona.
        }; // armazendo em variavel voce precisa colocar o ponto e virgula depois de fechar o SCOPO.
        
        System.out.println("A cor da faixa é " + faixa);
        
        entrada.close();
    }
}
