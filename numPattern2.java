public class numPattern2 {
    public static void main(String[] args) {
        int i, j;

        for (i=1; i <= 7; i++) {
            for (j=1; j <= 8-i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
