import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // de 1 a 100
        int tentativa;
        boolean acertou = false;

        System.out.println("🔐 Jogo de Adivinhação - Você tem 5 tentativas!");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Tentativa " + i + "/5: Digite um palpite: ");
            tentativa = scanner.nextInt();

            if (tentativa == numeroSecreto) {
                System.out.println("🎉 Você venceu! O número era " + numeroSecreto + ".");
                acertou = true;
                break;
            } else if (tentativa < numeroSecreto) {
                System.out.println("Dica: O número é MAIOR que " + tentativa + ".");
            } else {
                System.out.println("Dica: O número é MENOR que " + tentativa + ".");
            }
        }

        if (!acertou) {
            System.out.println("💀 Game Over! O número era " + numeroSecreto + ".");
        }

        scanner.close();
    }
}
