package fundamentos.OperadoresLogicos;

public class MaiorMenor_Diferente {
    public static void main(String[] args) {

        double a = 3;
        int b = 3;

        System.out.println(a == b);
        System.out.println(3 > 4);
        System.out.println(5 >= 5);
        System.out.println(2 < 10);
        System.out.println(15 <= 6);
        System.out.println(30 != 33);

        double nota = 6.5;
        boolean bomComportamento = true;
        boolean media = nota >= 7;
        boolean temDesconto = bomComportamento && media;

        System.out.println("Tem desconto?: " + temDesconto);


    }
}
