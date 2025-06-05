import java.util.Scanner;

public class Main {

    // Métodos estáticos para cada operação
    public static double somar(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Divisão por zero não é permitida.");
            return Double.NaN;
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        double num1 = 0, num2 = 0;

        do {
            // Menu
            System.out.println("Escolha uma operação:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");
            System.out.print("Digite o número da operação: ");
            escolha = scanner.nextInt();

            if (escolha >= 1 && escolha <= 4) {
                // Lê os números apenas se a operação for válida
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextDouble();
            }

            switch (escolha) {
                case 1:
                    System.out.println("Resultado da soma: " + somar(num1, num2));
                    break;
                case 2:
                    System.out.println("Resultado da subtração: " + subtrair(num1, num2));
                    break;
                case 3:
                    System.out.println("Resultado da multiplicação: " + multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println("Resultado da divisão: " + dividir(num1, num2));
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 5);

        scanner.close();
    }
}
