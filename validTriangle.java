import java.util.Scanner;

public class validTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int first, second, third;

		System.out.println("Enter first angle: ");
		first = sc.nextInt();

		System.out.println("Enter second angle: ");
		second = sc.nextInt();

		System.out.println("Enter third angle: ");
		third = sc.nextInt();

		if (first + second + third == 180) {
			System.out.println("Valid triangle"); 
		} 
		else {
			System.out.println("Invalid triangle");
		}
	}
}
