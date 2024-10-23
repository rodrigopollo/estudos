package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        double a = 2.3;
        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!");

        System.out.println(s);

        String x = "Leo".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X"
                .replace("X", "Rod")
                .toUpperCase()
                .concat("!!!");

        System.out.println(y);
        System.out.println(a);


        //Tipo primitivos nao tem o operador "" . ""
        // int a = 3
        // a. (nao existe)
    }
}
