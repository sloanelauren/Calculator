import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 whole numbers.");

        int x = sc.nextInt();
        int x1 = sc.nextInt();

        System.out.println("The two whole numbers added together equals " + (x + x1));
    }
}