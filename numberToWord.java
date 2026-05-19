import java.util.Scanner;

public class numberToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number (1-5): ");
        int number = sc.nextInt();

        String word;

        switch (number) {
            case 1:
                word = "One";
                break;
            case 2:
                word = "Two";
                break;
            case 3:
                word = "Three";
                break;
            case 4:
                word = "Four";
                break;
            case 5:
                word = "Five";
                break;
            default:
                word = "Invalid number";
        }
        System.out.println("The number in words is: " + word);
        sc.close();
    }
}
