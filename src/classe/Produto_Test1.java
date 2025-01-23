package classe;

public class Produto_Test1 {
    public static void main(String[] args) {

        Produto1 p1 = new Produto1();
        p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;

        var p2 = new Produto1();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        double precoFinal1 =  p1.preco * (1 - p1.desconto);
        double precoFinal2 =  p2.preco * (1 - p2.desconto);

        System.out.print("============================\n");
        System.out.printf("Preço %s: %.2f", p1.nome, p1.preco);
        System.out.printf("\nValor con desconto: %.2f", precoFinal1);
        System.out.print("\n============================\n");

        System.out.printf("Preço da %s: %.2f", p2.nome, p2.preco);
        System.out.printf("\nValor con desconto: %.2f", precoFinal2);
        System.out.print("\n============================\n");

        //Calculo para valor a pagar e media gasta na compra
        double precoTotal = precoFinal1 + precoFinal2;
        double mediaCarrinho =  precoTotal / 2;

        System.out.printf("Media do valor gasto %.2f", mediaCarrinho);
        System.out.printf("%n --> Total a pagar: %.2f\n", precoTotal);



    }
}
