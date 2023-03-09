import java.text.DecimalFormat;

public class Emprestimo {

    public static double obterJuros(double parcelas) {
        double juros = 0.15;
        if (parcelas > 1) {
            juros = 0.15 * parcelas;
        }
        return juros;
    }

    public static void obterValor(double valor) {
        System.out.println("O valor do emprestimo será: " + valor);
    }

    public static void calculo(double valor, double juros) {
        DecimalFormat formatador = new DecimalFormat("0.00");
        double valorFinal = valor + (valor * obterJuros(juros));
        System.out.println("O valor do juros sera: " + formatador.format((obterJuros(juros)))
                + "% (Correspondente a 0.15% x " + juros + " de parcelas)");
        System.out.println("O valor total do emprestimo será: " + valorFinal);

    }
}
