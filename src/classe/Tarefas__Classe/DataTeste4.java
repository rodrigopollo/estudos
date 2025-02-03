package classe.Tarefas__Classe;

public class DataTeste4 {
    public static void main(String[] args) {

        // * NOTA: Data5 e DataTeste5 sao a separacao entre MAIN, metodos e controres. (sao 1 so)
        // Variaveis --> essas variaveis seram usadas em todos os diferentes metodos abaixo.
//-------------------------------------------------------------------------------------------------

        //         ========= METODO 4 =========

        Data4 data1 = new Data4();
        data1.dia = 31;
        data1.mes = 10;
        data1.ano = 2024;

        var data2 = new Data4();
        data2.dia = 8;
        data2.mes = 9;
        data2.ano = 1986;


        // Este metodo eh uma atribuição, ele esta copiando e imprimindo o METODO 2(dataFormatada)
        // que retorna uma String de data formatada.

        System.out.print("===== Metodo 4 =====\n");
        data1.copiarDataFormatada();
        data2.copiarDataFormatada();
    }

}
