package fundamentos.Tarefas;

public class MathPow_Aritimetic {
    public static void main(String[] args) {

        // Math.pow --> numero elevado, exemplo 10² --> 10 * 10 = 100

        int a = (6 * (3 + 2)); // A = 30
        int a2 = (int) Math.pow(a, 2); // A ao quadrado = 900
        int divA = 3 * 2; // Divisao de A = 6
        int ra = a2 / divA; //Resultado A = 150

        int b = (1 - 5) * (2 - 7); //B = 20
        int divB = 2; // Divisao de B = 2
        int rb = b / divB; // Resultado B = 10
        int b2 = (int) Math.pow(rb, 2); //B ao quadrado = 100

        int rSub= ra - b2; // Resultado subtraçao = 50
        int rSub3 = (int) Math.pow(rSub, 3);//Resultado subtração ao cubo = 125.000
        int c = 10; // C = 10
        int c3 = (int) Math.pow(c, 3);// C ao cubo = 1.000

        int resultado = rSub3 / c3;

        System.out.println(resultado);

        //---------  ALTERNATIVA DE RESULTADO (MOSTRADA PELO PROFESSOR) ----------

        double x = Math.pow(6 * (3 + 2), 2);
        double divX = 3 * 2;
        double rx = x / divX;

        double y = ((1 - 5) * (2 - 7));
        double divY = 2;
        double ry = y / divY;
        double y2 = Math.pow( ry, 2);


        double subtracao = rx - y2;
        double z = 10;
        double subtracao3 = Math.pow(subtracao, 3);
        double z3 = Math.pow(z, 3);

        double total = subtracao3 / z3;

        System.out.println(total);










    }
}
