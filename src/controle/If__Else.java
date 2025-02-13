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
    /* NOTAS IMPORTANTES!!!!
    
    O if, pode existir sem o else como voce ve da linha 12 ate a 17, mas o ELSE nao existe sem o IF
    Se o IF eh igual q SE o ELSE eh igual SE NAO.
    entao vamos colocar de uma maneira bem simples de veer.
    
    NUMERO = 2
    if (SE) (numero % 2 == 0)   faça   {
            System.out.printf("\nO numero %d é par",numero);
            
        } else (SE NAO)  faça o seguinte   {
            System.out.printf("\nO numero %d é impar",numero);
        }
     
     Como voce pode ver o IF_ELSE funciona como se e se nao...
     SE numero / 2 tiver resto ZERO, exiba a msg de q o numero eh PAR.
     SE NAO.. se a divisao de numero / 2 tiver qualquer valor que nao seja ZERO, exiba IMPAR.
     */
}
