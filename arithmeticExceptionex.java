import java.util.Scanner;

public class arithmeticExceptionex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first, second, result;

        System.out.print("Enter first number: ");
        first = sc.nextInt();

        System.out.print("Enter second number: ");
        second = sc.nextInt();

        try {
            result = first / second;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
