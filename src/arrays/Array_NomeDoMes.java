package arrays;

public class Array_NomeDoMes {

    // Usar metodos e Array.
    // Imprimir o NOME DO MES do numero que voce colocou
    // Exemplo: janeiro = 1, fevereiro = 2 etc....

    public String obterNomeDoMes(int numero) {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        if (numero >= 1 && numero <= 12) {
            return meses[numero - 1];
        } else {
            return "Número inválido";
        }
    }

    public static void main(String[] args) {
        Array_NomeDoMes calendario = new Array_NomeDoMes();
        String mes = calendario.obterNomeDoMes(5);
        System.out.println("O mês é: " + mes); // Exibe: O mês é: Maio
    }
}






