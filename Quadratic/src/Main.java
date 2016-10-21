import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("a= ");
        int a = scanner.nextInt();

        System.out.print("b= ");
        int b = scanner.nextInt();

        System.out.print("c= ");
        int c = scanner.nextInt();

//        System.out.println("a=" + a + ", b=" + b + ", c=" + c);

        double root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("root 1=" + root1);
        System.out.println("root 2=" + root2);
    }
}
