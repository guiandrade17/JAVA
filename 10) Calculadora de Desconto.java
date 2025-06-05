import java.util.Scanner;
import java.text.DecimalFormat; // Para formatar a saída monetária

public class CalculadoraDesconto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Define um formato para duas casas decimais (padrão monetário)
        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.print("Digite o valor do produto: R$");
        double valorOriginal = scanner.nextDouble();

        double percentualDesconto = 0.0;
        double valorDesconto = 0.0;
        double valorFinal;

        if (valorOriginal > 200) {
            percentualDesconto = 0.20; // 20%
        } else if (valorOriginal > 100) {
            percentualDesconto = 0.10; // 10%
        }
        // Se não entrar em nenhum if/else if, percentualDesconto permanece 0.0

        valorDesconto = valorOriginal * percentualDesconto;
        valorFinal = valorOriginal - valorDesconto;

        System.out.println("\n--- Recibo ---");
        System.out.println("Valor original: R$" + df.format(valorOriginal));

        if (percentualDesconto > 0) {
            System.out.println("Desconto: " + (int)(percentualDesconto * 100) + "% (R$" + df.format(valorDesconto) + ")");
        } else {
            System.out.println("Desconto: Sem desconto aplicável.");
        }

        System.out.println("Valor final: R$" + df.format(valorFinal));

        scanner.close();
    }
}
