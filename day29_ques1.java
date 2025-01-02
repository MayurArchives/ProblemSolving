import java.util.*;

public class day29_ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of elements in the array
        int N = sc.nextInt();

        // Input: Range [L, R]
        int L = sc.nextInt();
        int R = sc.nextInt();

        // Input: Array elements
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 1: Create a set for the range [L, R]
        Set<Integer> rangeSet = new HashSet<>();
        for (int i = L; i <= R; i++) {
            rangeSet.add(i);
        }

        // Step 2: Create a set for the array elements
        Set<Integer> arraySet = new HashSet<>();
        for (int num : arr) {
            arraySet.add(num);
        }

        // Step 3: Find missing elements by subtracting arraySet from rangeSet
        rangeSet.removeAll(arraySet);

        // Step 4: Output the result
        if (rangeSet.isEmpty()) {
            System.out.println("-1");
        } else {
            // Convert set to a list and sort it for output
            List<Integer> missingNumbers = new ArrayList<>(rangeSet);
            Collections.sort(missingNumbers);
            for (int num : missingNumbers) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}
