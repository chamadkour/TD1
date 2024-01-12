package ex10;
public class Main {

    public static void main(String[] args) {
        for (int nb = 100; nb <= 999; nb++) {
            if (isCubic(nb)) {
                System.out.println(nb);
            }
        }
    }

    public static boolean isCubic(int nb) {
        int somme = 0;
        while (nb > 0) {
            int digit = nb % 10;
            somme += digit * digit * digit;
            nb /= 10;
        }
        return somme == somme;
    }
}