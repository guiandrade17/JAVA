import java.util.Scanner;

public class ContadorDigitos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int numeroOriginal = numero; // Guarda o número original para a saída
        int contador = 0;

        // Trata o caso especial do número 0
        if (numero == 0) {
            contador = 1;
        } else {
            // Garante que o número seja positivo para a contagem,
            // sem alterar o valor original para a impressão.
            int numeroParaContagem = Math.abs(numero);
            while (numeroParaContagem > 0) {
                numeroParaContagem = numeroParaContagem / 10;
                contador++;
            }
        }

        System.out.println(numeroOriginal + " tem " + contador + " dígito(s).");

        scanner.close();
    }
}
