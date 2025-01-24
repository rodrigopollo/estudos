package classe.Tarefas__Classe;

public class ProdutoTarefaTeste {
    public static void main(String[] args) {

        // * NOTA: ProdutoTarefa e ProdutoTarefaTeste sao a separacao entre MAIN, metodos e controres. (sao 1 so)

        ProdutoTarefa p1 = new ProdutoTarefa("Notebook", 1000.00);

        var p2 = new ProdutoTarefa();
        p2.nome = "Caneta Preta";
        p2.preco = 10.00;

        ProdutoTarefa.desconto = 0.25; //nao sei ate q ponto isso aqui eh util... me parece inutil.
        //ja q eh redundante... o desconto sempre sera de 0.25 sem isso assim q fizer o calculo padrao.


        double precoFinal1 = p1.calculoDesconto(0.1); // 10%
        double precoFinal2 = p2.calculoDesconto(0);   // 0%

        System.out.print("============================\n");
        System.out.printf("Preço %s: %.2f", p1.nome, p1.preco);
        System.out.printf("\nValor con desconto: %.2f", p1.calculoDesconto(0.0));
        System.out.print("\n============================\n");

        System.out.printf("Preço da %s: %.2f", p2.nome, p2.preco);
        System.out.printf("\nValor con desconto: %.2f", p2.calculoDesconto(0.0));
        System.out.print("\n============================\n");

        double precoTotal = precoFinal1 + precoFinal2;
        double mediaCarrinho =  precoTotal / 2;

        System.out.printf("Media do valor gasto %.2f", mediaCarrinho);
        System.out.printf("\n--> Total a pagar: %.2f\n", precoTotal);

    }
}
