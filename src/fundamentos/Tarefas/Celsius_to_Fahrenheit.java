package fundamentos.Tarefas;

public class Celsius_to_Fahrenheit {
    public static void main(String[] args) {

       // Calculo para converter Celsius em Fahrenheit
        // (ºC * 9/5) + 32

        double celsius = 36.5;
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.printf("A temperatura hoje é de %.1f ºF", fahrenheit);
    }
}
