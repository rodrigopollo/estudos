package revisitando;

public class Boolean_Trabalaho {
    
    public static void main(String[] args) {
        
        //2 possiveis trabalhos, 1 na terça outro na quinta.
        // se os 2 derem certo 1 tv 50
        // se 1 so der certo compro 1 tv de 32
        // Conseguindo qualquer 1 dos empregos e indo pro shopping, vao tomar sorvete.
        
        boolean trabalho1 = false;
        boolean trabalho2 = false;
        boolean tv50 = trabalho1 && trabalho2;
        boolean tv32 = trabalho1 ^ trabalho2;
        boolean sorvete = trabalho1 || trabalho2;
        
        System.out.print("Tv 50 e sorvete?: " + tv50);
        System.out.print("\nTv 32 e sorvete?: " + tv32);
        System.out.print("\nF trabalho e sorvete: " + !sorvete);
        
        
    }
}
