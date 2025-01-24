package classe;

public class Produto3 {

    // * NOTA: Produto3 e Produto_Test3 sao a separacao entre MAIN, metodos e controres. (sao 1 so)

    /* Nome, preco e desconto => sao atributso que tbm sao variaveis
     */
    String nome;
    double preco;
    double desconto;


    //      ======= Construtor 1 =======
    Produto3(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    //      ======= Construtor 2 =======
    Produto3() {
    }

    // Metodo 1 --> Um desconto adicional ou nao do GERENTE.
    double calculoDesconto(double descontoGerente) {

        return preco * (1 - (descontoGerente + desconto));
    }


}
