package ex5;

public class Main {

    public static void main(String[] args) {
        int n = 5;

        int fibonacci = fibonacci(n);

        System.out.println("Le " + n + "ème terme de la suite est : " + fibonacci);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}