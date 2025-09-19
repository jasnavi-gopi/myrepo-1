import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number to find its factorial: ");
        int n = scanner.nextInt();

        // Calculate factorial
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        // Output result
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}