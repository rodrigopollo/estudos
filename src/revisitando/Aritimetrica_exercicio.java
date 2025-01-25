package revisitando;

public class Aritimetrica_exercicio {
    
    public static void main(String[] args) {
        
        // ([6 * (3 + 2)]² / 3*2  -  ((1 - 5) * (2 - 7) / 2)² )³  / 10³
        
        
        // A1 = ([6 * (3 + 2)]² / 3*2
        int a1 = 6 * (3 + 2);
        int a1AoQuadrado = (int) Math.pow(a1, 2);
        int a1Dividido = a1AoQuadrado / (3 * 2);
        System.out.println("A1 = " + a1Dividido); // 150
        
        // B1 = ((1 - 5) * (2 - 7) / 2)²
        int b1 = (1 - 5) * (2 - 7);
        int b1Dividido = b1 / 2;
        int b1AoQuadrado = (int) Math.pow(b1Dividido, 2);
        System.out.println("b1 = " + b1AoQuadrado); // 100
        
        int a1MenosB1 = a1Dividido - b1AoQuadrado;
        System.out.printf("(150 - 100)³ = %d³ / 10³\n", a1MenosB1);
        
        int a1MenosB1AoCubo = (int) Math.pow(a1MenosB1, 3);
        System.out.println("50³ = " + a1MenosB1AoCubo);
        
        int dezAoCubo = (int) Math.pow(10, 3);
        System.out.println("10³ = " + dezAoCubo);
        
        int resultadoFinal = a1MenosB1AoCubo / dezAoCubo;
        
        System.out.println("\nResultado final = " + resultadoFinal);
        
        
        
        
        
        
    }
}
