package duvidas_e_termos;

public class Termos {
    public static void main(String[] args) {

        /*
        Whrapper eh a versao OBJETO dos tipos primitivos.
        Quase tudo em JAVA que nao sao pRIMITIVOS sao OBJETOS.
         */
        
        /*
  -->   Statements = comandos ou instruçoes
  -->   While = enquanto. Enquanto (...) a condição nao se cumprir continue executando.
        no exemplo vemos que ate que o usuario insita que o valor a = 1 o while continua executando infinito.
        Exemplo:
                --> int a = 0;
                --> while (enquanto) (a < 1) (faça)

  -->   swith = quando, quando NOTA for 7 faça...
  -->   escopo = bloco

todo==============================================================================================
todo==============================================================================================

           --------------------- Clase ---------------------

  -->   classe = eh um agrupador de atributos e comportamentos
  -->   objetivo = instancia

  -->   **** Toda variavel, constante e metodos por padrao
  perternce a uma -- OBJETO --.
        ****Adicionando a palavra (STATIC) voce tem pode fazer
  eles (variavel, constante e metodos) perterncerem a uma (CLASE)

  System.out.println()

  -->  System = classe
  -->  .out = atributo
  -->  .println() = metodo.
  
  -->   String eh uma CLASSE.
  -->   Dentro dos WHRAPERS tbm temos classes como byte, short, interger, Long
  
  

todo==============================================================================================
todo==============================================================================================

           --------------------- Metodo ---------------------

  int nomeMetodo (inta a, int b) {}
  return

  ==>  int = eh o retorno do metodo, o tipo do retorno que voce quer pode ser varios tipos,
  nesse caso o tipo eh (INT), mas poderia ser String, double, byte etc.....Tbm poderia nao ter
  nada, que seria um metodo que NAO RETORNA NADA. ""ex: void nomeMetodo () {}""
  ==>  nomeMetodo () {} = os nomes de metodos começam com letra minuscula e a proxima
  palavra com letra maiuscula nome(primeira palavra) Metodo(segunda palavra).
  ==>   () = defini as -- (ENTRADAS DE PARAMETROS) --  que sao passados para o metodo,
   nesse caso foi (int a, int b "linha 38") mas pode estar vazio.
  ==>   {} = este sera o escopo do metodo (o corpo, o bloco) aonde vai ter os algoritimos
  que vai executar a função desse metodo.
  ==>   return = voce tem que retornar algo dos parametros que voce inserir entre os ()


  -->   Vode pode ter mais de 1 metodo dentro de uma classe desde que a ASSINATURA nao
  seja completamente identica, ou seja, nome, tipo e quantidade de parametros iguais


  A assinatura(identidade) do metodo da linha 41 eh a seguinte = ""nomeMetodo ()""

  *NOTA.: Ter mais de um metodo dentro de uma classe tem o nome de ""Method Overloading""
  *NOTA2.: metodos tem entrada de paramentros, exemplo => "".println()"" isso eh 1 metedo

todo==============================================================================================
todo==============================================================================================

           --------------------- Construtor ---------------------

  -->  Um construtor pode ser padrao ou nao, um construtor sem nenhum parametro de entrada
  (explicação linha 46) eh um construtor padrao....Exemplo de construtor padrao:
         => Produto p1 = new Produto() {}

  -->  Produto (o primeiro) = Classe
  -->  p1 = nome do objeto
  -->  new Produto = voce esta criando uma instancia.
  -->  Produto() (o ultimo) = o construtor (que vai ter o mesmo nome da classe)
  -->  () = parametros de entrada.

  *NOTA.: Construtores nao tem um retorno (linha 41 explicado), metodos SIM.
             Outra coisa eh que o construtor tem o mesmo nome da classe como vc ve na linha 66.

   *NOTA 2.: Vale resaoltar que:
             -->  p1 = é a instância (o objeto real) da classe Produto
             -->  new Produto = o construtor é chamado para criar e configurar o objeto da classe Produto.

     * Quando voce quer usar os atributos variaveis que voce tem na classe Produto (linha 70), voce
      precisa usar a instascia (p1 nesse caso) e depois dizer o atributo variavel que voce quer usar.
        Exemplo explicativo:

             p1.preco -> Voce diz, a instancia P1 vai usar ---PRECO--- da classe PRODUTO

     **** OBSERVAÇÃO!!!
                    -->  Sem voce criar um construtor padrao (ex: Produto (){}) o java tem ele ja tem
                    ele criado implicitamente, entao voce pode usar o construtor igualmente.


todo==============================================================================================
todo==============================================================================================

           --------------------- Instancia / Objeto ---------------------

  -->  O plano no papel de 1 casa eh a CLASSE, a casa construida a partir desse plano eh a INSTANCIA.
   * class Casa {
   *    Casa minhaCasa = new Casa();
   * }

   ==> Casa minhaCasa = new Casa(); = aqui vc esta criando uma INSTANCIA, ou seja construindo a minhaCasa.

  *NOTA.: Vale resaoltar que:
   -->  Casa = classe Casa. É o molde (o plano da casa).
   -->  minhaCasa = eh o objeto da classe Casa.
   -->  new Casa = EH UMA NOVA INSTANCIA, nesse caso um Objeto da clase (CASA).
   -->  Casa() = o construtor.


todo==============================================================================================
todo==============================================================================================

            --------------------- Atributos e Variaveis ---------------------

 ººº Variavel dentro do METODO:
     -  As variaveis criados dentro do metodo se chamam VARIAVEL LOCAL, esse tipo de variavel so pode
     ser acessada e usada dentro do escopo do proprio metodo.
 ººº Varivel fora do METODO e dentro de CLASSE:
     -  Pode ser variavel de instancia ou se voce colocar STATIC uma variavel de classe (static String nome;)

    Exemplo:

    class Carro {
-->-->  Atributos (ou variáveis de instância)  <--<--<--
        String modelo;
        int ano;

        // Metodo
        public void mostrarInformacoes() {
-->-->-->   Variável local   <--<--<--
            String informacao = "Modelo: " + modelo + ", Ano: " + ano;
            System.out.println(informacao);

    -->  --modelo-- e --ano-- são atributos da classe --Carro-- porque foram declarados dentro
    da classe, mas fora de um metodo.
    Esses atributos representam o estado de um objeto Carro específico.

ººº  Variável: Termo para qualquer nome q armazena um valor. Aqui é INFORMAÇÂO do tipo String.
ººº  Atributo: Um tipo de variável específica que pertence a uma classe e descreve as
características de um objeto daquela classe.

todo==============================================================================================
todo==============================================================================================

            --------------------- Array ---------------------

    O array eh um objeto entao ele tem caracteristicas e comportamentos.
        ==>  int[] a = new int[6];

     -> int[] = voce define o tipo (int) e declara que sera um Array ao usar [].
     -> a = nome do array do tipo int
     -> new int = cria a instancia do array
     -> [6] =  o valor dentro de [] determina o numero de posiçoes que tera o Array.

     ººº NOTA.: Array pode ter infinitas posiçoes dentro dele e sempre começa com 0.
     Ou seja.... se um array tem [6] posiçoes, sera = 0, 1, 2, 3, 4, 5.

     ººº NOTA2.: Todos os dados dentro do Array serao sempre do mesmo tipo, ou seja,
     se voce criar 1 array STRING, todos os dados desse array seram do tipo STRING.
     Isso vale para todos os tipos, int, double, char, boolean etc...
                        -----------------------------------
        ==> int[] numero = new int[6];
            a[2] = 10;

     -> numero = Usando o nome da instancia array criada voce esta acessando o array e dizendo...
     -> [0] = posição do Array numero 1 (lembrando array começa com 0.... 0 = posição 1)
     -> 10 = valor atribuido a posição 1 do array.
     ººº voce esta acecessando o array da posição 1 e dizendo que agora a posiçao 1 tera o
     valor 10.

                        -----------------------------------
todo>>>>>>>    FORMAS DE LER UM ARRAY

     Imprimir uma posicao especifica do array
            ==> System.out.println(a[5]);

     Imprimir a ultima posicao do array
            ==> System.out.println(numero[numero.lenght - 1]);

                        -----------------------------------

     Para imprimir a Array completa o metodo acima nao serve!
     Voce tera que fazer o seguinte.... Usando o metodo ARRAYS.

            ==> int[] idadePessoa = new int[3];
           idadePessoa[0] = 5;
           idadePessoa[1] = 10;
           idadePessoa[2] = 15;
           System.out.println(Arrays.toString(idadePessoa));

ººº -> Arrays.toString = usando o metodo Arrays, voce transforma o conteudo do array em String
    -> (idadePessoa) = Voce tem que falar pro java, oq vc quer transformar em string? IDADEPESSOA
    e valor imprimido sera =   [5, 10, 15]

                        -----------------------------------

todo>>>>>>>    FORMAS DE INICIAR E PERCORRER UM ARRAY

         1º) int somaCadaPosicao = 0;
            for(posicao = 0; posicao < idadePessoa.lenght; posicao +=1) {
            somaCadaPosicao += idadePessoa [posicao];

            System.out.println(somaCadaPosicao / idadePessoa.lenght);

ººº  --> idadePessoa.lenght = ele detecta automaticamente o numero de posicoes que tem o Array
     Neste exemplo em especifico colocamos 3 posicoes certo? (5, 10, 15) entao..

     somaCadaPosicao / idadePessoa.lenght (eh igual dizer divido por 3 pq temos 3 posicoes Array)

                //////////////////////////////////////////////
todo
        int[] idadePessoa2 = { 30, 40, 50};

        2º) int somaCadaPosicao = 0;
            for(posicao = 0; posicao < idadePessoa2.lenght; posicao +=1) {
            somaCadaPosicao += idadePessoa2 [posicao];

            System.out.println(somaCadaPosicao / idadePessoa2.lenght);

                        -----------------------------------

     Existem diferentes formas de setar a quantidade e valores as posiçoes Arrays.

     1º) a[2] = 10;
     2º) int[] idadePessoa = { 30, 40, 50};   -->  Vc cria 1 array e seta valores ao msmo tempo.
     3º) int idadeArmazenada = 10;
         int[] idadePessoa = { 30, idadeArmazenada, 50};


todo==============================================================================================
todo==============================================================================================

 -->  Math.max(a, Math.max(b, c) = Exibe o maior valor entre os numeros inseridos.
    Exemplo:
     - Comparador comparador = new Comparador();
     - int maiorValor = comparador.maximo(5, 10, 3);   .... Vai exibir o numero 10.
     
 -->  double fatorInjecao = 1;
 -->  (int) Math.round(fatorInjecao * 3000) = Arredonda o resultado e transforma em INT
 
 


todo==============================================================================================
todo==============================================================================================

            --------------------- Collections ---------------------

   >> NAO SUPORTA TIPO PRIMITIVO <<<
   Estruturas de dados do collection. O java converte por exemplo 1 int para a classe Interger implicitamente.

ººº SET  => Eh um conjunto
         => Nao ordenado (por padrao). Pode ser ordenado ou nao.
         => Nao indexado, ou seja, nao tem como acessar a partir do SET um indice especifico (Ex: indice 3)
         => Nao aceita repetição, ou seja, nao aceita o valor duplicado, se colocar ele so vai ignorar
         => O idela eh trabalhar de forma homogena, ou seja, cada set para 1 coisa so,(EX empresa, fornecedor)
         =>

ººº LIST => Indexada, eh mais parecido com Array, vc consegue acessar o index que quiser
         => Aceita repetição, vc pode colocar dados repetidos que ele aceita

ººº MAP  => Chave/Valor, (ex: CPF, nome), eh como se fossem 2 colunas
         => Na CHAVE nao aceita repetição, eh mais parecido com o SET
         => O VALOR sim aceita repetição oq seria mais parecido como LIST
         => Eh como se fosse uma mistura de SET/List

ººº QUEUE  => Implementa uma fila.
           => First in/First out (FIFO) primeiro em entrar eh o primeiro a sair eh a logica da QUEUE

ººº STACK  => Implementa uma pilha (stack)
           => Last in/First out (LIFO), EX: uma pilha de livros, o ultimo livro colocado sera o primeiro tirado
                        -----------------------------------
                Funçoes do collections:

    --> Add = adiciona um elemento.
    --> size() = para saber o tamanho da collection (exemplo tamanho do SET)
    --> remove = mostra (imprimi) e remove um conjunto do collecion
    --> contains = verifica se um elemento esta ou nao dentro do conjunto de collecion
    --> retainAll = Verfica 2 listas e mantem apenas os itens que sao iguais das 2 listas.
    --> addAll = basicamente junta o conteudo das 2 listas em 1 lista so.
    --> clear = limpa lista.
    --> isEmpty = para saber se a QUEUE esta ou nao vazia.
    
         Funçoes exclusivas
    
ººº QUEUE:   Com a fila cheia
      --> OFFER =  Retorna FALSE quando fila esta cheia.
          Exemplo : voce tem filas que tem uma restrição de tamanho max 100.
          Quando a fila chega  no tamanho maximo (ex: 100) ele nao vai deixar mais nenhum elemento ser
          adiciona enquanto nao for tirado algum outro da fila primeiro
          
          >>>>>>>>>>   COM A FILA VAZIA   <<<<<<<
       
      --> PEEK = Mostra o um elemento da QUEUE sem remover nada e retorna o Valor NULL com a fila vazia.
      --> ELEMENT = Mostra o um elemento da QUEUE sem remover nada e retorna uma EXCEÇÂO(ERROR) com a fila vazia.
      --> POLL = Mostra o proximo elemento da QUEUE e remove. Retorna o Valor NULL com a fila vazia.
      
ººº NOTA.: ADD =  NAO EH EXCLUSIVO mas funciona de maneira diferente na QUEUE.
           Com a QUEUE cheia ele retorna uma exceção (erro)
ººº NOTA2.: REMOVE =  NAO EH EXCLUSIVO mas funciona de maneira diferente na QUEUE.
           Com a QUEUE vazia ele retorna uma exceção (erro)
       
        
        

todo==============================================================================================
todo==============================================================================================
//ddd

todo==============================================================================================
todo==============================================================================================




        >>>>>>>> classe  <<<<<<<<<<

Abstração de um objeto
molde de um objeto, existe ou nao no mundo fisico

--> Classe Carro
modelo
roda
motor
portas
cor

 >>>>>>>> instancia <<<<<<<<<<<<

a implementação de uma classe
uma construção a partir de um molde

modelo : Corsa
roda: 15 metal
motor: 1.6 flex
portas: 4 portas
cor: prata

        >>>>>>>  metodos <<<<<<<<

trancaPortas()
acelera()
freia()


         */


    }
}
