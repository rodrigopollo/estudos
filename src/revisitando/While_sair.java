package revisitando;

import java.util.Scanner;

public class While_sair {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String digite = "";
        
        
        while (!digite.equalsIgnoreCase("sair") ) {
        System.out.print("Digite alguma coisa: ");
        digite = entrada.nextLine();
        }
        
        System.out.println("\n O programa foi finalizado!");
        
        entrada.close();
    }
}
