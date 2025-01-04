import java.util.*;

public class day31_ques3 {

    public static int maxDiamonds(int N, int K, int[] bags) {
        // Using a PriorityQueue to simulate a max-heap by negating the values
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add all bag values to the max-heap
        for (int i = 0; i < N; i++) {
            maxHeap.add(bags[i]);
        }

        int totalDiamonds = 0;

        // For K minutes (operations)
        for (int i = 0; i < K; i++) {
            // Get the bag with the maximum diamonds
            int maxDiamonds = maxHeap.poll();

            // If the max diamonds are 0, break early
            if (maxDiamonds == 0) {
                break;
            }

            // Add the diamonds to the total
            totalDiamonds += maxDiamonds;

            // After dropping the bag, its new value will be floor(maxDiamonds / 2)
            int newDiamonds = maxDiamonds / 2;

            // Push the new number of diamonds back into the max-heap
            maxHeap.add(newDiamonds);
        }

        return totalDiamonds;
    }

    public static void main(String[] args) {
        // Reading the input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // Number of bags
        int K = sc.nextInt(); // Number of minutes
        int[] bags = new int[N];

        for (int i = 0; i < N; i++) {
            bags[i] = sc.nextInt();
        }

        // Calculate and print the maximum diamonds that can be taken
        System.out.println(maxDiamonds(N, K, bags));
    }
}
