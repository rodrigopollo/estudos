package fundamentos;

import javax.swing.*;

public class C__StringToNumber {
    public static void main(String[] args) {
        /*--- JOptionPane.showInputDialog() ---
         Quando der RUN faz abrir uma janela com o texto digitado (EX: "Digite o primeiro numero")
         */
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero:");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo numero:");

        /* Ele vai pegar valor String digitado nas 2 janelas abertas nas linhas de cima e mostrar na tela.
        Ex:
            Janela 1 -> 9
            Janela 2 -> 0
        O System.out ira mostrar 90 pois ele ira juntar as 2 STRING inseridas nas 2 janelas.
         */
        System.out.println(valor1 + valor2);


        /* -----  Conversao de String to Number -----

        Do mesmo jeito que para converter o tipo primitivo INT para STRING tivemos que usar WRAPPER, ao converter o
        STRING para numeros teremos que usar WRAPPERS e o comando "".parse"", entao ficaria assim:
         - Double.parseDouble() --> Classe Wrapper Double(D) do primitivo double(d)
         - Integer.parseInt() --> Classe Wrapper Integer do primitivo int
         E isso funciona para todos os primitivos, byte, short, long, float.
         */
        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        //Para mostrar a soma podemos fazer de 2 maneiras... Modo direto como abaixo ou.
        System.out.println(num1 + num2);
        //Somar e atribuir os valores a 1 variavel e usar essa variavel para mostrar no console.
        double soma = num1 + num2;
        System.out.printf("Soma: %.1f + %.1f = %.1f\n", num1, num2, soma);
        System.out.printf("A média final é de: %.2f\n\n", soma / 2);



        // Resposta mais simples feita pelo professoa:
        System.out.println("Soma: "+ soma);
        System.out.println("Média: "+ soma / 2);






    }
}
