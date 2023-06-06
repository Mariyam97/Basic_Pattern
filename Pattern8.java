public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
        printTriangle(n);

    }

    static void printTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
