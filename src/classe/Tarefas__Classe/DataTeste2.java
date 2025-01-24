package classe.Tarefas__Classe;

public class DataTeste2 {
    public static void main(String[] args) {

        // * NOTA: Data3 e DataTeste3 sao a separacao entre MAIN, metodos e controres. (sao 1 so)
        // Variaveis --> essas variaveis seram usadas em todos os diferentes metodos abaixo.
//-------------------------------------------------------------------------------------------------

        //         ========= METODO 2 =========

        Data2 data1 = new Data2();
        data1.dia = 31;
        data1.mes = 10;
        data1.ano = 2024;

        var data2 = new Data2();
        data2.dia = 8;
        data2.mes = 9;
        data2.ano = 1986;

        // Metodo 2 => Puxando "dataFormatada" do metodo feito em DATA3
        // A foi Data formatada usando return e String.format
        System.out.print("===== Metodo 2 =====\n");
        System.out.println(data1.dataFormatada());
        System.out.println(data2.dataFormatada());


        //Aqui armazenamos o retorno do metodo em uma variavel que podemos usar quando quizer.
        // Vale lembrar que o retorno do meto eh do tipo STRING, ou seja a variavel tbm devera
        // ser do tipo STRING.
        String retornoDataFormatada = data1.dataFormatada();
        System.out.println("\nChamando Variavel - " + retornoDataFormatada);
    }

}
