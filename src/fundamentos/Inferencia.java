package fundamentos;

public class Inferencia {
    //Lembrando**
    //--- main --- eh um METODO
    public static void main(String[] args) {

        //voce diz que o valor de -- A -- eh de 4.5 do tipo double
        //
        double a = 4.5;
        System.out.println(a);

        /* O java nao permiti isso --- a = "aaaaaa"; --- . Pq??? Pq a variavel "a" ja esta sendo usado ali
        encima como numerico do TIPO double. Ou seja, numero = numero e texto = texto

        nota --> Voce pode colocar numeros dentro do texto sempre que esteja entre "" (ex: "4.5")
        por estar dentro de aspas o numero ("4.5") eh uma STRING!!!
        No ex abaixo o JAVA esta INFERINDO a "var b" como do tipo numerico double por ter fração
         */
        var b = 4.5;
        System.out.println(b);

        //Exemplo de que numeros podem estar dentro do tipo texto sempre q esteja entre ""
        //
        var c = "Texto 01";
        System.out.println(c);

        c = "Outro texto 02";
        System.out.println(c);

        //Aqui tbm esta errado, a "var c" esta como tipo texto acima, n pode ser numero
        //c = 4.5;

        double d;   //variavel foi declada
        d = 123.65;  //variavel foi inicializada, foi atribuido o seu valor.
        System.out.println(d);  //usada!





    }
}
