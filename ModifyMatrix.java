import java.util.Scanner;

public class ModifyMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input dimensions
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        // Input matrix
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Arrays to track rows and columns to update
        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        // First pass: Identify rows and columns to set to 1
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // Second pass: Update the matrix based on rows and columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i] || cols[j]) {
                    matrix[i][j] = 1;
                }
            }
        }

        // Output the modified matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
