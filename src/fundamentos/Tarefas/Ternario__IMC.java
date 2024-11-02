package fundamentos.Tarefas;

import java.util.Scanner;

public class Ternario__IMC {
    public static void main(String[] args) {

        // Calcule o IMC e imprima para o usuario o resultado e uma pré-avaliação

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite a sua altura: ");
        double altura = entrada.nextDouble();

        System.out.print("Digite o seu peso: ");
        double peso = entrada.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        String resultadoIMC = imc < 16.0 ? "Magreza Grau 3." :
                              imc >= 16.0 && imc <= 16.9 ? "com Magreza Grau 2" :
                              imc >= 17.0 && imc <= 18.4 ? "com Magreza Grau 1" :
                              imc >= 18.5 && imc <= 24.9 ? "com peso Adequado" :
                              imc >= 25.0 && imc <= 29.9 ? "Pré-Obeso" :
                              imc >= 30.0 && imc <= 34.9 ? "com Obesidade Grau 1" :
                              imc >= 35.0 && imc <= 39.9 ? "com Obesidade Grau 2" :
                              imc >= 40.0 ? "com Obesidade Grau 3" : "Valor Invalido!";

        System.out.printf("%s esta tem IMC de %.2f e esta %s ", nome, imc, resultadoIMC);

        entrada.close();

    }
}
