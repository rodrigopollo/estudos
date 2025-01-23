package classe;

public class This_DataTest {
    public static void main(String[] args) {


        This_Data data1 = new This_Data(31, 10, 2024);

        var data2 = new This_Data();
        data2.ano = 1986;

        String dataFormatada1 = data1.obterDataFormatada();
        System.out.println(dataFormatada1);
        System.out.println(data2.obterDataFormatada());

        data1.imprimirDataFormatada();
        data2.imprimirDataFormatada();

    }// Tenho que usar THIS aqui em algum lugar????? Sinceramente nao tenho nem ideia.
    // Si eu tivesse que responder em uma prova diria que NAO, mas como falei, to meio perdido.
}
