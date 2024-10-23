package fundamentos;

public class Temperatura {
    public static void main(String[] args) {

        //Calculo para transofrmar temperaturas de fahrenheit para celsius
        //(ºF - 32) x 5 / 9 = ºC

        double fah = 86; //variavel da temperatura fahrenheit
        final double fah32 = fah - 32; //valor constante pq sempre vai ta no calculo
        final double div = 5 / 9.0; //valor constante pq sempre vai ta no calculo
        double cel = fah32 * div; //Valor variavel ja que ira depender do -- FAH --

        System.out.println("A temperatura atual é de: " + cel + " graus celsius");
        /*
         * double -> eh um tipo PRIMITIVO da linguagem
         * Lembrando que --- final double --- eh um valor double CONSTANTE por colocar o FINAL
         *
         * --------------  ALTERNATIVA DE RESULTADO (MOSTRADA PELO PROFESSOR) ----------------
         * final double div = 5 / 9.0;
         * final double fah32 = 32;
         *
         * double fah = 86;
         * double cel = (fah - fah32) * div;
         *
         * System.out.println("A temperatura atual é de: " + cel + " celsius");
         */

    }
}
