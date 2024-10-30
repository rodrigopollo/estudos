package fundamentos;

public class Tipo__Primitivos {
    public static void main(String[] args) {

        // Informaçoes do funcionario

        // tipos numericos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos= 542;
        int id = 56789;
        long pontosAcumulados = 3_2324_845_223L;

        // Tipos numericos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano (false or true)
        boolean estaDeFerias = false; // true

        // Tipo caractere (so aceita 1 caractere)
        char status = 'A'; // ativo

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //Numero de Viagens
        System.out.println(numeroDeVoos / 2);

        //Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": tem um salario de =" + salario);
        System.out.println("Ferias?" + estaDeFerias);
        System.out.println("Status: " + status);


    }
}
