package classe;

public class Area_Circ1 {

// * NOTA: Area_Circ1 e Area_CircTeste1 sao a separacao entre MAIN, metodos e controres.
// (sao 1 so)
//---------------------------------------------------------------------------------------------

    double raio;
    double pi = 3.14;

    // Construtor
    Area_Circ1(double raioInicial){
        raio = raioInicial;
    }

    // Metodo --> Sem parametros de entrada......Calcula area.
    double area(){
        // Outra maneira de fazer o calculo -> return pi * Math.pow((raio, 2));
        return pi * raio * raio;

    }




}
