import java.util.*;

public class day9_ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the array
        int n = sc.nextInt();

        // Input the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the function to get the rank array and print the result
        int[] result = arrayRankTransform(arr);
        for (int rank : result) {
            System.out.print(rank + " ");
        }
    }

    public static int[] arrayRankTransform(int[] arr) {
        // Copy the array to preserve original order
        int[] sortedArr = arr.clone();

        // Sort the copied array
        Arrays.sort(sortedArr);

        // Create a map to store the rank of each element
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        // Assign ranks to the sorted elements
        for (int num : sortedArr) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        // Replace elements with their ranks in the original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rankMap.get(arr[i]);
        }

        return arr;
    }
}
