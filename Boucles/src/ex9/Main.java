package ex9;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre entier : ");
        int nb = scanner.nextInt();

        int somme = 0;
        while (nb > 0) {
            int digit = nb % 10;
            somme += digit;
            nb /= 10;
        }

        System.out.println("La somme des chiffres du nombre entier est : " + somme);

        scanner.close();
    }
}
