package fundamentos.Tarefas;

public class And_Or_Xor_Not {
    public static void main(String[] args) {
        // -------------  Resposta 1 -------------
        boolean job1 = true;
        boolean job2 = true;

        System.out.print("Comprar TV 50 plg e tomar sorvete: ");
        System.out.println(job1 && job2);
        System.out.print("Comprar TV 32 plg e tomar sorvete: ");
        System.out.println(job1 || job2);
        System.out.print("Comprar TV 32 plg e tomar sorvete: ");
        System.out.println(job1 ^ !job2);
        System.out.print("Poderemos comprar um TV ou tomar sorvete?: ");
        System.out.print(!job1 + ", ");
        System.out.println(!job2);
        System.out.println("Ficaremos sem TV e sem tomar sorvete... F\n");

        // ------------- Resposta 2 -------------
        boolean tv50 = job1 && job2;
        boolean tv32 = job1 || job2;
        boolean tv322 = job1 ^ !job2;
        boolean nada = !job1 && !job2;

        System.out.println("Comprar TV 50 plg e tomar sorvete: " + tv50);
        System.out.println("Comprar TV 32 plg e tomar sorvete: " + tv32);
        System.out.println("Comprar TV 32 plg e tomar sorvete: " + tv322);
        System.out.println("Poderemos comprar um TV ou tomar sorvete?: " + nada);
        System.out.println("Ficaremos sem TV e sem tomar sorvete... F\n");

        // ------------- Resposta do Professor -------------

        // boolean job1 = true;
        // boolean job2 = true;

        boolean TV50 = job1 && job2;
        boolean TV32 = job1 ^ job2;
        boolean sorvete = job1 || job2;
        boolean F = !sorvete; // operador unario

        System.out.println("Comprar TV 50 plg e tomar sorvete: " + TV50);
        System.out.println("Comprar TV 32 plg e tomar sorvete: " + TV32);
        System.out.println("Comprou sorvete?: " + sorvete);
        System.out.println("Iremos tomar sorvete?: " + F + ".....F");
    }
}
