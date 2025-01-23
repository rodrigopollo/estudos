package classe;

public class Produto_Test2 {
    public static void main(String[] args) {


        Produto2 p1 = new Produto2();
        p1.desconto = 0.25;
        p1.nome = "Notebook";
        p1.preco = 4356.89;

        var p2 = new Produto2();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;


        //Metodo 1 => Preço original e final com desconto + desconto ou nao do gerente de 10%
        double precoFinal1 = p1.calculoDesconto(0.1); // 10%
        double precoFinal2 = p2.calculoDesconto(0);   // 0%

        // Metodo 1

        System.out.printf("Preço %s = %.2f", p1.nome, p1.preco);
        System.out.printf("\nCom desconto fica a %.2f", p1.calculoDesconto(0.1));
        System.out.println("\n------------------------------");

        // Metodo 2
        System.out.printf("Preço da %s = %.2f", p2.nome, p2.preco);
        System.out.printf("\nCom desconto fica a %.2f", p2.calculoDesconto());
        System.out.println("\n------------------------------");

        double precoTotal = precoFinal1 + precoFinal2;
        double mediaCarrinho =  precoTotal / 2;

        System.out.printf("Media do valor gasto = %.2f", mediaCarrinho);
        System.out.printf("\n--> Total a pagar = %.2f\n", precoTotal);


    }
}
