package ex9;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer la première variable :");
        int a = scanner.nextInt();

        System.out.println("Veuillez entrer la deuxième variable :");
        int b = scanner.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Les variables dans l'ordre croissant sont : " + a + " et " + b);

        scanner.close();
    }
}