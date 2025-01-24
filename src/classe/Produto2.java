package classe;

public class Produto2 {

    // * NOTA: Produto2 e Produto_Test2 sao a separacao entre MAIN, metodos e controres. (sao 1 so)

    String nome;
    double preco;
    double desconto;


    // Metodo 1 --> Um desconto adicional ou nao do GERENTE.
    double calculoDesconto(double descontoGerente) {

        return preco * (1 - (descontoGerente + desconto));
    }

    // Metodo 2
    double calculoDesconto() {

        return preco * (1 - desconto);
    }

}

