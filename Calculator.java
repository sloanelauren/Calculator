import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 whole numbers.");

        float x = sc.nextFloat();
        float x1 = sc.nextFloat();

        System.out.println("Would you like to preform addition(1), subtraction(2), multiplication(3), or divsion(4)");
        int x2 = sc.nextInt();

        if (x2 == 1) {
            System.out.println("The two whole numbers added together equals " + (x + x1));  
        } else if (x2 == 2) {
            System.out.println("The two whole numbers subtracted equals " + (x - x1));
        } else if (x2 == 3) {
            System.out.println("The two whole numbers multiplied equals " + (x * x1));
        } else if (x2 == 4) {
            if(x1 == 0) {
                System.out.println("Error: Divide by Zero");
            } else {
            System.out.println("The two whole numbers divided equals " + (x / x1));
            }
        } else {
            System.out.println("You did not enter the right input.");
        }

    }
}