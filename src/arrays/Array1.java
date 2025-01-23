package arrays;

public class Array1 {
    public static void main(String[] args) {

        int numero0 = 0;
        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;
        int numero4 = 4;

        System.out.println(numero0);
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);
        System.out.println(numero4);


        // transformando o exemplo ACIMA em Array.

        // Voce cria uma nova instancia de array com o objeto NUMEROS do tipo int
        // e diz que esse array tera 5 posiçoes.
        int[] numeros = new int[5];

        // Aqui vc atribui os valores para as 5 que vc abriu antes.
        numeros[0] = 10;
        numeros[1] = 11;
        numeros[2] = 22;
        numeros[3] = 33;
        numeros[4] = 44;
        // Mostrando o exemplo visual
        System.out.print("Imprimi o numero armazenado na posição do Array");
        System.out.print("\nPosição 0 = " + numeros[0]);
        System.out.print("\nPosição 1 = " + numeros[1]);
        System.out.print("\nPosição 2 = " + numeros[2]);
        System.out.print("\nPosição 3 = " + numeros[3]);
        System.out.print("\nPosição 4 = " + numeros[4]);

        // Array tipo String.
        String[] letras = {"A", "B", "C"};

        System.out.print("\nImprimi o numero armazenado na posição do Array");
        System.out.print("\nPosição 0 = " + letras[0]);
        System.out.print("\nPosição 1 = " + letras[1]);
        System.out.print("\nPosição 2 = " + letras[2]);



        String[] animais = {"tigre", "leao", "lobo"};

        //Voce consegue imprimir os Array com contadores.
        for (int posicao = 0; posicao <= 2; posicao++){

            //Modo de imprimir mais elaborado.
            System.out.printf("\nAnimal da posição %d: %s", posicao, animais[posicao]);

            //Modo de imprissao simplificado
            System.out.print("\nAnimais no array: " + animais[posicao]);
        }
    }
}
