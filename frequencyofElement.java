import java.util.Scanner;

public class frequencyofElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        System.out.println("Enter elements of an Array: ");
        for(int i=0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Frequency of elements in the array: ");
        for(int i=0; i < arr.length; i++) {
            int count = 1;
            boolean counted = false;

            for(int j=0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    counted = true;
                    break;
                }
            }

            if(!counted) {
                for(int k=i+1; k < arr.length; k++) {
                    if(arr[i] == arr[k]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + " occurs " + count + " times");
            }
        }
    }
}
