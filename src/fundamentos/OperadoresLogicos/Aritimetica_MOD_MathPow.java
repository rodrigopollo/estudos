package fundamentos.OperadoresLogicos;

public class Aritimetica_MOD_MathPow {
    public static void main(String[] args) {

        // ---------------  Aritimeticas ---------------

        System.out.println(2 + 3);

        var x = 50.25;
        double y =2.2;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        int a = 9;
        int b = 5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a / (double) b); //Transforma B e o resultado no tipo flutuante DOUBLE
        System.out.println(a / (float) b); //Transforma B e o resultado no tipo flutuante FLOAT
//====================================================================================

        // ---------------  MOD ---------------

       /* O --- % --- se chama MOD, ele mostra o resto da divisao entre A e B
        Ex 1:
             7 % 2 = 1
        A divisao de 7 por 2 sobra 1, esse numero 1 eh o resultado de MOD ""%""
        Teria que ser 6 / 2 = 0
        Ex 2:
             8 % 5 = 3.
        8 divido por 5 sobra 3, que sera o resultado de MOD.
         */
        System.out.println(a % b);
        System.out.println(8 % 5);
//====================================================================================

        // --------  Math.pow -> Operação ao cubo, quadrado etc.. ----------

        // A operação --- "Math.pow()" --- vc consegue fazer o valor ao " ² ", valor ao " ³ " etc...

        int aa = (6 * (3 + 2)); // A = 30
        int aa2 = (int) Math.pow(a, 2); // A ao quadrado = 900
        int divAA = 3 * 2; // Divisao de A = 6
        int rAA = aa2 / divAA; //Resultado A = 150

        System.out.println(rAA);



    }
}
