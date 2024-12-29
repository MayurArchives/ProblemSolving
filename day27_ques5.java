import java.util.Scanner;

public class day27_ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the matrix size
        int m = sc.nextInt();
        int n = sc.nextInt();

        // Read the matrix
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int maxOnes = -1;
        int rowIndex = -1;

        // Iterate through each row
        for (int i = 0; i < m; i++) {
            int countOnes = 0;

            // Count 1's in the current row
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    countOnes++;
                }
            }

            // Update the row with the maximum 1's
            if (countOnes > maxOnes) {
                maxOnes = countOnes;
                rowIndex = i;
            }
        }

        // If no 1's found in any row
        if (maxOnes == 0) {
            System.out.println(-1);
        } else {
            // Print the row with maximum 1's
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[rowIndex][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
