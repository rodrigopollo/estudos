package colecoes;

import java.util.ArrayList;

public class AL_List {
    public static void main(String[] args) {

        ArrayList<UsuarioDaLista> lista = new ArrayList<>();

        UsuarioDaLista u1 = new UsuarioDaLista("Ana");   // 0
        lista.add(u1);

        lista.add(new UsuarioDaLista("Carlos"));     // 1
        lista.add(new UsuarioDaLista("Rodrigo"));    // 2
        lista.add(new UsuarioDaLista("Nino"));       // 3


        //Acessando uma posicao especifica do ArrayList
        System.out.println("\n " + lista.get(2).nome);     // Rodrigo

        System.out.println("Removendo Carlos (posicao 1) = " + lista.remove(1));
        System.out.println("Removendo Ana (posicao 0) = " + lista.remove(new UsuarioDaLista("Ana")));

        for(UsuarioDaLista cadaPosicao : lista){
            System.out.println(cadaPosicao);
        }
        System.out.println("-------------------");
        System.out.println("Tem Rodrigo? = " + lista.contains(new UsuarioDaLista("Rodrigo")));
        System.out.println("Tem Ana? = " + lista.contains(u1));



    }
}
/*
    Esse eh um jeito de adicionar usuario, apos criar o construtor vc cria a instancia e adiociona
    diretamente o nome. Mas o problema eh que pra cada nome vc tera que ficar criando instancias
    ou substituido o nome atual. Entao nao eh a melhor maneira de ser feita.

        UsuarioDaLista u1 = new UsuarioDaLista("Ana");
        lista.add(u1);

    O melhor jeito de add nomes na lista seria assim:

        lista.add(new UsuarioDaLista("Rodrigo");
            ------------------------------------------------

     Para imprimir o nome voce tem que colocar a notação ponto e acessar a variavel nome da lista se nao
     o programa vai imprimir um numero ID (nesse exemplo), entao usando (cadaPosicao.nome) voce imprimi os nomes.

             for(UsuarioDaLista cadaPosicao : lista){
               System.out.println(cadaPosicao.nome);

      OU usar o metodo toString() em UsuarioDaLista, ai vc nao precisa da notação ponto mais.+

                  System.out.println(cadaPosicao)
 */
