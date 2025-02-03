package classe;

import java.util.Date;

public class Equals_HashCode {
    public static void main(String[] args) {

    // Essa classe esta relacionada com a classe Usuario
        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@gmail.com.br";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@gmail.com.br";

        System.out.println(u1 == u2);   // FALSE
        System.out.println(u1.equals(u2));  // TRUE, apos setar os criterios do metodo equals em USUARIO
        System.out.println(u2.equals(u1));  // TRUE, apos setar os criterios do metodo equals em USUARIO

        System.out.println(u2.equals(new Date()));

    }
}

