import java.util.Scanner;

public class missingElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        System.out.println("Enter elements of an Array: ");

        for(int i=0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Missing elements in the array: ");
        for(int i=arr[0]; i < arr[arr.length-1]; i++) {
            boolean found = false;
            for(int j=0; j < arr.length; j++) {
                if(arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                System.out.print(i + " ");
            }
        }
    }
}
