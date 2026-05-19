import java.util.Scanner;

public class commission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sales amount: ");
        double salesAmount = sc.nextDouble();

        double commission = 0;

        if (salesAmount < 5000) {
            commission = salesAmount * 0.02;
        } else if (salesAmount >= 5000 && salesAmount < 10000) {
            commission = salesAmount * 0.05;
        } else {
            commission = salesAmount * 0.1;
        }

        System.out.println("Commission: " + commission);
    }
}
