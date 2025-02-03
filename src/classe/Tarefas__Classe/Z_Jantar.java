package classe.Tarefas__Classe;

public class Z_Jantar {
    public static void main(String[] args) {

        /*
        nome da comida (pode ser no construtor)
        cada comida tem que ser instanciada parece, cada 1 com suas caracteristicas

        aqui vc vai criar 2 pessoas, e faz a pessoa comer a comida.
        Mostra o peso antes e depois de comer.

        AQUI vc vai instanciar a comida e colocar as caracteriscas (nome e peso) e a pessoa
        Essa pessoa vai comer, ou seja vai chamar o metodo COMER da classe Pessoa
         */

        Z_Pessoa p1 = new Z_Pessoa("rodrigo", 80);

        Z_Comida c1 = new Z_Comida("arroz", 2.5);

        p1.aprensetar();
        p1.comer(c1);
        p1.aprensetar();

    }
}
