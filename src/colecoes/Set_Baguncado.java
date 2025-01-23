package colecoes;

import java.util.HashSet;
import java.util.Set;

public class Set_Baguncado {

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void main(String[] args) {


        HashSet conjunto = new HashSet();

        //Faz a conversao para classe Wrapper Implicitamente
        conjunto.add(1);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(2);
        conjunto.add('x');

        // Verifica o tamanho da collection especifica, nesse caso CONJUTNO
        System.out.println("O tamanho eh = " + conjunto.size());

        //Adicionando elementos no CONJUNTO, lembando que SET nao aceita valores iguais duplicados.
        conjunto.add("rodrigo");
        conjunto.add(true);  // nao sera adicionado, pois SET ja contem esse item (linha 13)
        conjunto.add('b');
        System.out.println("Tamanho depois de ADD eh = " + conjunto.size());

        //Removendo elementos especificos do conjunto.
        conjunto.remove("rodrigo");
        conjunto.remove('b');
        System.out.println("Tamanho depois de REMOVE eh = " + conjunto.size());


        //uma maneira melhor de remover eh imprimindo para verificar se o elemento foi
        // ou nao removido corretamente
        System.out.println(conjunto.remove("teste"));   //n exite test com t, sera removido? FALSE
        System.out.println(conjunto.remove("Teste"));   //s exite Test com T, sera removido? TRUE
        System.out.println("Tamanho depois de REMOVE 2.0 eh = " + conjunto.size());


        //Verificando se a lista contain um elemento especifico.
        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains("rodrigo"));
        System.out.println(conjunto.contains("Teste"));
        System.out.println(conjunto.contains(1));


        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println("NUMS = " + nums);
        System.out.println("CONJUNTO = " + conjunto);

//      Este comando faz com um copia e cola... ou seja, voce apaga td de CONJUNTO e coloca tudo de NUMS
//      dentro de conjunto fazendo com que o conteudo dos 2 sejam completamente iguais.

//        conjunto.addAll(nums);


        //Aqui vc esta dizendo o seguinte:
        // Compare o conteudo de NUMS e CONJUNTO, e me diga quais os items IGUAIS entre eles. no Caso 1 e 2
        conjunto.retainAll(nums);
        System.out.println("Os itens iguais entre NUMS e CONJUNTO sao " + conjunto);

        //limpando lista o resultado sera sempre vazio.
        conjunto.clear();
        System.out.println(conjunto);





    }
}
