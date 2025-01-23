package colecoes;

import java.util.Objects;

public class UsuarioDaLista {

    String nome;

    UsuarioDaLista(String nome){

        this.nome = nome;
    }

    // Esse metodo faz com que sempre que for Imprimir o atributo NOME em outras classes
    //ele ja sai impresso com MEU NOME EH
    public String toString() {
        return "Meu nome é " + this.nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioDaLista that = (UsuarioDaLista) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
