import java.util.Scanner;

public class deleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int sizeOfArray = sc.nextInt();

        int arr[] = new int[sizeOfArray];
        System.out.println("Enter elements in an array: ");

        for(int i=0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to be deleted: ");
        int num = sc.nextInt();

        int index = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == num) {
                index = i;
                break;
            }
        }

        if(index == -1) {
            System.out.println("Element not found in the array.");
        } else {
            for(int i=index; i<arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            System.out.println("Array after deleting the element: ");
            for(int i=0; i<arr.length-1; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        
    }
}
