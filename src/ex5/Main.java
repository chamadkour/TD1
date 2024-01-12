package ex5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez la langue : (f) pour français et (a) pour anglais");
        char langue = scanner.next().charAt(0);

        System.out.println("Veuillez entrer l'heure :");
        int heure = scanner.nextInt();

        String message;
        if (langue == 'f') {
            if (heure >= 0 && heure < 18) {
                message = "Bonjour";
            } else if (heure >= 18 && heure < 22) {
                message = "Bonsoir";
            } else {
                message = "Bonne nuit";
            }
        } else {
            if (heure >= 0 && heure < 18) {
                message = "Good Morning";
            } else if (heure >= 18 && heure < 22) {
                message = "Good Evening";
            } else {
                message = "Good Night";
            }
        }

        System.out.println(message);

        scanner.close();
    }
}
