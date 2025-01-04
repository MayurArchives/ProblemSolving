import java.util.PriorityQueue;
import java.util.Scanner;

public class day31_ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of ropes
        int n = sc.nextInt();
        int[] ropes = new int[n];

        // Read the lengths of the ropes
        for (int i = 0; i < n; i++) {
            ropes[i] = sc.nextInt();
        }

        // Min-Heap to store the rope lengths
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add all rope lengths to the heap
        for (int rope : ropes) {
            minHeap.add(rope);
        }

        int totalCost = 0;

        // While there are more than one rope in the heap
        while (minHeap.size() > 1) {
            // Remove the two smallest ropes
            int first = minHeap.poll();
            int second = minHeap.poll();

            // Calculate the cost to connect them
            int cost = first + second;
            totalCost += cost;

            // Add the new rope back to the heap
            minHeap.add(cost);
        }

        // Output the total cost
        System.out.println(totalCost);
    }
}
