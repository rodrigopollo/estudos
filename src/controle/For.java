package controle;

public class For {
    public static void main(String[] args) {
        /* FOR --> Usado quando voce precisar de um contador. Caso contrario melhor (While)

        Para repetiçoes infinitas (ou com palavras chaves para finalizar) melhor o WHILE.
        A extrutura do for ah a seguinte:
        for (a; b; c) { }

        for --> palavra reservada
        (a; --> da onde vai iniciar o contador (ex: contador = 1)
        b;  --> condição de contagem (ex: contador <= 4)
        c)  --> alteraçao na contagem do contador (ex: contador += 1)
        
        NOTA: o (C) pode ser qualquer coisa, nao so +1... pode ser +2, +100, -10, *, / etc...
        voce pode multiplicar, subtrair, dividir, nao necesariamente so somar.

        Este foi o programa que fizemos no (WHILE), veremos que o FOR faz a mesma coisa
        de maneira mais simples.
        ---------------------------------------------------------------------------------
        
        int contador = 1;

        while (contador <= 4) {
            System.out.println("contador = " + contador); // mostra o contador subindo
            contador = contador + 1;
            
         }-------------------------------------------------------------------------------
         */
        
        /* Vamos rever rapidamente.
        for (int contador = 1;  --> o contador começara com o valor 1
            contador <= 4;  -->  o contador ira continuar ate que o valor dele seja <= 4
            contador += 1)  -->  e a cada ciclo o contador tera seu valor somado com +1
         */
        for (int contador = 1; contador <= 4; contador += 1) {
            System.out.println("contador = " + contador);
        }

        for (int contador1 = 10; contador1 >= 0; contador1 -=2) {
            System.out.println(contador1);
        }
    }
}
// for (;;) { // isso ira ser 1 laço infinito.
//         System.out.println("FIM!");
//         }