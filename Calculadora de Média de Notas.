import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        // Lê as 4 notas
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / 4;

        // Classificação da média
        System.out.print("Média: " + media + " → ");

        if (media >= 9) {
            System.out.println("Excelente!");
        } else if (media >= 7) {
            System.out.println("Bom!");
        } else if (media >= 5) {
            System.out.println("Razoável.");
        } else {
            System.out.println("Precisa melhorar.");
        }

        scanner.close();
    }
}
