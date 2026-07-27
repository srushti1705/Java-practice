import java.util.Scanner;

public class searchElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        System.out.println("Enter elements of Array: ");

        for(int i=0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to search: ");
        int num = sc.nextInt();

        boolean found = false;

        for(int i=0; i < arr.length; i++) {
            if (arr[i] == num) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number Found!");
        }
        else {
            System.out.println("Number not found.");
        }
    }}
