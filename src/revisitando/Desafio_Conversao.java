package revisitando;

import java.util.Scanner;

public class Desafio_Conversao {
    
    public static void main(String[] args) {
        
        /* criar 1 Scaner, e criar 3 Strings q vao recerber os ultimos 3 salarios
         converter string to number e somar os 3 e ver a media,
         */
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Qual o nome do funcionario?: ");
        String nome = entrada.nextLine();
        
        System.out.print("Valor do 1º salario: ");
        String salario1 = entrada.nextLine().replace(",", ".");
        System.out.print("Valor do 2º salario: ");
        String salario2 = entrada.nextLine().replace(",", ".");
        System.out.print("Valor do 3º salario: ");
        String salario3 = entrada.nextLine().replace(",", ".");
        
        double s1 = Double.parseDouble(salario1);
        double s2 = Double.parseDouble(salario2);
        double s3 = Double.parseDouble(salario3);
        
        double mediaSalarial = (s1 + s2 + s3) / 3;
        
        System.out.printf("\nFuncionario(a): %s \nMedia Salarial: R$%.2f", nome, mediaSalarial);
        
        entrada.close();
    }
}

