public class totalNotes {
    public static void main(String[] args) {
        int amount = 2528;

        int notes500 = amount / 500;
        amount = amount % 500;

        int notes200 = amount / 200;
        amount = amount % 200;

        int notes100 = amount / 100;
        amount = amount % 100;

        int notes50 = amount / 50;
        amount = amount % 50;

        int notes20 = amount / 20;
        amount = amount % 20;

        int notes10 = amount / 10;
        amount = amount % 10;

        int notes5 = amount / 5;
        amount = amount % 5;

        int notes2 = amount / 2;
        amount = amount % 2;

        int notes1 = amount / 1;
        amount = amount % 1;

        System.out.println("Number of 500 notes: " + notes500);
        System.out.println("Number of 200 notes: " + notes200);
        System.out.println("Number of 100 notes: " + notes100);
        System.out.println("Number of 50 notes: " + notes50);
        System.out.println("Number of 20 notes: " + notes20);
        System.out.println("Number of 10 notes: " + notes10);
        System.out.println("Number of 5 notes: " + notes5);
        System.out.println("Number of 2 notes: " + notes2);
        System.out.println("Number of 1 notes: " + notes1);

    }
}
