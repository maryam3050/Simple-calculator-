import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simple Calculator!");
        System.out.println("Choose an operation:");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");

        int choice = scanner.nextInt();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result;

        if (choice == 1) {
            result = num1 + num2;
            System.out.println("The result is: " + result);
        } else if (choice == 2) {
            result = num1 - num2;
            System.out.println("The result is: " + result);
        } else if (choice == 3) {
            result = num1 * num2;
            System.out.println("The result is: " + result);
        } else if (choice == 4) {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("The result is: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed!");
            }
        } else {
            System.out.println("Invalid choice. Please restart and choose a valid option.");
        }

        scanner.close();
    }
}