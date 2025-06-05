import java.util.Scanner;

public class CaixaEletronicoCedulasMinimas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em R$: ");
        int valor = scanner.nextInt();

        System.out.println("\nPara sacar R$" + valor + ", você receberá:");

        // Array com os valores das cédulas disponíveis, em ordem decrescente
        int[] cedulas = {100, 50, 20, 10, 5, 2};
        int valorRestante = valor;

        for (int cedula : cedulas) {
            if (valorRestante >= cedula) {
                int quantidadeCedulas = valorRestante / cedula; // Divisão inteira
                System.out.println(quantidadeCedulas + " nota(s) de R$" + cedula);
                valorRestante = valorRestante % cedula; // Resto da divisão
            }
        }

        // Se sobrar algum valor que não pode ser formado pelas cédulas (ex: R$1)
        if (valorRestante > 0) {
            System.out.println("\nNão foi possível sacar R$" + valorRestante + " com as cédulas disponíveis.");
            System.out.println("Verifique o valor ou tente um valor que possa ser formado com notas de 100, 50, 20, 10, 5 e 2.");
        }

        scanner.close();
    }
}
