import java.io.*;
import java.util.*;

public class day19_ques1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N / 2; i++) {
            for (int j = 0; j < N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[N - 1 - i][j];
                matrix[N - 1 - i][j] = temp;

            }
        }
        for (int i = 0; i < N; i++) {
            int left = 0;
            int right = N - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + "\t ");
            }
            System.out.println();
        }

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}