package fundamentos.OperadoresLogicos;

public class And_Or_Xor_Not {
    public static void main(String[] args) {
        /* AND --> &&
           OR --> ||
           XOR --> ^
           NOT --> !
         */
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && condicao2); // false
        System.out.println(condicao1 || condicao2); // true
        System.out.println(condicao1 ^ condicao2); // true
        System.out.println(!condicao1); // false
        System.out.println(!!condicao1); // true

        // ---------  Tabela verdade E (AND)  ---------
        System.out.println("\nTabela Verdade E (&&)");
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        // ---------  Tabela verdade OU (OR)  ---------
        System.out.println("\nTabela Verdade OU (OR)");
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        // ---------  Tabela verdade OU Exclusivo (XOR)  ---------
        System.out.println("\nTabela Verdade OU Exclusivo (XOR)");
        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); // true
        System.out.println(false ^ false); // false
        // ---------  Tabela verdade OU Exclusivo NOT  ---------
        System.out.println("\nTabela Verdade OU Exclusivo NOT");
        System.out.println(!true); // false
        System.out.println(!false); // true

    }

}

