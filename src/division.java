import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input numbers
            System.out.print("Enter the first number (numerator): ");
            double numerator = scanner.nextDouble();

            System.out.print("Enter the second number (denominator): ");
            double denominator = scanner.nextDouble();

            // Check for division by zero
            if (denominator == 0) {
                System.out.println("Error: Division by zero is not allowed.");
            } else {
                // Perform division
                double result = numerator / denominator;
                System.out.println("Result: " + result);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } finally {
            scanner.close();
        }
    }
}
