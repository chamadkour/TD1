package ex2;

public class Main {

    public static void main(String[] args) {
        double a = 1;
        double b = 5;
        double c = 6;

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("This equation has no real solution");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("The solutions are x1 = x2 = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The solutions are x1 = " + x1 + " and x2 = " + x2);
        }
    }
}
