import java.util.Scanner;

public class substraction{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Subtraction
        double difference = num1 - num2;

        // Output result
        System.out.println("The difference between " + num1 + " and " + num2 + " is: " + difference);

        // Close scanner
        scanner.close();
    }
}
