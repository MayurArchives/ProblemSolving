import java.util.*;

public class day34_ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Size of the array
        int N = sc.nextInt();

        // Input: Array elements
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Input: Dimensions of the 2D array (p, q)
        int p = sc.nextInt();
        int q = sc.nextInt();

        // Initialize the 2D array
        int[][] result = new int[p][q];

        // Fill the 2D array with elements from the 1D array
        int index = 0; // To track the position in the 1D array
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                result[i][j] = arr[index++];
            }
        }

        // Print the 2D array
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
