import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int secretPinCode = 7567;
        int pinCode = -1;

        Scanner scanner = new Scanner(System.in); // lecture des données depuis la console
        while (pinCode != secretPinCode) { // le cycle entre demarre avec la NON compatibilité du mot de passe
            if (pinCode == -1) {
                System.out.println("Entrez le mot de passe:");
            } else {
                System.out.println("Erreur de mot de passe. Essayez encore:");
            }
            pinCode = scanner.nextInt();
        }

        System.out.println("Mot de passe correct!");
    }
}
