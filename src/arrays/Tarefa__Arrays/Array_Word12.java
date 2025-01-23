package arrays.Tarefa__Arrays;

public class Array_Word12 {
    public static void main(String[] args) {

        String[] word1 = {"a", "c", "e", "g", "1", "2"};
        String[] word2 = {"b", "d", "f", "h"};

        for (int posicao = 0; posicao <= 7; posicao += 1) {

            if (posicao < word1.length) {
                System.out.print(word1[posicao]);

            }
            if (posicao < word2.length) {
                System.out.print(word2[posicao]);
            }
        }
    }
}