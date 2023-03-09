package sobrecarga;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int programa;
        System.out.println("Área de quadrilateros");
        System.out.print("1 - Quadrado\n2 - Retangulo\n3 - Trapézio\n4 - Losangulo\nDigite qual deseja calcular: ");
        programa = scan.nextInt();
        if (programa == 1) {
            double lado;
            System.out.print("Digite o valor do lado do quadrado: ");
            lado = scan.nextDouble();
            Sobrecarga.area(lado);
        }
        if (programa == 2) {
            double lado1, lado2;
            
            System.out.print("Digite o valor da base: ");
            lado1 = scan.nextDouble();
            System.out.print("Digite o valor da altura: ");
            lado2 = scan.nextDouble();
            Sobrecarga.area(lado1, lado2);
        }
        if (programa == 3) {
            double baseMaior, baseMenor, altura;
            
            System.out.print("Digite o valor da base menor: ");
            baseMenor = scan.nextDouble();
            System.out.print("Digite o valor da base maior: ");
            baseMaior = scan.nextDouble();
            System.out.print("Digite o valor da altura: ");
            altura = scan.nextDouble();
            Sobrecarga.area(baseMaior, baseMenor, altura);
        }
        if (programa == 4) {
            float diagonal1, diagonal2;
            System.out.print("Digite o valor da diagonal 1: ");
            diagonal1 = scan.nextFloat();
            System.out.print("Digite o valor da diagonal 2: ");
            diagonal2 = scan.nextFloat();
            Sobrecarga.area(diagonal1, diagonal2);
            
        }
    }

}
