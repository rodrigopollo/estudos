package controle;

import javax.swing.*;

public class If__Else {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe o numero");

        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0) {
            System.out.printf("\nO numero %d é par",numero);
        }
        if (numero % 2 != 0) {
            System.out.printf("\nO numero %d é impar ", numero);
        }

        // ----  Alternativa mais simples para Par Impar  ----

        if (numero % 2 == 0) {
            System.out.printf("\nO numero %d é par",numero);
        } else {
            System.out.printf("\nO numero %d é impar",numero);
        }
    }
}
