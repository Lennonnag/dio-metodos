package sobrecarga;

public class Sobrecarga {
    public static void area(double lado) {
        System.out.println("A área do quadrado é: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        
        System.out.println("A área do retangulo é: " + lado1 * lado2);
    }
    public static void area(float diagonal1, float diagonal2) {
        
        System.out.println("A área do losangulo é: " + (diagonal1*diagonal2)/2);
    }

    public static void area(double baseMenor, double baseMaior, double altura) {
        
        System.out.println("Área do trapézio:" + ((baseMaior+baseMenor)*altura) / 2);
    }

}
