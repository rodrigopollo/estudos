package fundamentos.OperadoresLogicos;

public class Atribuicao {
    public static void main(String[] args) {

        int a = 3; // o valor literal 3 esta atribuido a "VARIAVEL A" do tipo Primitivo INT
        int b = a; // a "VARIAVEL B" recebe o valor da "VARIAVEL A (3)" do tipo Primitivo INT
        int c = a + b; // a "variavel C" recebe o valor da expressao "a + b" (3 + 3 = 6)

        c += b; // c = c + b;  c(6) + b(3) = 9
        c -= a; // c = c - a;  c(9) 1 a(3) = 6
        c *= b; // c = c * b;  c(6) * b(3) = 18
        c /= a; // c = c / b;  c(6) / a(3) = 6
        c %= 2; // c = c % 2; se a divisao der 0 eh par, se nao eh impar.

        System.out.println(c);




    }
}
