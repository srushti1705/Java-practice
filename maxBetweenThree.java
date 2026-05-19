public class maxBetweenThree {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 40;

        int max = 0;

        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }
        System.out.println("Maximum number is: " + max);
    }
}