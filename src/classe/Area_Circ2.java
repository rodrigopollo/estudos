package classe;

public class Area_Circ2 {

// * NOTA: Area_Circ2 e Area_CircTeste2 sao a separacao entre MAIN, metodos e controres.
// (sao 1 so)
//---------------------------------------------------------------------------------------------

    double raio;
    // Com FINAL, PI se torna constante e por isso o nome é em MAIUSCULA, por convensao.
    // Como STATIC foi adicionado, PI do tipo double agora pertence a classe Area_Circ3.
    static final double PI = 3.14;

    // Construtor
    Area_Circ2(double raioInicial){
        raio = raioInicial;
    }

    // Metodo --> Sem parametros de entrada......Calcula area.
    double area(){
        // Outra maneira de fazer o calculo -> return pi * Math.pow((raio, 2));
        return PI * raio * raio;


    }




}
