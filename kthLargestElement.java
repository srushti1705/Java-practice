import java.util.Scanner;

public class kthLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        System.out.println("Enter elements in an array: ");

        for(int i=0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        for(int i=0; i < arr.length; i++) {
            for(int j=i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        
        }
        System.out.println("The " + num + " largest element is: " + arr[num-1]);
    }
}
