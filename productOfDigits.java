import java.util.Scanner;

public class productOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		int product = 1;

		while (num > 0) {
			int i = num % 10;
			product = product * i;
			num = num / 10;
		}
		System.out.println("Product of digits: " + product);
	}
}