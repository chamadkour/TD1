package ex4;

public class Main {

    public static void main(String[] args) {
        int a = 32;
        int b = 12;

        int pgcd = euclide(a, b);

        System.out.println("Le PGCD de " + a + " et " + b + " est : " + pgcd);
    }

    public static int euclide(int a, int b) {
        if (b == 0) {
            return a;
        }

        return euclide(b, a % b);
    }
}
