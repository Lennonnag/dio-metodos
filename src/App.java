import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int programa;
        String fecharPrograma = "n";
        
        do {

            System.out.print("1 - Calculadora\n2 - Horario\n3 - Emprestimo\nQual programa deseja executar:");
            programa = scan.nextInt();
            while (programa <= 0 || programa > 4) {

                System.out.print("Programa inválido, digite novamente: ");
                programa = scan.nextInt();
            }

            if (programa == 1) {
                while (fecharPrograma.equals("n") || fecharPrograma.equals("N")) {
                    double numero1, numero2;
                    System.out.println("---------- CALCULADORA ----------");
                    System.out.print("Digite o 1º numero: ");
                    numero1 = scan.nextDouble();
                    System.out.print("Digite o 2º numero: ");
                    numero2 = scan.nextDouble();
                    Calculadora.soma(numero1, numero2);
                    Calculadora.subtracao(numero1, numero2);
                    Calculadora.divisao(numero1, numero2);
                    Calculadora.multiplicacao(numero1, numero2);

                    System.out.print("Deseja encerrar a aplicação CALCULADORA? S/N: ");
                    fecharPrograma = scan.next();
                }
            }

            if (programa == 2) {
                while (fecharPrograma.equals("n") || fecharPrograma.equals("N")) {

                    int hora;
                    System.out.println("---------- HORÁRIO ----------");
                    System.out.print("Digite a hora (formato 24H): ");
                    hora = scan.nextInt();
                    while (hora > 24 || hora <= 0) {

                        System.out.print("Horario incorreto! Digite novamente: ");
                        hora = scan.nextInt();
                    }
                    Horario.obterHora(hora);
                    System.out.print("Deseja encerrar a aplicação HORÁRIO? S/N: ");
                    fecharPrograma = scan.next();
                }
            }

            if (programa == 3) {
                while (fecharPrograma.equals("n") || fecharPrograma.equals("N")) {
                    double valor;
                    double parcelas;
                    System.out.println("---------- EMPRÉSTIMO ----------");
                    System.out.print("Digite o valor que deseja fazer empréstimo: ");
                    valor = scan.nextDouble();
                    Emprestimo.obterValor(valor);
                    System.out.print("Digite o número de parcelas: ");
                    parcelas = scan.nextDouble();
                    Emprestimo.obterJuros(parcelas);
                    Emprestimo.calculo(valor, parcelas);
                    System.out.print("Deseja encerrar a aplicação EMPRÉTIMO? S/N: ");
                    fecharPrograma = scan.next();

                }
            }
            System.out.print("Deseja encerrar a aplicação? S/N: ");
            fecharPrograma = scan.next();

        } while (fecharPrograma.equals("n") || fecharPrograma.equals("N"));
        scan.close();
    }
}
