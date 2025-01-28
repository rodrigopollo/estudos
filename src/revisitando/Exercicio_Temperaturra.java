package revisitando;

public class Exercicio_Temperaturra {
    
    public static void main(String[] args) {
        
        // mudar de Fº para Cº e vice versa, os numeros seram CONSTANTES. F e C variaveis.
        // (ºF - 32) * 5 / 9 = ºC
        //===============================================================================
        
        final double A = 32;
        final double B = 5.0 / 9.0;
        double fahrenheit = 86;
        
        double celsius = (fahrenheit - A) * B;
        System.out.println(celsius + " ºC");
        
        
        // de C para F
        final double B1 = 9.0 / 5.0;
        
        celsius = 40;
        fahrenheit = (celsius * B1) + A;
        System.out.println(fahrenheit + " ºF");
        
        
        
        
        
        
    }
}

