package fundamentos.OperadoresLogicos;

public class Unario_Contador {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        a++; // a = a + 1;
        a--; // a = a - 1;

        ++b; // b = b + 1;
        --b; // b = b - 1;

        System.out.println(a);
        System.out.println(b);
        System.out.println(++a == b--);
        System.out.println(a == b);

        /* Essa operaçao eh TRUE por causa da prioridade escolhida. Vamos ver oq vc esta dizendo
        no seu codigo:
        (++a == b--) 1º eu quero A + 1 (++a)...depois verificar se A = B e só apos verificar fazer B - 1.

        Outro exemplo para ficar mais claro.
        (++a == --b) 1º eu quero A + 1(++a)...depois B - 1(--b)...por ultimo verificar se A = B
        Ou seja:

        ++A -->  primioridade em somar A + 1 antes de fazer nada.
        A++ -->  se tiver alguma operação matematica antes do A pode fazer, e so depois fazer A + 1

         */



    }
}
