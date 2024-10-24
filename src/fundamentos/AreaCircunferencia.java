package fundamentos;

public class AreaCircunferencia {

    public static void main(String[] args) {

        //DOUBLE = valores reais (ex: 3.4), double se escreve em minusculo.
        double raio = 3.4;
        //Quando vc coloca o FINAL, voce diz,AQUI TERMINA ESSE DOBLE, ou seja, o valor de PI
        //nao pode mais ser alterado nas linhas abaixo. Para alterar tem que ir diretamente no final double
        //quando voce coloca o FINAL, o double deixa de ser 1 variavel e passa a ser uma constante


        final double PI = 3.14159; //Isso eh um double constante

        double area = PI * raio * raio;//Isso eh um double variavel
        System.out.println(area);

        raio = 10;
        area = PI * raio * raio;
        System.out.println("Area = " + area + " m2");
    }
}