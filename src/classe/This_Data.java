package classe;

public class This_Data {

    int dia;
    int mes;
    int ano;
    // ========== CONSTRUTOR 1 ==========
    // Esse construtor tem 3 paramestro de entrada do tipo INT que deveram ser preenchidos quando o
    // contrutor for chamada com o NEW.

    // Aqui eu entendo o motivo... O atributo dia (linha 5) e a variavel dia do contrutor (linha 13)
    // tem o mesmo nome voce precisa diferenciar ou realmente nao tem sentido e tbm dara erro. THIS = OK!!!!
    This_Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    // ========== CONSTRUTOR 2: Padrao ==========
    // Como criamos um construor explicoto com P.E (parametros de entrada) o construtor implicito (o Padrao)
    // desapareceu e ja nao pode ser usado, sendo assim, iremos criar novamente o construtor Padrao
    // para poder usarlo.
    // Aqui por exemplo... SAO 2 contrutores COMPLETAMENTE diferentes, entao eu pensei, nao tenho que usar
    // THIS ja que por ser construtores diferentes eh obvio a diferenciação entre os 2 contrutores.
    // Tem que usar this???? eu acho que nao, mas nao tenho certeza como disse...

    This_Data() {
        dia = 1;  //Vai this? oq ele faz?
        mes = 1;  //Vai this? oq ele faz?
        ano = 1970;  //Vai this? oq ele faz?
    }
        // Metodo 1
        String obterDataFormatada() {
            return String.format("%d/%d/%d", dia, mes, ano);  //Vai this? oq ele faz?
        }
        // Metodo 2
        void imprimirDataFormatada() {
            System.out.println(obterDataFormatada()); //Vai this? oq ele faz?
        }


}
