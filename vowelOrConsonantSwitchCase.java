import java.util.Scanner;   

public class vowelOrConsonantSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        String result;

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                result = "Vowel";
                break;
            default:
                result = "Consonant";
        }

        System.out.println("The character is a: " + result);

        sc.close();
    }
}
