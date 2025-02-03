package controle;

public class While_Determinado {
    public static void main(String[] args) {
         /* While (exp <- true or false)
         While determinado --> O while sera executado um numero pre determinado de vezes.

         While eh melhor para repetiçoes infinitas (ou com palavras chaves para finalizar)
         Para um numero especifico de repetiçoes melhor usar FOR.

          Se a condição do WHILE retornar TRUE ele continuara funcionando ate
          que o resultado seja FALSE, se for FALSE, ai ele para.
          No exemplo abaixo vamos ver melhor como esta funcionando o while:
            - LINHA 25 = contador vale 1
            - Linha 27 = verifica o contador é menor ou igual a 4? (TRUE), eh 1, entao continua.
            - Linha 29 = contador recebe mais um, ou seja (linha 25) 1 + 1 (linha 29) = 2
          Entao ele volta a se repetir em bucle e o contador continua subindo

          -->  2 + 1 = 3 e verifica de novo (3 <= 4?) TRUE, entao continua
          -->  3 + 1 = 4 e verifica de novo (4 <= 4?) TRUE, entao continua
          -->  4 + 1 = 5 e verifica de novo (5 <= 4?) FALSE, entao pare (termine)

          Fim do contador e da repetição
          */
        int contador = 1;

        while (contador <= 4) {
            System.out.println("contador = " + contador); // mostra o contador subindo
            contador = contador + 1;
        }
        // OBS.: Se nao add a contador = contador + 1, o programa fica em bucle infinitor ja que
        //o contador NUNCA sai do 1 e NUNCA sera >4.
        
        /* Todas as expreçoes abaixo tem o mesmo significado, so se veem de maneira diferente.
         contador = contador + 1;
         contador += 1;
         contador ++;
         */
    }
}
