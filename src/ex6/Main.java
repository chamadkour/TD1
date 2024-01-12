package ex6;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer la première valeur entière (A) :");
        int A = scanner.nextInt();

        System.out.println("Veuillez entrer la deuxième valeur entière (B) :");
        int B = scanner.nextInt();

        char signe;
        if (A > 0 && B > 0) {
            signe = '+';
        } else if (A < 0 && B < 0) {
            signe = '+';
        } else {
            signe = '-';
        }

        System.out.println("Le signe du produit de A et B est : " + signe);

        scanner.close();
    }
}