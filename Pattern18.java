public class Pattern18 {
    public static void main(String[] args) {
        int n = 5;
        printTriangle(n);
    }

    static void printTriangle(int n) {
        char startChar = (char) ('A' + n - 1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (startChar - j) + " ");
            }
            System.out.println();
        }

    }
}
