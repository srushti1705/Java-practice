public class minBetweenThree {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 40;

        int min = 0;

        if (num1 < num2 && num1 < num3) {
            min = num1;
        } else if (num2 < num1 && num2 < num3) {
            min = num2;
        } else {
            min = num3;
        }
        System.out.println("Minimum number is: " + min);
    }
}
