package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class AL_Queue {
    public static void main(String[] args) {
    
    /*  A diferença entre ADD e OFFER eh quando a fila esta cheia
    ADD = Caso vc queira adicionar algo que ja nao cabe na fila ele gera um erro (exceção)
    
    OFFER = Quando voce tem filas que tem uma restrição de tamanho (ex: max 100). Quando a fila chega[
    no tamanho maximo (ex: 100) ele nao vai deixar mais nenhum elemento ser adiciona enquanto nao for
    tirado algum outro da fila primeiro.
    
    ADD  ==>  lança uma exceção caso a fila esteja cheia
    OFFER  ==>  retorna FALSE caso a fila esteja cheia
    */
        
        Queue<String> fila = new LinkedList<>();
        fila.add("Ana");
        fila.offer("Bia");
        
        fila.add("Carlos");
        fila.offer("Daniel");
        
        fila.add("Rafaela");
        fila.offer("Rodrigo");
        
        // Para pegar elementos da QUEUE sem remover nada, existem 2 metodos
        // 1º) fila.peek
        System.out.println(fila.peek());
        // 2º) fila.element
        System.out.println(fila.element());
        
        
        System.out.println(fila.poll()); //Mostra o elemento e remove (Ex: Imprimi Ana e elimina da QUEUE)
        System.out.println(fila.poll()); //Mostra o elemento e remove (Ex: Imprimi Bia e elimina da QUEUE)
        System.out.println(fila.poll()); //Mostra o elemento e remove (Ex: Imprimi Carlos e elimina da QUEUE)
        
        System.out.println(fila.peek()); // Ana, Bia, Carlos nao estao mais na QUEUE, mostra Daniel
        System.out.println(fila.element());  //Daniel denovo
        System.out.println(fila.element());  //Daniel denovo
       
        
        /*
        PEEL => Mostra o proximo elemento e nao remove. Com a QUEUE vazia ele retorna o valor -- NULL --
        ELEMENT => Mostra o proximo elemento e nao remove. Gera um exceção (ERRO) se QUEUE estiver vazia
        
        POLL => Chama o proximo elemento e REMOVE. Com a QUEUE vazia ele retorna o valor -- NULL --
        REMOVE => Gera um exceção (ERRO) se QUEUE estiver vazia
        
        ------------------------------------------
        Outros metodos:
        fila.size()
        fila.clear()
        fila.isEmpty()
         */
        
        
        
    }
    
}
