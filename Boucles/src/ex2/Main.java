package ex2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer un entier naturel N :");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Erreur: N doit être un entier naturel.");
        } else {
            long sommeImpairs = 0;
            for (int i = 2; i < n; i += 2) {
                sommeImpairs += i;
            }
            System.out.println("La somme des entiers impairs inferieurs à " + n + " est : " + sommeImpairs);
        }

        scanner.close();
    }
}
