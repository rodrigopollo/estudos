package duvidas_e_termos;

public class Termos_Metodo {

     /*
        Como Criar um metodo???
    => Indicador de acesso:  public static
    => Tipo de Retorno:  void (vazio/nada). pode ser int, String etc...
    => Nome do metodo:  main
    => Conjunto de parametros de entrada do metodo: (String[] args)

    PUBLIC:
           Quando o metodo eh PUBLIC significa que voce pode acessar esse metodo mesmo estando
           em outra classe.

   * NOTA.: Se o metodo MAIN for STATIC....os outros metodos tambem terao que ser STATIC.
   * NOTA2.: Quando o retorno nao for VOID, voce precisa obrigatoriamente ter o comando RETURN no metodo.
    */
//todo==============================================================================================
//todo==============================================================================================

    //     >>>>>>>>>>>>>>>>>> METODO MAIN <<<<<<<<<<<<<<<<<<<<

    public static void main(String[] args) {

        /* Voce esta dizendo EXECUTE MENSAGEM, o java vai buscar, oq eh MENSAGEM?
        Ele vai encontrar que MENSAGEM foi um metodo criado, e dentro deste metodo estao
        todos os comandos que seram executados ao chamar o metodo MENSAGEM como estamos
        fazendo aqui embaixo                                                             */

        // Metodo 1
        //Chamando o metodo para que possa ser visto mensagem();
        System.out.println("=============================");
        System.out.println(">>>>> Metodo 1 (void) <<<<<");
        mensagem();



        // Metodo 2
        //Chamando o metodo instrucao();  Vou dar exemplo de so 2x mas voce pode usar ele infinito.
        System.out.println("=============================");
        System.out.println(">>>>> Metodo 2 (String) <<<<<");
        instrucao("Aqui se digita o retorno(String) do metodo ---instruçao ---");
        instrucao("E pode usar o mesmo metodo quantas vezes voce quiser");



        // Metodo 3
        // Tem que inserir os valores de nota1 ate nota4, se nao ele da erro, pois as notas nao tem valor.
        System.out.println("=============================");
        System.out.println(">>>>> Metodo 3 (double Media) <<<<<");
        media(10, 7.5, 5.8, 8.4);



        // Metodo 4
        // Cria 1 variavel para armazenar o resultado do calculo do metodo (SOMA) -> valor1 + valor2.
        int resultadoReturn;
        resultadoReturn = soma(2, 2);

        System.out.println("\n=============================");
        System.out.println(">>>>> Metodo 4 (int Soma ) <<<<<");
        System.out.printf("Resultado Soma = %d\n", resultadoReturn);



        // Metodo 5
        // Aqui basta imprimir o metodo ja feito
        // Ao inserir os valores dos Parametros Variaves (infinito) ele ira executar o calculo dentro do
        // metodo soma2 e retorna o resultado dos valores aqui atribuidos no caso 5 + 5
        System.out.println("=============================");
        System.out.println(">>>>> Metodo 5 (int Soma2) <<<<<");
        System.out.print("Resultado Soma2 = " + soma2(5, 5));
        System.out.println("\n=============================");



    }
//todo==============================================================================================
//todo==============================================================================================

     /*    >>>>>>>>>>>>>>>>>> METODO 1 (MENSAGEM) <<<<<<<<<<<<<<<<<<<<

     => Indicador de acesso:  public static
     => Tipo de Retorno:  void (vazio/nada). pode ser int, String etc...
     => Nome do metodo:  mensagem
     => Conjunto de parametros de entrada do metodo: () neste caso esta vazio.
      */

    public static void mensagem() {

        /*Inserindo as instruçoes que seram mostrada quando o metodo MENSAGEM for chamado.
        ex Chamando o metodo mensagem:
            --> mensagem();
        */
        System.out.println("Testando o metodo MENSAGEM!");


    }
//todo==============================================================================================
//todo==============================================================================================

    //    >>>>>>>>>>>>>>>>>> METODO 2 (INSTRUCAO) <<<<<<<<<<<<<<<<<<<<

     /* => Indicador de acesso:  public static
        => Tipo de Retorno:  void (vazio/nada)
        => Nome do metodo:  instrucao
        => Parametros de entrada do metodo: (do tipo "String" com o nome "texto")

     Este metodo tem 1 parametro de entrada do tipo String que recebe a String que sera inserida
     quando chamar o metodo instrucao.
            Exemplo chamada do metodo:
                    intrucao("Aqui se digita o retorno(String) do metodo instruçao");
     * NOTA.: Quando voce colocar um paramentro de entrada do tipo String voce tem que dar um NOME,
     neste exemplo o nome eh TEXTO.
     */


    public static void instrucao(String texto) {

        //Voce vai mostrar o retorno do parametro inserido em instrucao, nesse caso do tipo String.
        System.out.println(texto);
    }

//todo==============================================================================================
//todo==============================================================================================

    /*    >>>>>>>>>>>>>>>>>> METODO 3 (MEDIA) <<<<<<<<<<<<<<<<<<<<

     => Indicador de acesso:  public static
     => Tipo de Retorno:  void (vazio/nada)
     => Nome do metodo:  media
     => Parametros de entrada do metodo: (do tipo "double")

     Este metodo tem 1 parametro de entrada do tipo double,os valores dos parametros (nota)
     deveram ser inseridos ao chamar o metodo MEDIA();
           Exemplo:
                 media(10, 7.5, 5.8, 8.4);
     */

    public static void media(double nota1, double nota2, double nota3, double nota4) {

        /* dentro do metodo voce vai inserir todas as variaveis e instrocoes, nesse caso da media
        as instruçoes sao CALCULOS.

          Voce ja esta deixando o calculo das 4 medias pre feito,.
        - Quando voce chamar o metodo MEDIA ele ira executar as instruçoes aqui dentro(no caso calculos).
        - Apos fazer o calculo ele vai imprimir o resultado(println).
         */
        double calculoMedia;
        calculoMedia = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("A media é = %.1f", calculoMedia);
    }

//todo==============================================================================================
//todo==============================================================================================

    /*    >>>>>>>>>>>>>>>>>> METODO 4 (SOMA) <<<<<<<<<<<<<<<<<<<<

     => Indicador de acesso:  public static
     => Tipo de Retorno:  INT
     => Nome do metodo:  soma
     => Parametros de entrada do metodo: (do tipo "int")

     Este metodo tem 1 parametro de entrada do tipo INT. Os valores dos parametros (valor)
     deveram ser inseridos ao chamar o metodo soma();
           Exemplo:
                 soma(2, 2);
     */

    public static int soma(int valor1, int valor2) {

        /* Esse metodo sera mais simples, ao chamalo, ele ira retornar apenas a SOMA dos VALORES dentro
        do laço (parametros de etrada) usando o comando ---RETURN---.

        - Voce ja esta deixando o calculo dos 2 valores pre feito, mas como o metodo so tem a instrucao
        ---RETURN---, voce tera que setar as variaveis na ---(MAIN)---.
        - Quando voce chamar o metodo SOMA ele ira executar as instruçoes aqui dentro no caso
        o calculo em RETURN.
         */

        // RETURN => Envia o valor da soma de valor1 + valor2 para onde o metodo SOMA for chamado.
        return valor1 + valor2;

    }

//todo==============================================================================================
//todo==============================================================================================

    /*    >>>>>>>>>>>>>>>>>> METODO 5 (SOMA 2) <<<<<<<<<<<<<<<<<<<<

     => Indicador de acesso:  public static
     => Tipo de Retorno:  INT
     => Nome do metodo:  soma 2
     => Parametros de entrada do metodo: (do tipo "int")

     Este metodo tem 1 parametro de entrada do tipo INT. O parametro de entrada se torna INFINITO
     ao usar --(int ... numeros)-- e por isso voce consegue usar comandos que normalmente se usam em arrays.
     O metodo sera chamado e imprimido.
           Exemplo:
                 System.out.println("Resultado: " +soma(2, 2));
     */

    public static int soma2(int... numeros) {

        /* Esse metodo usamos VARARGS (Parametros variaveis) ao usar ""..."" em paremetros de entrada.

        ===> Os Parametros variaveis sao parecidos com ARRAYs.

        - Inicia a variavel antes do FOR (se nao, nao funciona).
        - Com for-each vc diz, que (cadaPosicaoVarargs) do parametro (NUMERO) sera feito o comando abaixo.
        - na variavel somaVarargs voce vai armazenar a soma de todos os valores do metodo SOMA2
        - Quando voce chamar o metodo SOMA ele ira executar as instruçoes aqui dentro(no caso calculo).
         */

        int somaVarargs = 0;
        for (int cadaPosicaoVarargs : numeros) {
            somaVarargs = somaVarargs + cadaPosicaoVarargs;
        }
        // Retorna o valor da variavel somaVarargs qndo voce chamar o metodo SOMA 2
        return somaVarargs;

    }


}

