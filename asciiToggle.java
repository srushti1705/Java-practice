import java.util.Scanner;

public class asciiToggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char inputChar = sc.next().charAt(0);
        char toggledChar;

        if (inputChar >= 'a' && inputChar <= 'z') {
            toggledChar = (char) (inputChar - ('a' - 'A'));
        } else if (inputChar >= 'A' && inputChar <= 'Z') {
            toggledChar = (char) (inputChar + ('a' - 'A'));
        } else {
            System.out.println("Invalid input. Please enter an alphabetic character.");
            return;
        }
        System.out.println("Toggled character: " + toggledChar);
    }
}
