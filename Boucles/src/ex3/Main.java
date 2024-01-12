package ex3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int indexMax = -1;

        for (int i = 0; i < 20; i++) {
            System.out.println("Veuillez entrer le nombre " + (i + 1) + " :");
            int number = scanner.nextInt();

            if (number > max) {
                max = number;
                indexMax = i;
            }
        }

        System.out.println("Le maximum de ces 20 nombres est : " + max);
        System.out.println("Et ce nombre a été saisi à la position : " + (indexMax + 1));

        scanner.close();
    }
}