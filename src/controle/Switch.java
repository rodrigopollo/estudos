package controle;

public class Switch {
    public static void main(String[] args) {
        // Swith sem breack, ele executa tudo oq estiver abaixo da linha executada.

        String faixa = "marrom";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Faixa preta");
            case "marrom":
                System.out.println("Faixa marrom");
            case "roxa":
                System.out.println("Faixa roxa");
        }
//////////////////////////////////////////////////////////////////////////

        int idade = 2;

        switch (idade) {
            case 2:
                System.out.println("Sabe falar");
            case 1:
                System.out.println("Sabe andar");
        }

    }
}
