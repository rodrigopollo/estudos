package revisitando;

import java.util.Scanner;

public class Valor_2_3 {
    public static void main(String[] args) {
        
        // leia 1 valor e apresente o resultado de valor² e ao valor³
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira um numero: ");
        double valor = entrada.nextDouble();
        
        double aoQuadrao = Math.pow(valor, 2);
        double aoCubo = Math.pow(valor, 3);
        
        System.out.printf("\nO valor de %.2f² = %.2f", valor, aoQuadrao);
        System.out.printf("\nO valor de %.2f³ = %.2f", valor, aoCubo);
        
        entrada.close();
        
    }
}
