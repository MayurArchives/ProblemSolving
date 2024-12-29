import java.util.Scanner;

public class day27_ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        // Input matrix elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Step 1: Get the first row as reference
        int[] firstRow = matrix[0];

        // Step 2: Check each row for circular rotation
        for (int i = 1; i < n; i++) {
            if (!isCircularRotation(firstRow, matrix[i], n)) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }

    // Helper function to check if two rows are circular rotations of each other
    private static boolean isCircularRotation(int[] row1, int[] row2, int n) {
        for (int shift = 0; shift < n; shift++) {
            boolean isMatch = true;
            for (int j = 0; j < n; j++) {
                if (row1[j] != row2[(j + shift) % n]) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                return true;
            }
        }
        return false;
    }
}
