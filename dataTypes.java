import java.util.Scanner;
public class dataTypes {
	public static  void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
        String str = sc.nextLine();

		System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Enter a decimal number: ");
        double decimalNum = sc.nextFloat();

        System.out.println("Enter a boolean value (true/false): ");
        boolean boolValue = sc.nextBoolean();

        System.out.println("You entered the string: " + str);
        System.out.println("You entered the number: " + num);
        System.out.println("You entered the decimal number: " + decimalNum);
        System.out.println("You entered the boolean value: " + boolValue);
    }
}
		