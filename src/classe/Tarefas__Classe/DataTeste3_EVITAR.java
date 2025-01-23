package classe.Tarefas__Classe;

public class DataTeste3_EVITAR {
    public static void main(String[] args) {

        // * NOTA: Data4 e DataTeste4 sao a separacao entre MAIN, metodos e controres. (sao 1 so)
        // Variaveis --> essas variaveis seram usadas em todos os diferentes metodos abaixo.
//-------------------------------------------------------------------------------------------------

        //         ========= METODO 3 =========

        Data3_EVITAR data1 = new Data3_EVITAR();
        data1.dia = 31;
        data1.mes = 10;
        data1.ano = 2024;

        var data2 = new Data3_EVITAR();
        data2.dia = 8;
        data2.mes = 9;
        data2.ano = 1986;


        //         ========= METODO 3 =========
        //Se usaram as mesmas variaveis do METODO 1
        // Metodo 3 => Puxando "imprimirDataFormatada" do metodo feito em DATA
        //A data esta sendo apenas imprimida usando um metodo com VOID feito em DATA.
        System.out.print("===== Metodo 3 =====\n");
        data1.imprimirDataFormatada();
        data2.imprimirDataFormatada();
    }

}
