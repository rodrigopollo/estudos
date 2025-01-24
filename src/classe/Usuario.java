package classe;

public class Usuario {

    // Essa classe esta relacionada com a classe Equals_HashCode

    String nome;
    String email;

    //Isso eh uma conversao (cast) transformando "Object" em "Usuario"
    public boolean equals(Object objeto) {

        if (objeto instanceof Usuario) {
            Usuario outro = (Usuario) objeto;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        } else {
            return false;
        }
        /* Outro jeito de fazer esse mesmo INSTANCEOF eh o seguinte.

        public boolean equals(Object objeto)
              if(objeto instanceof Usuario outro) {

                 boolean nomeIgual = outro.nome.equals(this.nome);
                 boolean emailIgual = outro.email.equals(this.email);

              return nomeIgual && emailIgual;
        }else {
            return false;
          */
    }
}


/*
   Vamos entender o EQUALS:
                public boolean equals(Object objeto)

   --> equals(Object objeto) = metodo equal para comparar se os objetos sao iguals.
   --> public boolean = esse metodo retornara um tipo boolean apos a verificação ou seja TRUE or FALSE

                Usuario outro = (Usuario) objeto;

   --> Usuario outro = Aqui voce esta chamando a classe diretamente (Usuario) e criando uma variavel (outro)
   --> (Usuario) objeto = Voce esta fazendo um cast e convertendo o Object para Usuario

                return nomeIgual && emailIgual;

   --> nomeIgual && emailIgual = sao os criterios para determinar se os Usuarios sao igual ou nao
   --> return = eh o retorno, ou seja a resposta apos verificar os criterios se sao ou nao sao iguais.


 */