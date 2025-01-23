package classe.Tarefas__Classe;

public class Data4 {

    // * NOTA: Data5 e DataTeste5 sao a separacao entre MAIN, metodos e controres. (sao 1 so)
    //Variaveis que serao usadas em todos os metodos deste programa.
//--------------------------------------------------------------------------------------------------------

    int dia;
    int mes;
    int ano;

    // ========== METODO 2 ==========
    // Este eh um metodo mais seguro de usar pois ele retorna um valor que pode ser armazenado.
    String dataFormatada () {

        return String.format("\nData formatada (Metodo 2): %d/%d/%d", dia, mes, ano);
    }

    // ========== METODO 4 ==========
    // Copia e imprime o Metodo 2 (dataFormatada)
    void copiarDataFormatada () {
        System.out.printf(dataFormatada());
    }
}
