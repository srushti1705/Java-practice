public class allAsciicharacters {
    public static void main(String[] args) {
        char ch = 0;

        while (ch <= 127) {
            System.out.println(ch + " : " + (int) ch);
            ch++;
        }
    }
}
