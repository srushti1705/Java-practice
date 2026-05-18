import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);	

        int sum_of_angles = 180;
        
        System.out.println("Enter first angle of a triangle: ");
        int first_angle = sc.nextInt();

        System.out.println("Enter second angle of a triangle: ");
        int second_angle = sc.nextInt(); 

        int sum = first_angle + second_angle;
        
        int third_angle = sum_of_angles - sum;
        System.out.println("The third angle is: " + third_angle);
    }
}