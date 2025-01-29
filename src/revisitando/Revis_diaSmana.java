package revisitando;

import java.util.Scanner;

public class Revis_diaSmana {
    
    public static void main(String[] args) {
        
        // o sistema pede para digitar 1 dia da semana, e ele vai retornar um numero relacionao a esse dia:
        //Ex: quinta = 5
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o dia da semana: ");
        String dia = entrada.nextLine();
        
        if (dia.equalsIgnoreCase("domingo")) {
            System.out.println("1");
            
        } else if (dia.equalsIgnoreCase("segunda")) {
            System.out.println("2");
            
        } else if (dia.equalsIgnoreCase("terça") || dia.equalsIgnoreCase("terca")) {
            System.out.println("3");
            
        } else if (dia.equalsIgnoreCase("quarta")) {
            System.out.println("4");
            
        } else if (dia.equalsIgnoreCase("quinta")) {
            System.out.println("5");
            
        } else if (dia.equalsIgnoreCase("sexta")) {
            System.out.println("6");
            
        } else if (dia.equalsIgnoreCase("sabado")) {
            System.out.println("7");
            
        } else {
            System.out.println("Error: dia invalido!");
        }
        
        
        entrada.close();
        
    }
}
