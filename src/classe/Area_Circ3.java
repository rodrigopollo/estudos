package classe;

public class Area_Circ3 {

// * NOTA: Area_Circ3 e Area_CircTeste3 sao a separacao entre MAIN, metodos e controres.
// (sao 1 so)
//---------------------------------------------------------------------------------------------

    double raio;
    // Com FINAL, PI se torna constante e por isso o nome é em MAIUSCULA, por convensao.
    // Como STATIC foi adicionado, PI do tipo double agora pertence a classe Area_Circ3.
    static final double PI = 3.14;

    // Construtor
    Area_Circ3(double raioInicial){
        raio = raioInicial;
    }


    // Metodo --> Sem parametros de entrada......Calcula area.
    double area(){
        // Outra maneira de fazer o calculo -> return pi * Math.pow((raio, 2));
        return PI * raio * raio;
    }

    // Metodos tambem podem ser staticos
    static double area(double raio){
        //""Outra maneira de fazer o calculo"" -> return PI * raio * raio;
        return PI * Math.pow(raio, 2);
    }




}
