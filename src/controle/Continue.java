package controle;

public class Continue {
    public static void main(String[] args) {
        /* Continue
        O continue nesse caso faz vc pular o numero em questao e continuar

        Exemplo 1 => Se, i / 2 = 1, ignore e continue. No caso ele vai contar de 1 a 10
        ignorando os numeors nao divisores por 2 (pares) resultado: 0, 2, 4, 6, 8, 10.

        Exemplo 2 => Ele vai contar de 1 a 10 mas quando chegar no 5 ele vai ignorar o 5 e
        continuar oq resultara de 1 a 10 mas sem o numero 5.

         */

//      Exemplo 1:
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
            
        }
//      Exemplo 2
        for (int i2 = 1; i2 <= 10; i2++) {
            if (i2 == 5)
                continue;
            System.out.println(i2);
            
            
        }


    }
}
