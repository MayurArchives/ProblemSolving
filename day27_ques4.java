import java.util.Scanner;

public class day27_ques4 {

    public static void searchMatrix(int[][] matrix, int x) {
        int m = matrix.length; // Number of rows
        int n = matrix[0].length; // Number of columns

        // Brute force search: iterate over all rows and columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == x) {
                    // If we find the element, print its position
                    System.out.println(i);
                    System.out.println(j);
                    return;
                }
            }
        }

        // If the element is not found
        System.out.println("Not Found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions of the matrix
        int m = sc.nextInt();
        int n = sc.nextInt();

        // Input matrix elements
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Input the element to search
        int x = sc.nextInt();

        // Calling the function to search for the element
        searchMatrix(matrix, x);

        sc.close();
    }
}
