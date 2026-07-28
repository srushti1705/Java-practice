import java.util.Scanner;

public class arrayIndexOutOfBoundsex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = {90, 85, 87, 90, 86};

        System.out.print("Enter the index of the marks you want to access: ");
        int index = sc.nextInt();

        try {
            System.out.println("Marks at index " + index + ": " + marks[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index + " is out of bounds. Please enter a valid index between 0 and " + (marks.length - 1) + ".");
        }
    }
}
