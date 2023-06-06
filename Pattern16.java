public class Pattern16 {
    public static void main(String[] args) {
        int n = 5;
        printTriangle(n);

    }

    static void printTriangle(int n) {

        for (int i = 1; i <= n; i++) {
            char ch = (char) ('A' + i - 1);
            for (int j = 0; j < i; j++) {

                System.out.print(ch + "");
            }
            System.out.println();
        }
    }
}
