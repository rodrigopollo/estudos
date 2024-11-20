package controle;

import java.util.Scanner;

public class If__Else_If {
    public static void main(String[] args) {
        /* else if --> Apenas 1 bloco sera executado.....Bloco { }

        Se eu fizesse esse mesmo programa usando somente IF o java vai verificar todos os IF
        por exemplo seu eu colocase nota 7,0:
            - Ele deveria dizer (conceito B) (TRUE) certo? SIM e NAO.
            - Ele vai vericar o proximo IF debaixo dele e ver que 7,0 eh maior que 4.1? (TRUE) entao tbm (CONCEITO C)
            - Vai fazer a mesma coisa com o (Conceito D) (TRUE)
            - O conceito E ele nao vai executar pq algum IF ou mais de um antes dele foram TRUE

         Else if --> Ele vai verificar cada linha ate que 1 delas seja TRUE ou todas FALSE
            - Caso 1 linha seja TRUE ele retorna a resposta e finaliza. Ex: 7,0 Conceito B - FIM
            - Caso nenhuma seja TRUE ele retorna Conceito E                                                   */

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma nota: ");

        double nota = entrada.nextDouble();

        if (nota >10 || nota < 0) {
            System.out.println("Nota invalida");

        }  else if (nota >= 8.1) {
            System.out.println("Conceita A");

        }  else if (nota >= 6.1) {
            System.out.println("Conceita B");

        }  else if (nota >= 4.1) {
            System.out.println("Conceita C");

        }  else if (nota >= 2.1) {
            System.out.println("Conceita D");

        } else {
            System.out.println("Conceito E");
        }

        entrada.close();

        if (nota >10 || nota < 0)
        {   System.out.println("Nota invalida");

        }  else if (nota >= 8.1)
        {  System.out.println("Conceita A");

        }  else if (nota >= 6.1)
        {   System.out.println("Conceita B");

        }  else if (nota >= 4.1)
        {   System.out.println("Conceita C");

        }  else if (nota >= 2.1)
        {   System.out.println("Conceita D");

        }  else
        {   System.out.println("Conceito E");
        }

        entrada.close();































    }
}
