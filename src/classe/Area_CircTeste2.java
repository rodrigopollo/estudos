package classe;

public class Area_CircTeste2 {
    public static void main(String[] args) {

// * NOTA: Area_Circ2 e Area_CircTeste2 sao a separacao entre MAIN,
// metodos e controres (sao 1 so)
//-----------------------------------------------------------------------------------------

        Area_Circ2 a1 = new Area_Circ2(10);
        Area_Circ2 a2 = new Area_Circ2(5);

        // Este comando funciona so enquanto PI nao tiver FINAL, no momento em que voce
        // adiciona o final e torna PI uma constante, esse comando deixa de funcionar pois
        // o atributo PI nao pode mais ser auterado de outra forma que nao seja diretamente.
        //              Area_Circ.PI = 3.1415;

        System.out.println(a1.area());  // PI(11) * raio(10) * raio(10)
        System.out.println(a2.area());  // PI(22) * raio(5) * raio(5)
        System.out.println(Area_Circ2.PI); //So mostra o valor da constante PI


//-----------------------------------------------------------------------------------------
        // Math.PI eh um comando dentro do JAVA que tem armazenado de forma PADRAO o valor de PI.
        System.out.println(Math.PI);
    }
}
/* Destrinchando em detalhes a o programa.

(Vale lembrar q essa explicação foi iniciada e copiada do CIRC2, entao o numero depois de
CIRC pode ser diferente dependendo da parte da explicação, mas tenha em conta o nome e nao
o numero, ex: Are_Circ(1, 2, 3) o numero nao importa, pense como se Todas as Area_Circ fossem
um programa so

         Area_Circ a1 = new Area_Circ(10);

--> Area_Circ a1 == Eu quero que a1 (nome escolhido para instancia) acesse a classe Area_Circ
--> new Area_Circ == Crie uma nova instancia que ira usar o Construtor Area_Circ.
--> (10) == O Construtor criado em Area_Circ é == Area_Circ(double raioInicial)
  Sendo assim qndo voce chamar o construtor voce tbm tem que cumprir com as regras dele, no caso
ele diz, INSIRA um valor do tipo DOUBLE que tera o nome raioInicial.

            a1.pi = 11;

--> a1.pi = 11 == Vc esta dizendo, eu quero que a1 (explicado na linha 39) acesse o atributo variavel
pi dentro da classe Area_Circ e altere o valor para 11.

            System.out.println(a1.area());
            double area(){  <== É um metodo dentro de Area_Circ
                 return pi * raio * raio;
             }
--> (a1.area()); Eu quero que a1 acesse "area" (no caso eh um metodo) que esta dentro de Area_Circ
e me mostre (println) o resultado do calculo do metodo AREA -> pi * raio * raio;

            Area_Circ.PI = 3.1415;

-->  Area_Circ.PI = 3.1415 == Statics podem acessar diretamente outros
Statics (sem precisar importar) sempre que estejam dentro da mesma classe, por isso aqui ele
chama a classe Area_Circ e diz que quer acessar o atributo (PI) e que PI agora ira ter o
valor de 3.1415.

**** NOTA.: Apesar de voce nao pode mais modificar PI diretamente atravez da classe uma vez
que PI se torna constante, voce ainda pode ACESSAR e LER o valor de PI, vamos ver um exemplo:
    Exemplo:
      -->  System.out.println(Area_Circ.PI);    ...So mostra o valor da constante PI




 */