package controle;

import java.util.Scanner;

public class If__Else_If {
    public static void main(String[] args) {
        /* else if --> Apenas 1 bloco sera executado.....Bloco { }

        Se eu fizesse esse mesmo programa abaixo usando somente IF o java vai verificar todos os IF
        e retornar TRUE or false ate que o terminem todos os IF, por exemplo seu eu colocase nota 7,0:
            - Primeiro verifica conteirto A >= 8.1) == FALSE e vai verificar cada IF sem parar.
            - Ele deveria dizer (conceito B >= 6.1) == TRUE..... certo? SIM e NAO. Vamos continuar e ver.
            - Ele vai vericar o proximo IF debaixo dele e ver que 7,0 >= 4.1 == TRUE....
            entao aqui ele ja esta retornando como CORRETO (TRUE) o conceito B e C.... E nao queremos isso.
            - Vai fazer a mesma coisa com o (Conceito D) (TRUE)
            - O conceito E ele nao vai executar pq algum IF ou mais de um antes dele foram TRUE
            
            Ou seja todos os conceitos que a nota 7 seja maior que a condição dentro do IF seram TRUE..
            conceito B, C e D iram retornar como respostas corretas, oq nao eh mentira, mas nao eh oq
            queremos. Queremos que so 1 conceito seja mostrado ja que esta claro que se 7 > 6
            obviamente sera maior que 5, 4, 3, 2, 1.... entao nao queremos que se mostre isso.
            Por isso temos o ELSE IF, ele mostrara somente 1 resposta de acordo com as condiçoes dentro
            de cada IF, e quando ele encontre a 1º resposta correta ele nao verifica as outras.

         Else if --> Ele vai verificar cada linha ate que 1 delas seja TRUE ou todas FALSE
            - Caso 1 linha seja TRUE ele retorna a resposta e finaliza. Ex: 7,0 Conceito B - FIM
            - Caso nenhuma seja TRUE ele retorna Conceito E
            - Se podria interpretar ELSE IF como SE NAO. Com ELSE IF, o programa ira executar
            ate que um dos ELSE IF for TRUE. Quando isso acontecer ele executa tudo dentro do scopo
            e sai do IF.
            
        */
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma nota: ");
        
        double nota = entrada.nextDouble();
        
        if (nota > 10 || nota < 0) { // Se condição dentro de parenteses for TRUE, TRUE = execute o PRINTLN.
            System.out.println("Nota invalida");
            
        } else if (nota >= 8.1) { // se nao, verifique se essa condiçao eh TRUE???
            System.out.println("Conceita A");
            
        } else if (nota >= 6.1) { // ou se nao verifique se essa condiçao eh TRUE???
            System.out.println("Conceita B");
            
        } else if (nota >= 4.1) { // ou se nao verifique se essa condiçao eh TRUE???
            System.out.println("Conceita C");
            
        } else if (nota >= 2.1) { // ou se nao verifique se essa condiçao eh TRUE???
            System.out.println("Conceita D");
            
        } else { // Se nada for TRUE, execute essa condição.
            System.out.println("Conceito E");
        }
        
        entrada.close();
        
        
    }
}
