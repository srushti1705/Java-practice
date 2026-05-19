import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reverse;

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        reverse = (num % 10) * 100 + ((num / 10) % 10) * 10 + (num / 100);

        System.out.println("Reverse number: " + reverse);
    }
}
