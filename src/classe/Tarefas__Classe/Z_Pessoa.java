package classe.Tarefas__Classe;

public class Z_Pessoa {

    /* - Nome e peso
       - 1 Metodo que recebe o parametro classe Z_Comida
       - Esse metodo ira fazer um calcu
     */


    String nomeDaPessoa;
    double pesoDaPessoa;

    Z_Pessoa(String nomeDaPessoa, double pesoDaPessoa) {
        this.nomeDaPessoa = nomeDaPessoa;
        this.pesoDaPessoa = pesoDaPessoa;
    }

    void comer(Z_Comida comida) {
        this.pesoDaPessoa += comida.pesoDaComida;
    }

    void aprensetar() {
        System.out.println("Nome: " + nomeDaPessoa + " e tem " + pesoDaPessoa + "kgs");
    }
}
