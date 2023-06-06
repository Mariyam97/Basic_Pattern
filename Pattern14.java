public class Pattern14 {
    public static void main(String[] args) {
        int n = 5;
        printTriangle(n);
    }

    static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                char ch = (char) ('A' + j);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
