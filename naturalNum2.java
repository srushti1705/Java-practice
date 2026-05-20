import java.util.Scanner;

public class naturalNum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int i = num;

        while (i > 0) { 
            System.out.println(i);
            i--;
        }
    }
}
