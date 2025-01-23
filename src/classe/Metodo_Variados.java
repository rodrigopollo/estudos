package classe;

public class Metodo_Variados {
    public static void main(String[] args) {

        // Diferentes tipos de metos e usos, de maneira simples com varios exemplos.

        mensagem();
        instrucao("METODO 2 - O texto deve ser escrito a mao quando chamar o metodo");
        media(5.0, 5.0, 8.3);

        int resultado = soma(5, 5, 8);
        System.out.println("\nMETODO 4 - A soma é igual a = " + resultado);

        System.out.println("METODO 5 - A soma2 é igual a = " + soma2(10, 5, 4));

        System.out.println("METODO 6 - A soma3 é igual a = " + soma3(15, 15, 2));

        System.out.println(mensagemDeBoasVindas("Rodrigo"));
    }

//todo==============================================================================================
//todo==============================================================================================

    //    >>>>>>>>>>>>>>>>>> METODO 1 (MENSAGEM) <<<<<<<<<<<<<<<<<<<<

    public static void mensagem() {

        System.out.println("\nMETODO 1 - A mensagem que ira aparecer quando chamar o metodo");

    }
//todo==============================================================================================
//todo==============================================================================================

    //    >>>>>>>>>>>>>>>>>> METODO 2 (INSTRUCAO) <<<<<<<<<<<<<<<<<<<<

    public static void instrucao(String escreverTexto) {

        System.out.println(escreverTexto);
    }

//todo==============================================================================================
//todo==============================================================================================

    //    >>>>>>>>>>>>>>>>>> METODO 3 (MEDIA) <<<<<<<<<<<<<<<<<<<<

    public static void media(double nota1, double nota2, double nota3) {

        double calculoMedia;
        calculoMedia = (nota1 + nota2 + nota3) / 3;
        System.out.printf("METODO 3 - A media é = %.2f", calculoMedia);

    }
//todo==============================================================================================
//todo==============================================================================================

    //    >>>>>>>>>>>>>>>>>> METODO 4 (SOMA) <<<<<<<<<<<<<<<<<<<<

    public static int soma(int valor1, int valor2, int valor3) {

        return valor1 + valor2 + valor3;
    }

//todo==============================================================================================
//todo==============================================================================================

    //    >>>>>>>>>>>>>>>>>> METODO 5 (SOMA2) <<<<<<<<<<<<<<<<<<<<

    public static int soma2(int...valores){

        int somaVarargs = 0;
        for (int cadaPosicaoVararg : valores) {
            somaVarargs += cadaPosicaoVararg;
        }
        return somaVarargs;
    }
//todo==============================================================================================
//todo==============================================================================================

    //    >>>>>>>>>>>>>>>>>> METODO 6 (SOMA3) <<<<<<<<<<<<<<<<<<<<

    public static int soma3(int valor1, int valor2, int valor3){
        int resultado = valor1 + valor2 + valor3;
        return resultado;
    }

//todo==============================================================================================
//todo==============================================================================================

    //    >>>>>>>>>>>>>>>>>> METODO 7 (BEM VINDO) <<<<<<<<<<<<<<<<<<<<

    public static String mensagemDeBoasVindas(String nome) {
        return "METODO 7 - Bem-vindo, " + nome + "!";
    }
}
