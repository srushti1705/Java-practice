import java.util.Scanner;

public class typeofTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int first, second, third;

        System.out.println("Enter first angle: ");
        first = sc.nextInt();

        System.out.println("Enter second angle: ");
        second = sc.nextInt();

        System.out.println("Enter third angle: ");
        third = sc.nextInt();

        if (first + second + third == 180) {
            if (first == second && second == third) {
                System.out.println("Equilateral triangle");
            }
            else if (first == second || second == third || first == third) {
                System.out.println("Isosceles triangle");
            }
            else {
                System.out.println("Scalene triangle");
            }
        }
    }
}