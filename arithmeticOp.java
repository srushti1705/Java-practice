import java.util.Scanner;

public class arithmeticOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First number: ");
        int num1 = sc.nextInt();

        System.out.println("Second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = (double) num1 / num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
