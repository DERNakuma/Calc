import java.util.Scanner;

public class smallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Find the smallest number
        double smallest = (num1 < num2) ? num1 : num2;

        // Output result
        System.out.println("The smallest number between " + num1 + " and " + num2 + " is: " + smallest);

        // Close scanner
        scanner.close();
    }
}
