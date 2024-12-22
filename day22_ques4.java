import java.util.*;

public class day22_ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] freq = new int[10];
        for (int num : nums) {
            freq[num]++;
        }

        // Store numbers and frequencies in a list
        List<int[]> freqList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                freqList.add(new int[] { i, freq[i] });
            }
        }

        // Sort by frequency (descending), then value (descending)
        freqList.sort((a, b) -> {
            if (b[1] != a[1])
                return b[1] - a[1]; // Compare by frequency
            return b[0] - a[0]; // Compare by value
        });

        for (int i = 0; i < k; i++) {
            System.out.print(freqList.get(i)[0] + " ");
        }
    }
}
