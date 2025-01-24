package classe.Tarefas__Classe;

public class DataTeste1 {
    public static void main(String[] args) {

        // * NOTA: Data2 e DataTeste2 sao a separacao entre MAIN, metodos e controres. (sao 1 so)
        // Variaveis --> essas variaveis seram usadas em todos os diferentes metodos abaixo.
//-------------------------------------------------------------------------------------------------

        //         ========= METODO 1: Construtor Padrao =========

        Data1 data1 = new Data1();
        data1.dia = 8;
        data1.mes = 9;
        data1.ano = 1986;

        // Imprimi data formatada de DATA1
        System.out.println("===== Metodo 1 =====\n");
        System.out.printf("Eu nasci em %d/%d/%d", data1.dia, data1.mes, data1.ano);


        var data2 = new Data1();
        data2.dia = 1;
        data2.mes = 1;
        data2.ano = 1970;

        // Imprimi data formatada de DATA2
        System.out.printf("\nHoje é dia %d/%d/%d\n", data2.dia, data2.mes, data2.ano);


    }
}
