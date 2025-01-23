package orientacao_objetos.um_pra_um;

public class Motor {
    
    // As classes Carro, CarroTeste e Motor estao vinculadas.
    
    boolean ligado = false;
    double  fatorInjecao = 1;
    
    int giros() {
        if(ligado != true){
            return 0;
        }else {
            return (int) Math.round(fatorInjecao * 3000);
        }
    }
    
    
    
    
    
    
    
}
