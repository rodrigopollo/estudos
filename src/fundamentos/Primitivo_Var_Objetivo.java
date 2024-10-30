package fundamentos;

public class Primitivo_Var_Objetivo {
    public static void main(String[] args) {


        /* Todos os ex abaixo seram sobre o seguitne -->  Sring s = "texto de exemplo"
          ---> String eh uma clase !!!! assim como PrimitivoVsObjeto.

          No momento em que se cria uma classe, nos dizemos que o valor criado ("texto de exemplo")
          eh um OBJETO atribuido nesse caso a variavel --- "s" ---
          Esse objeto tem atributos e comportamentos quando voce coloca a anotação "" . "" somente
          disponivel para STRING e nao para primitivos (INT, SHORT etc..)

          Ex 1:
                s.toUpperCase();  -->  o comportamento eh transformar td em maiuscula
                String s = "texto de exemplo";  -->  String s = "TEXTO DE EXEMPLO";

//========================================================================================================
          Ex 2:
                 String  -->  classe tipo String
                 s  -->  local/nome da variavel que sera atribuido o objeto
                 "texto de exemplo"  -->   objeto do tipo String
         */
        String s = "texto de exemplo";
        s.toUpperCase();
        System.out.println(s.toUpperCase());

        int a = 3; // o valor literal 3 esta atribuido a "VARIAVEL A" do tipo Primitivo INT
        int b = a; // a "VARIAVEL B" recebe o valor da "VARIAVEL A" do tipo Primitivo INT
        int c = a + b; // a "variavel C" recebe o valor da expressao "a + b",
        System.out.println(c); // imprimi o resultado da soma de A+B armazenado em C

        // int, double, float etc... --> Primitivo
        // Wrapper sao a versao de objetos dos tipo PRIMITIVOS
        int x = 123;
        System.out.println(x);


    }
}
