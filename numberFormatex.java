import java.util.Scanner;

public class numberFormatex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter your account number: ");
            String accNo = sc.nextLine();
            int accountNumber = Integer.parseInt(accNo);
            System.out.println("Valid account number entered: " + accountNumber);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid account number format. Please enter a valid integer.");
        } 
}
}
