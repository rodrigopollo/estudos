package fundamentos;

public class Wrappers {
    public static void main(String[] args) {
        /* Essas sao ""CLASSES"" versoes orientadas a objetos dos tipos primitivos
         * Ex: byte (b minusculo) eh primitivo
         * Ex: Byte (B maiusculo) eh Classe Wrapper
         */

        //Byte
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000; // Integer eh a classe do primitivo int
        Long l = 100000L; //LONG sempre tem q colocar o L no final.

        System.out.println((b.byteValue()));
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Float f = 123.10F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#'; // Character eh a classe do primitivo char
        System.out.println(c + "...");






    }
}
