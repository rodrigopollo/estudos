package orientacao_objetos.um_pra_um;

public class Carro {
    
    // As classes Carro, CarroTeste e Motor estao vinculadas aos seus numeros... 1 com 1, 2 com 2 e sem numero
    
    Motor meuMotor = new Motor();
    
    void acelerar() {
        if (meuMotor.fatorInjecao < 2.6) {
            meuMotor.fatorInjecao += 0.4;
        }
    }/* Este metodo esta para adicionar giros por segundo ao motor quando acelerar e IMPEDIR que o carro
    ultrapasse certa quantidade de giro por segundo, neste caso eh 3.... 2.6 + 0.4 = 3.0
    */
    
    void frear() {
        if (meuMotor.fatorInjecao > 0.5) {
            meuMotor.fatorInjecao -= 0.4;
        }
    }/* O mesmo que ACELERAR, so que nao permiti que a velocidade diminua menor que 0.1,
    .... 0.5 - 0.4 = 0.1
    */
    
    void ligar() {
        meuMotor.ligado = true;
    }// liga o carro
    
    void desligar() {
        meuMotor.ligado = false;
        
    }// Desliga o carro
    
    boolean carroEstaLigado() {
        return meuMotor.ligado;
        
    } // Mostra se o carro esta ligado ou nao.
    
    
}
