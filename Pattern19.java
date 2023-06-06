public class Pattern19 {
    public static void main(String[] args) {
        int n = 5;
        printTriangle(n);
    }

    static void printTriangle(int n) {
        int iniS = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            iniS += 2;
            System.out.println();
        }
        iniS = 2 * n - 2;
        for (int i = 1; i <= n; i++) {

            // for printing the stars in the row.
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // for printing the spaces in the row.
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }

            // for printing the stars in the row.
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            iniS -= 2;
            System.out.println();
        }
    }
}
