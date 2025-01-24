package classe.Tarefas__Classe;

public class Treino_Metodo2 {


    private int maiorNumero = Integer.MIN_VALUE; // Inicializa com o menor valor possível
    private int menorNumero = Integer.MAX_VALUE; // Inicializa com o maior valor possível

    public void verificaNumero(int valor) {
        if (valor > maiorNumero) {
            maiorNumero = valor;
        }
        if (valor < menorNumero) {
            menorNumero = valor;
        }
    }

    // Métodos para retornar os valores de maior e menor número
    public int getMaiorNumero() {
        return maiorNumero;
    }

    public int getMenorNumero() {
        return menorNumero;
    }

}

