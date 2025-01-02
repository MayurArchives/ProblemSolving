import java.util.*;

public class day29_ques12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of elements in the array
        int N = sc.nextInt();

        // Read the elements of the array
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // HashMap to count the frequency of each element
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // HashSet to track frequencies
        HashSet<Integer> freqSet = new HashSet<>();

        // Check if all frequencies are unique
        for (int count : freqMap.values()) {
            if (!freqSet.add(count)) {
                // If a frequency is already present, return false
                System.out.println("false");
                sc.close();
                return;
            }
        }

        // If all frequencies are unique
        System.out.println("true");

        sc.close();
    }
}
