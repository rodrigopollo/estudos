package fundamentos;

    public class C__NumberToString {
        public static void main(String[] args) {
            // -----  EXEMPLO 1 -----

            // Usamos a classe Integer (Wrapper) do primitivo INT
            Integer num1 = 10000;
            System.out.println((num1.toString().length())); //Transforma o valor numerico "10000" em STRING
            
            // ** NOTA: Vale resaltar que apos converter de INTERGER para PRIMITIVO INT, a notação ponto
            // deixa de funcionar ja que ela nao esta disponivel para os PRIMITIVOS.
            

            // -----  EXEMPLO 2 -----

            //* Tbm eh possivel transformar para ""STRING"" um valor do tipo ""PRIMITIVO"" basta transformar
            // o tipo primitivo em uma classe Wrapper, como no exemplo abaixo.
            int num2 = 100000;
            System.out.println(Integer.toString(num2).length());

            /* --------     Repare na diferença entre os 2 exemplos.----------

            No exemplo 1
            -->  Voce tem a  num1 atribuida a classe wrapper Integer
            e usa o num1 pra transformar o valor da classe Integer no tipo String.

            No exemplo 2:
            -->   O num2 é do tipo primitivo INT pra transformar o tipo primitivo em STRING
            voce precisa primeiro um CAST:
            - Primitivo INT -> (CAST) Tipo Classe Wrapper Integer
            So depois disso voce pode transformar em string.
            resultado :
                        System.out.println(Integer.toString(num2));
             */

            /* NOTA.:
            A conversao do exemplo 2
            --> System.out.println(Integer.toString(num2).length());
            pode ser feita nao so com Integer (int) como com todos os outros Wrappers:
             -  byte, short, long, float e char
             */







        }
}
