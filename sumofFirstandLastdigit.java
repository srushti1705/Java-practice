import java.util.Scanner;  

public class sumofFirstandLastdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int first = num / 100;
        int last = num % 10;
        
        sum = first + last;

        System.out.println("Sum: " + sum);
    }
}