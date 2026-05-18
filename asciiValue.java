import java.util.Scanner;

public class asciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char character = sc.next().charAt(0);
        int asciiValue = (int) character;

        System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);
    }
}
