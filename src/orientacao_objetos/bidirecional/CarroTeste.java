package orientacao_objetos.bidirecional;

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
        System.out.println("RTM = " + c1.esseMotor.giros());
        
        c1.frear();
        c1.frear();
        c1.frear();
        System.out.println("RTM = " + c1.esseMotor.giros());
        
        //Como o carro esta desligado eh IMPOSSIVEL acelerar, entao sera sempre ZERO
        c1.desligar();
        c1.acelerar();
        System.out.println("RTM = " + c1.esseMotor.giros());
        
        // Relação bidirecional, esse motor pertence a 1 carro, e o carro pertence a esse motor
        c1.ligar();
        c1.acelerar();
        System.out.println(c1.esseMotor.esseCarro.esseMotor.esseCarro.esseMotor.giros());
        
        
        
        
        
        /* NOTA == Nao eh necessario colocar tantas vezes.motor.carro etc... eh so para mostrar que
        como ESSE motor e ESSE carro estao vinculados a eles mesmo, eh possivel fazer isso.
         */
        
        
    }
    
}
