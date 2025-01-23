package orientacao_objetos.bidirecional;

public class Carro {
    
    // As classes Carro, CarroTeste e Motor estao vinculadas aos seus numeros... 1 com 1, 2 com 2 e sem numero
    
    
    final Motor esseMotor; // esse motor sera sempre do mesmo CARRO entao fazemos ele ser CONSTANTE com FINAL
    
    Carro() {
        this.esseMotor = new Motor(this);
    }
    
    void acelerar() {
        if (esseMotor.fatorInjecao < 2.6) {
            esseMotor.fatorInjecao += 0.4;
        }
    }/* Este metodo esta para adicionar giros por segundo ao motor quando acelerar e IMPEDIR que o carro
    ultrapasse certa quantidade de giro por segundo, neste caso eh 3.... 2.6 + 0.4 = 3.0
    */
    
    void frear() {
        if (esseMotor.fatorInjecao > 0.5) {
            esseMotor.fatorInjecao -= 0.4;
        }
    }/* O mesmo que ACELERAR, so que nao permiti que a velocidade diminua menor que 0.1,
    .... 0.5 - 0.4 = 0.1
    */
    
    void ligar() {
        esseMotor.ligado = true;
    }// liga o carro
    
    void desligar() {
        esseMotor.ligado = false;
        
    }// Desliga o carro
    
    boolean carroEstaLigado() {
        return esseMotor.ligado;
        
    } // Mostra se o carro esta ligado ou nao.
    
    
}
