package classe.Tarefas__Classe;

public class ProdutoTarefa  {

    // * NOTA: ProdutoTarefa e ProdutoTarefaTeste sao a separacao entre MAIN, metodos e controres. (sao 1 so)


    /* Nome, preco e desconto => sao atributso que tbm sao variaveis
     */
    String nome;
    double preco;
    static double desconto = 0.25;


    //      ======= Construtor 1 =======
    ProdutoTarefa(String nomeInicial, double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;
    }


    //      ======= Construtor 2 =======
    ProdutoTarefa(){
    }

    // Metodo 1 --> Um desconto adicional ou nao do GERENTE.
    double calculoDesconto (double descontoGerente){
        return preco * (1 - (descontoGerente + desconto));
    }

}
