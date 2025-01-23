package duvidas_e_termos;

public class Duvidas_Resolver {
    public static void main(String[] args) {
        // ------------- TIRAR COMENTARIO DOS EXEMPLOS PARA VER MELHOR -----------------

/*  -->     Porque usando TERNARIO no (exemplo 1) eu posso colocar SE : e outro SE
    -->     e no final posso colocar (Invalido) mas quando eu uso o TERNARIO//
    -->     na calculadora (exemplo 2) eu nao posso???


        Exemplo 1
        String resultadoIMC = imc < 16.0 ? "Magreza Grau 3." :
                imc >= 16.0 && imc <= 16.9 ? "com Magreza Grau 2" :
                imc >= 17.0 && imc <= 18.4 ? "com Magreza Grau 1" :
                imc >= 18.5 && imc <= 24.9 ? "com peso Adequado" :
                imc >= 25.0 && imc <= 29.9 ? "Pré-Obeso" :
                imc >= 30.0 && imc <= 34.9 ? "com Obesidade Grau 1" :
                imc >= 35.0 && imc <= 39.9 ? "com Obesidade Grau 2" :
                imc >= 40.0 ? "com Obesidade Grau 3" : "Valor Invalido!";

        //Exemplo 2
        double resultadoTotal = 0;

        resultadoTotal = op.equals("+") ? numero1 + numero2 : resultadoTotal;
        resultadoTotal = op.equals("-") ? numero1 - numero2 : resultadoTotal;
        resultadoTotal = op.equals("*") ? numero1 * numero2 : resultadoTotal;
        resultadoTotal = op.equals("/") ? numero1 / numero2 : resultadoTotal;
        resultadoTotal = op.equals("%") ? numero1 % numero2 : resultadoTotal;

//==============================================================================================

        // ------------------------  PERGUNTAS A RESPOSDER  ------------------------

//      -  O que sao estruturas de dados??
        -  Concatenar, tbm estudar oq eh --> println ("Numero: " + resultado); + resultado eh concatenar.
//      -  Atalho para formatar codigo.
//      -  Wrapers... para que se usa na vdd, nao termino de entender ja q aprendi e basicamente nunca usei.
//      -  Metodo de objeto e metodo de clase, diferença???
        -  Area_CircTest3 -> Pq pode entrar diretamente na classe com Area_Circ3????
//      -  Como, qndo e porque usar saida ou entrada nos metodos. Nao entendi direito esse conceito.
//      -  Aperfeiçoar o uso de boolean.
//      -  Aperfeiçoar o uso de boolean.



//==============================================================================================

  -->   Exemplo 1 vc n pode deixar a chave vazia (String chave;) pq voce n esta dando nenhum valor
  -->   pra ela antes de usar. Voce ja esta querando usar ela na linha 46, mas ela nao tem nenhum valor.
  -->   oq resulta em erro.

  ---------  Exemplo 1: -------
        String chave = "";

        while (!chave.equalsIgnoreCase("sair")) {
            System.out.print("Digite: ");
            chave = entrada.nextLine();

  -->   Ao contrario do exemplo 1, vc pode fazer pq vc da um valor a TEXTO antes de usar ele.

  ---------  Exemplo 2: -------
        String texto;

        do {
            System.out.println("Deseja continuar?");
            texto = entrada.nextLine();
        }
          while (!texto.equalsIgnoreCase("sair"));


//==============================================================================================
      Porque isso esta fazendo uma piramide??? oq tem a ver o INT i com a string?? n to
        entendendo nada

        String valor = "#";
        for (int i = 1; i <= 5; i++) {
            System.out.println(valor);
            valor += "#";





*/








    }
}
