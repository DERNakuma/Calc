import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Multiplication
        double product = num1 * num2;

        // Output result
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);

        // Close scanner
        scanner.close();
    }
}
