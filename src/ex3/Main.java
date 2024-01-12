package ex3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer le premier nombre entier a :");
        int a = scanner.nextInt();

        System.out.println("Veuillez entrer le deuxième nombre entier b :");
        int b = scanner.nextInt();

        int somme = a + b;
        int produit = a * b;

        System.out.println("Choisissez une option parmi les suivantes :");
        System.out.println("1. Savoir si la somme a + b est paire");
        System.out.println("2. Savoir si le produit ab est pair");
        System.out.println("3. Connaître le signe de la somme a + b");
        System.out.println("4. Connaître le signe du produit ab");

        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                if (somme % 2 == 0) {
                    System.out.println("La somme a + b est paire.");
                } else {
                    System.out.println("La somme a + b n'est pas paire.");
                }
                break;
            case 2:
                if (produit % 2 == 0) {
                    System.out.println("Le produit ab est paire.");
                } else {
                    System.out.println("Le produit ab n'est pas paire.");
                }
                break;
            case 3:
                if (somme > 0) {
                    System.out.println("Le signe de la somme a + b est positif.");
                } else if (somme < 0) {
                    System.out.println("Le signe de la somme a + b est négatif.");
                } else {
                    System.out.println("Le signe de la somme a + b est zéro.");
                }
                break;
            case 4:
                if (produit > 0) {
                    System.out.println("Le signe du produit ab est positif.");
                } else if (produit < 0) {
                    System.out.println("Le signe du produit ab est négatif.");
                } else {
                    System.out.println("Le signe du produit ab est zéro.");
                }
                break;
            default:
                System.out.println("Option invalide. Veuillez réessayer.");
                break;
        }

        scanner.close();
    }
}
