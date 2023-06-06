public class Pattern17 {
    public static void main(String[] args) {
        int n = 5;
        printTriangle(n);
    }

    static void printTriangle(int n) {
        // Outer loop for the number of rows.
        for (int i = 0; i < n; i++) {

            // Print spaces before characters.
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print characters.
            char ch = 'A';
            int breakpoint = i;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }

            // Move to the next line.
            System.out.println();
        }
    }

}
