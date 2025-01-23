package colecoes;

import java.util.HashMap;
import java.util.Map;

public class AL_Map {
    public static void main(String[] args) {
        
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");
        usuarios.put(20, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");
        
        System.out.println("Tamanho do MAP = " + usuarios.size());  //verifica o tamanho MAP
        System.out.println("MAP vazio? = " + usuarios.isEmpty());  // verifica se esta vazio
        
        System.out.println("See all Keys ==> " + usuarios.keySet());
        System.out.println("See all Value ==> " + usuarios.values());
        System.out.println("All Keys and Values ==> " + usuarios.entrySet());
        System.out.println("Tem essa Chave(1)? ==> " + usuarios.containsKey(1));   // TRUE
        System.out.println("Tem esse Valor(Roberto) ==> " + usuarios.containsValue("Roberto"));   // TRUE
        System.out.println("Mostre valor dessa Key(1) ==> " + usuarios.get(1));  // Roberto
        System.out.println("================");
        
        //Get ou remove para para mostrar ou remover o elemento selecionado (20)
        System.out.println(usuarios.get(20));           //mostra o elemento 20 (Ricardo)
        System.out.println(usuarios.remove(20));    //remove elemento 20 (Ricardo)
        System.out.println(usuarios.remove(4, "Ricardo"));
        
        
        System.out.println("See all Keys");
        for (int chave : usuarios.keySet()){
            System.out.println(chave);
        } System.out.println("================");
        
        System.out.println("See all Value");
        for (String valor : usuarios.values()){
            System.out.println(valor);
        } System.out.println("================");
        
        System.out.println("All Keys and Values");
        for (Map.Entry<Integer, String> chaveEValor : usuarios.entrySet()){
            System.out.print(chaveEValor.getKey() + " = ");
            System.out.println(chaveEValor.getValue());
        }
        
        
    }
}
/*
    PUT = Adiciona ou altera a CHAVE e/ou VALOR  exempplo:
            usuarios.put(1, "Rodrigo");
            usuarios.put(1, "Leonardo");
    Na segunda linha vc esta alterando o VALOR da chave 1 de Rodrigo para Leonardo.
    -----------------------------------------
    
    KEYSET  => mosta o conjunto da KEY(chave), mas nao eh ordenado.....Exeplo: 1
    VALUES  => mosrta somente os VALUE(valores)...Exemplo: "Roberto"
    ENTRYSET  => mostra keys e values. (eX: 1 = Roberto)
    CONTAINSKEY(1)  => verifica se contem a KEY, nesse caso (1), e retorna TRUE or FALSE.
    CONTAINSVALUE("Roberto)  => verifica se contem o VALUE, nesse caso ("Roberto"), e retorna TRUE or FALSE.
    GET(1) => verifica se contem (1), se sim retorna o VALOR da KEY 1 (Roberto), se nao retorna NULL
    
    -----------------------------------------
    Para verificar a Key e Value juntos em um FOR voce usa o seguinte comando:
    
                Map.Entry<Integer, String> chaveEValor : usuarios.entrySet()
    
    Map.Entry = Esse eh o comendo para acessar a Key e o Value ao mesmo tempo
    <Key do Map, Value do Map> = o local onde vc vai colocar a mesma chave e valor q vc usou pra criar o MAP
    chaveEValor = Esse eh o nome que vc vai dar
    usuarios.entrySet() = aqui vc diz qual MAP voce quer acessar, no caso USUARIOS e especifica novamente
    que ira aceder a KEY e VALUE
    
    
 */
