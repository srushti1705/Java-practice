import java.util.Scanner;

public class armstrongNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int temp = num;
        int digits = 0;
        int sum = 0;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp = temp / 10;
        }

        // Check Armstrong number
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong Number");
        } else {
            System.out.println(originalNum + " is not an Armstrong Number");
        }

        sc.close();
    }
}