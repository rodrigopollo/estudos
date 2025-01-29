package revisitando;

import java.util.Scanner;

public class Tarefa_Calc {
    
    public static void main(String[] args) {
        
        //ler num1 e num2
        // fazer 1 calculo matematico + - * / nao multiplas ao mesmo tempo
        // usa o aprendido ate agora. IF nao foi aprendido.
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("1º numero: ");
        double numuero1 = entrada.nextInt();
        
        System.out.print("2º numero: ");
        double numuero2 = entrada.nextInt();
        
        System.out.print("Operacao desejada + - * /: ");
        String operacaoMatematica = entrada.next();
        
        double calular = operacaoMatematica.equals("+") ? numuero1 + numuero2 :
                              operacaoMatematica.equals("-") ? numuero1 - numuero2 :
                                   operacaoMatematica.equals("*") ? numuero1 * numuero2 :
                                        operacaoMatematica.equals("/") ? numuero1 / numuero2 :
                                           operacaoMatematica.equals("%") ? numuero1 % numuero2 : 0;
        
        System.out.printf("\n%.2f %.2f %s = %.2f", numuero1, numuero2, operacaoMatematica, calular);
        
        
        entrada.close();
        
    }
}
