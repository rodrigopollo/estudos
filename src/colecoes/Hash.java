package colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        
        HashSet<UsuarioDaLista> usuarios = new HashSet<>();
        
        usuarios.add(new UsuarioDaLista("Pedro"));
        usuarios.add(new UsuarioDaLista("Rodrigo"));
        usuarios.add(new UsuarioDaLista("Carlos"));
        
        System.out.println(usuarios.contains(new UsuarioDaLista("Rodrigo")));
        
    }
}
