package fundamentos;

import java.util.Scanner;

public class Tipo__String {
    public static void main(String[] args) {
        
        
        System.out.println("Ola pessoal".charAt(1));
        /*
         .charAt nesse caso mostra a letra relacionada
         zero = letra O
         1 = letra L
         2 = letra A
         3 = o espaço em branco entre ola pessoal etc....
         */
        /*
           String eh um OBJETO IMUTAVEL, ou seja o valor ORIGINAL que vc coloca nela nao pode ser alterado.
           Ele pode ser substituido ja seja editando a linha string manualmente ou adicionando outra linha
           para substituir o valor original de string, mas vc esta SUBSTITUIND e nao ALTERANDO o valor
           que voce deu para STRING. EX:
         */
        
        String s = "Boa tarde"; //valor original = Boa tarde
        //  s = "Bom dia";
        //  valor original SUBSTITUIDO por Bom dia. O Valor original contia sendo Boa tarde.
        
        System.out.println(s.concat("!!!")); //Voce esta add "!!!" no final da string "Boa tarde" da linha 21
        System.out.println(s + "???"); // mesma coisa de maneira diferente, add ??? no final da string "Boa tarde"
        System.out.println(s.startsWith("Boa"));//Esta verificando se a string começa com "Boa", -- TRUE --
        System.out.println(s.startsWith("boa"));//eh "Boa" com letra B mauiscula entao, -- FALSE --
        System.out.println(s.toLowerCase().startsWith("boa"));//transforma a string en letras minusculas entao -- True --
        System.out.println(s.length());//Comando valido so em STRING, verifica qnt de caracteres, conta espaço.
        System.out.println(s.toUpperCase().endsWith("DIA"));//transforma em maiuscula e verifica se a
        // string termina com "DIA" -- FALSE-- eh "TARDE"
        System.out.println(s.equals("boa tarde"));//verifica se a string eh igual, -- FALSE -- eh "Boa tarde"
        System.out.println(s.equalsIgnoreCase("boa tarde"));//verifica ignorando CASE entao -- TRUE --
        
        // .startWith() --> retorna um valor de TRUE or FALSE verificando o inicio da string
        // .endsWith() --> retorna um valor de TRUE or FALSE verificando o final da string
        // .toLowerCase() --> transforma a string em letras minusculas
        // .toUpperCase() --> transforma a string em letras maiuscula
        // .concat() --> add a string digitada no final da string.
        // .s + "!!!" --> faz a mesma coisa que o concat
        // .length() --> verifica quantos caracteres tem a string selecionada
        // .equals() --> verifica se a string eh igual ao digitado dentro de EQUALS
        // .equalsIgnoreCase() --> ignora maisculas e minusculas e verifica se a string é igual (TRUE or FALSE)
        
        var nome = "Pedro";
        var sobrenome = "dos Santos";
        var idade = 33;
        var salario = 12_345.987;
        //Dessa maneira vc so imprimi as variaveis
        //
        System.out.printf("O senhor %s %s tem %d anos e recebe R$%.2f", nome, sobrenome, idade, salario);
        //Ja aqui vc atribui todas as variaveis dentro de outra variavel -- FRASE -- e vc consegue usar ela
        //quantas vezes voce quiser.
        String frase = String.format("\nO senhor %s %s tem %d anos e recebe R$%.2f\n", nome, sobrenome, idade, salario);
        System.out.println(frase);
        //Aqui vc atribui td pra variavel -- maisUmaFrase -- e usa o modelo de info, pula linha, info etc...
        // o \n pula pra proxima linha.
        String maisUmaFrase = "Nome: " + nome
                + "\nSobrenome: " + sobrenome
                + "\nIdade: " + idade
                + "\nSalario: " + salario;
        System.out.println(maisUmaFrase);
        
        
    }
}
