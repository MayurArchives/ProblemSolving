import java.util.PriorityQueue;

public class day32_ques4 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Input
        int n = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        int bricks = sc.nextInt();
        int ladders = sc.nextInt();

        // Output the result
        System.out.println(furthestBuilding(heights, bricks, ladders));
    }

    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < heights.length - 1; i++) {
            int climb = heights[i + 1] - heights[i];
            if (climb > 0) {
                minHeap.add(climb);
            }

            // If using ladders exceeds the allowed count
            if (minHeap.size() > ladders) {
                // Use bricks for the smallest climb
                bricks -= minHeap.poll();
            }

            // If bricks are negative, return the current index
            if (bricks < 0) {
                return i;
            }
        }

        return heights.length - 1; // Successfully reached the last building
    }
}
