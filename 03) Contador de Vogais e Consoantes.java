import java.util.Scanner;

public class ContadorVogaisConsoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase();

        int vogais = 0;
        int consoantes = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c >= 'a' && c <= 'z') { // verifica se é uma letra
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vogais++;
                } else {
                    consoantes++;
                }
            }
        }

        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);

        scanner.close();
    }
}
