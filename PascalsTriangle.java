public class PascalsTriangle {
    public static void printPascal(int n) {
        for (int i = 0; i < n; i++) {
            // Print spaces for alignment
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print(" ");
            }

            int num = 1; // First element in every row is always 1

            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                
                // Update num for the next position in the row
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 5;
        printPascal(rows);
    }
}
