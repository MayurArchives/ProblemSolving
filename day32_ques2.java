import java.util.*;

public class day32_ques2 {
    public static List<Integer> kWeakestRows(int[][] mat, int k) {
        List<int[]> soldierCount = new ArrayList<>();

        // Step 1: Count the number of soldiers in each row
        for (int i = 0; i < mat.length; i++) {
            int soldierCountInRow = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1)
                    soldierCountInRow++;
                else
                    break; // Stop counting as soon as we encounter a 0
            }
            soldierCount.add(new int[] { soldierCountInRow, i });
        }

        // Step 2: Sort based on number of soldiers, and then by row index
        soldierCount.sort((a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]); // If soldiers are the same, compare row index
            }
            return Integer.compare(a[0], b[0]); // Compare number of soldiers
        });

        // Step 3: Collect the indices of the k weakest rows
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(soldierCount.get(i)[1]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read inputs
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Call the function to get the k weakest rows
        List<Integer> result = kWeakestRows(mat, k);

        // Output the result
        for (int idx : result) {
            System.out.print(idx + " ");
        }
    }
}
