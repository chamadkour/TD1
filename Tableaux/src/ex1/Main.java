package ex1;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[] T = {3, 5, 2, 10, 7};
        int min = Arrays.stream(T).min().getAsInt();
        int max = Arrays.stream(T).max().getAsInt();
        System.out.println("Valeur minimale: " + min);
        System.out.println("Valeur maximale: " + max);
    }
}
