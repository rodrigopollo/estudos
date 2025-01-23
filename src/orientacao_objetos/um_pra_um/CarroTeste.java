package orientacao_objetos.um_pra_um;

public class CarroTeste {
    public static void main(String[] args) {
        
        // As classes Carro, CarroTeste e Motor estao vinculadas.
        
        Carro c1 = new Carro();
        System.out.println("Carro esta ligado? = " + c1.carroEstaLigado());
        
        c1.ligar();
        System.out.println("Carro esta ligado? = " + c1.carroEstaLigado());
        
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        
        // RTM = rotacao por minuto do giros do motor
        System.out.println("RTM = " + c1.meuMotor.giros());
        
        c1.frear();
        c1.frear();
        c1.frear();
        
        System.out.println("RTM = " + c1.meuMotor.giros());
        c1.desligar();
        
        
    }
    
}
