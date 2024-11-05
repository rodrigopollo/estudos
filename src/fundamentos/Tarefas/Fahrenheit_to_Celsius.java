package fundamentos.Tarefas;

public class Fahrenheit_to_Celsius {
    public static void main(String[] args) {

        //Calculo para transofrmar temperaturas de fahrenheit para celsius
        //(ºF - 32) x 5 / 9 = ºC

        double fahrenheit = 75.2;
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("A temperatura hoje é de %.1f ºC", celsius);


    }

}
