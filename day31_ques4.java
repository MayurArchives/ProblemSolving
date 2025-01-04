import java.util.*;

public class day31_ques4 {

    public static int lastStoneWeight(int[] stones) {
        // Create a max-heap by using a priority queue with negative values
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add all stone weights to the max-heap
        for (int stone : stones) {
            maxHeap.add(stone);
        }

        // Keep smashing stones until at most one stone is left
        while (maxHeap.size() > 1) {
            int stone1 = maxHeap.poll(); // Heaviest stone
            int stone2 = maxHeap.poll(); // Second heaviest stone

            if (stone1 != stone2) {
                // If the stones are not the same weight, the difference is added back
                maxHeap.add(stone1 - stone2);
            }
        }

        // If there is one stone left, return its weight, otherwise return 0
        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }

    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of stones
        int[] stones = new int[n];

        for (int i = 0; i < n; i++) {
            stones[i] = sc.nextInt();
        }

        // Output the result
        System.out.println(lastStoneWeight(stones));
    }
}
