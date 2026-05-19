import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter years of service: ");
        int yearsOfService = sc.nextInt();

        System.out.println("Enter salary: ");
        double salary = sc.nextDouble();

        double bonus = 0;

        if (yearsOfService > 5) {
            bonus = salary * 0.05;
            System.out.println("Bonus: " + bonus);
        } else {
            System.out.println("No bonus");
        }
    }
}
