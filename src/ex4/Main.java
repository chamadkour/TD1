package ex4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer la moyenne de l'étudiant :");
        double moyenne = scanner.nextDouble();

        String mention;
        if (moyenne >= 16) {
            mention = "T. Bien";
        } else if (moyenne >= 14) {
            mention = "Bien";
        } else if (moyenne >= 12) {
            mention = "A. Bien";
        } else if (moyenne >= 10) {
            mention = "Passable";
        } else {
            mention = "Insuffisant";
        }

        System.out.println("La mention correspondante est : " + mention);

        scanner.close();
    }
}