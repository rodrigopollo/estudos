package classe.Tarefas__Classe;

public class Data2 {

    // * NOTA: Data3 e DataTeste3 sao a separacao entre MAIN, metodos e controres. (sao 1 so)
    //Variaveis que serao usadas em todos os metodos deste programa.
//--------------------------------------------------------------------------------------------------------

    int dia ;
    int mes;
    int ano;

    // ========== METODO 2 ==========
    // Este eh um metodo mais seguro de usar pois ele retorna um valor que pode ser armazenado.
    // em uma variavel.
    String dataFormatada() {
        return String.format("Data formatada (Metodo 2): %d/%d/%d", dia, mes, ano);
    }

}
