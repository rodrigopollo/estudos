package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set_Comportado {
    public static void main(String[] args) {

        SortedSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Rodrigo");

        for (String cadaPosicao : listaAprovados) {
            System.out.println(cadaPosicao);
        }

        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        
        for (int cadaPosicao : numeros) {
            System.out.println(cadaPosicao);
        }
    }
}
