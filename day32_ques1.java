import java.util.*;

public class day32_ques1 {

    static class Element {
        int value;
        int arrayIndex;
        int elementIndex;

        // Constructor to store the value, array index, and element index
        Element(int value, int arrayIndex, int elementIndex) {
            this.value = value;
            this.arrayIndex = arrayIndex;
            this.elementIndex = elementIndex;
        }
    }

    public static List<Integer> mergeKSortedArrays(List<List<Integer>> arrays) {
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Element> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.value));

        // Initialize the min heap with the first element of each array
        for (int i = 0; i < arrays.size(); i++) {
            List<Integer> array = arrays.get(i);
            if (!array.isEmpty()) {
                minHeap.add(new Element(array.get(0), i, 0)); // (value, array index, element index)
            }
        }

        // Extract the minimum element and add the next element from the same array
        while (!minHeap.isEmpty()) {
            Element min = minHeap.poll();
            result.add(min.value);

            // If there is another element in the same array, add it to the heap
            int nextIndex = min.elementIndex + 1;
            if (nextIndex < arrays.get(min.arrayIndex).size()) {
                minHeap.add(new Element(arrays.get(min.arrayIndex).get(nextIndex), min.arrayIndex, nextIndex));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of arrays (k)
        int k = sc.nextInt();
        List<List<Integer>> arrays = new ArrayList<>();

        // Read k arrays
        for (int i = 0; i < k; i++) {
            int n = sc.nextInt(); // Size of current array
            List<Integer> array = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                array.add(sc.nextInt()); // Elements of the current array
            }
            arrays.add(array);
        }

        // Merge the k sorted arrays and print the result
        List<Integer> result = mergeKSortedArrays(arrays);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
