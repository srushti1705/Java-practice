import java.util.Scanner;

public class majorityElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int sizeOfArray = sc.nextInt();

        int arr[] = new int[sizeOfArray];
        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int majorityElement = -1;

        for(int i=0; i < sizeOfArray; i++) {
            count = 0;
            for(int j=0; j < sizeOfArray; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count > sizeOfArray / 2) {
                majorityElement = arr[i];
                break;
            }
        }
        if(majorityElement == -1) {
            System.out.println("There is no majority element in the array.");
        } else {
        System.out.println("The majority element is: " + majorityElement);
        }
    }
}
