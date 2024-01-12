package ex8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer le numéro du mois :");
        int month = scanner.nextInt();

        System.out.println("Veuillez entrer l'année :");
        int year = scanner.nextInt();

        int nbJours = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                nbJours = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                nbJours = 30;
                break;
            case 2:
                if (anneeBisextile(year)) {
                    nbJours = 29;
                } else {
                    nbJours = 28;
                }
                break;
            default:
                System.out.println("Mois invalide");
                return;
        }

        System.out.println("Le mois " + month + " " + year + " contient " + nbJours + " jours");

        scanner.close();
    }

    public static boolean anneeBisextile(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
