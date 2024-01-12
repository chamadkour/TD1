package ex10;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la taille de la matrice: ");
        int size = scanner.nextInt();

        double[][] matrix1 = new double[size][size];
        double[][] matrix2 = new double[size][size];

        System.out.println("Entrez les éléments de la première matrice:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix1[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Entrez les éléments de la deuxième matrice:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix2[i][j] = scanner.nextDouble();
            }
        }

        double[][] sumMatrix = new double[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("La somme des deux matrices est:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}