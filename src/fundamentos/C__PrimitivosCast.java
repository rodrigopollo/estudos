package fundamentos;

public class C__PrimitivosCast {
    public static void main(String[] args) {

        double a = 1;
        System.out.println(a);

        float b = (float) 1.1234564862;
        System.out.println(b);

        int c = 5;
        /* Conversao errada --> --- byte d = c; --- o java nao vai fazer essa conversao
        de maneira implicita pois nao eh aceita, lembrando que o JAVA nao analisa o valor (5 no caso)
        e sim o TIPO...
        INT > BYTE, ou seja voce esta tentando colocar 1 geledadeira (tamanho do INT)
        em 1 gaveta (tamanho do byte), o java diz q nao cabe, mas se vc faz o cast e especifica q quer
        colocar 1 latinha (o valor 5 no caso) na gaveta ele diz q cabe.
        */
        byte d = (byte) c; // essa eh uma conversao EXPLICITA tbm chamada ""CAST""
        System.out.println(d);

        double e = 1;
        int f = (int) e; // voce esta dizendo, que E (double) passa a ser INT -- (int) e; --
        System.out.println(f);

        //   -------  Outra maneira de fazer cast EXPLICITO -------
        /* No exemplo abaixo voce pode ver que o cast tbm pode ser feito diretamente no cauculo do
        System.out...... Nao precisa ser sempre na atribuição do tipo primitivo como no exemplo acima.
         */
        int n1 = 5;
        int n2 = 9;
        System.out.println(n1 + (double) n2);//Essa conversao tbm transforma o resultado em DOUBLE.

        //todo================================================================================================

        
        /* --- NOTAS ---
         Numeros inteiros (sem casa decimal)

         byte < short < int < long

         Do menor para o maior....do byte para o long.
         1 long (maior capacidade) nao cabe em 1 byte (capacidade menor)
         mas 1 byte sim cabe em 1 long.

         Ou seja.... Os menores (ex byte) cabem em espaços maiores como short, int long.
         Mas um primitivo com maior capacidade (ex: int) nao cabe em primitivos de menor
         espaço como shor ou byte de maneira IMPLICITA, somente de maneira EXPLICITA
         e isso dependendo do valor pode gerar perda de informaçao.

         A conversao do menor (ex: byte) para o maior (ex: int) se chama --> Conversao IMPLICITA
         A conversao do maior (ex: int) para o menor (ex: byte) se chama --> Conversao EXPLICITA

         Conversao IMPLICITA = O java faz sozinho porque é uma conversao aceita
         Conversao EXPLICITA = Vc tem que fazer um cast para funcionar.
         */
    }
}
