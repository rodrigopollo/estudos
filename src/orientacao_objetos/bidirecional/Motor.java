package orientacao_objetos.bidirecional;

public class Motor {
    
    // As classes Carro, CarroTeste e Motor estao vinculadas.
    
    final Carro esseCarro;  // esse carro tera sempre o mesmo MOTOR entao fazemos ele ser CONSTANTE com FINAL
    boolean ligado = false;
    double fatorInjecao = 1;
    
    Motor(Carro carro) {
        this.esseCarro = carro;
    }
    
    int giros() {
        if (ligado != true) {
            return 0;
        } else {
            return (int) Math.round(fatorInjecao * 3000);
        }
    }
    
    
}
