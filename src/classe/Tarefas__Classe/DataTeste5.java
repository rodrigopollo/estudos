package classe.Tarefas__Classe;

public class DataTeste5 {
    public static void main(String[] args) {

        // * NOTA: Data6 e DataTeste6 sao a separacao entre MAIN, metodos e controres. (sao 1 so)
        // Variaveis --> essas variaveis seram usadas em todos os diferentes metodos abaixo.
//-------------------------------------------------------------------------------------------------

        //         ========= METODO 4 =========

        Data5 data1 = new Data5(31, 10, 2024);

        var data2 = new Data5();
//        data2.dia = 8;
//        data2.mes = 9;
//        data2.ano = 1986;

        // ========== CONSTRUTOR 1 ==========
        // Os parametros de entrada colocados no contrutor estao atribuidos a dia, mes e ano(classe DATA6).
        // Sendo assim, para imprimir nao chamamos diaConstrutor e sim DIA pois dia = diaConstrutor.
        System.out.print("===== Metodo 4 =====\n");
        System.out.printf("Data formatada (Construtir 1): %d/%d/%d", data1.dia, data1.mes, data1.ano);

        // ========== CONSTRUTOR 2: Padrao ==========
        // Os valores setados ao criar o construtor em Data6 foram alterados quando criamos o NEW
        // e inserimos novos valores para dia, mes e ano. Como sao novos valores, seram esses os imprimidos.
        System.out.printf("\nData formatada (Construtir 1): %d/%d/%d", data2.dia, data2.mes, data2.ano);


    }
}
