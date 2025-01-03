import java.util.*;

public class day30_ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        int n = sc.nextInt();

        // Input array elements
        int[] people = new int[n];
        for (int i = 0; i < n; i++) {
            people[i] = sc.nextInt();
        }

        // Input limit
        int limit = sc.nextInt();

        // Sort the array
        Arrays.sort(people);

        int i = 0, j = n - 1;
        int boats = 0;

        // Two-pointer approach
        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++; // Lightest person gets on the boat
            }
            j--; // Heaviest person always gets on the boat
            boats++; // Count the boat used
        }

        // Output the result
        System.out.println(boats);
    }
}
