package classe.Tarefas__Classe;

public class Data5 {

    // * NOTA: Data6 e DataTeste6 sao a separacao entre MAIN, metodos e controres. (sao 1 so)
    //Variaveis que serao usadas em todos os metodos deste programa.
//--------------------------------------------------------------------------------------------------------

    int dia;
    int mes;
    int ano;

    // ========== CONSTRUTOR 1 ==========
    // Esse construtor tem 3 paramestro de entrada do tipo INT que deveram ser preenchidos quando o
    // contrutor for chamada com o NEW.
    Data5(int diaConstrutor1, int mesContrutor1, int anoConstrutor1) {
        dia = diaConstrutor1;
        mes = mesContrutor1;
        ano = anoConstrutor1;
    }
    // ========== CONSTRUTOR 2: Padrao ==========
    // Como criamos um construor explicoto com P.E (parametros de entrada) o construtor implicito (o Padrao)
    // desapareceu e ja nao pode ser usado, sendo assim, iremos criar novamente o construtor Padrao
    // para poder usarlo.

    Data5(){
       dia = 1;
       mes = 1;
       ano = 1500;

    }
    /*
    Voce tem 2 opçoes:
     1) Setar os valores de dia, mes e ano aqui no construor como mostro ali encima. (linha27 ate 29)
     2) Inserir os valores na instancia criada em DataTest6.

     ººº NOTA.: Como voce pode ver aqui a data eh 1/1/1500, mas o resultado de impressao eh 8/9/1986, PORQUE?
     Porque apesar de estar setado os valores aqui no construtor, voce esta CHAMANDO o construor em DataTest6
     e ALTERANDO esses valores logo enseguida, sendo assim, os novos valores sao os que seram imprimidos.

     Voce tbm tem a opçao de alterar somente 1 dos valores.
     Exemplo:
            Por padrao o valores setado é 1/1/1500
            se quando vc chamar o construtor voce quiser alterar somente o ANO e nao mecher em dia e mes.
            voce pode fazer isso, vc nao necessariamente precisa alterar todos os 3 valores.
     */
}
