import java.util.*;

public class day29_ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of elements
        int n = sc.nextInt();

        // Array to store the elements
        int[] arr = new int[n];

        // Input the elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // HashSet to track unique elements
        Set<Integer> set = new HashSet<>();

        // Check for duplicates
        for (int i = 0; i < n; i++) {
            if (!set.add(arr[i])) {
                // If the element is already in the set, it's a duplicate
                System.out.println("true");
                sc.close();
                return;
            }
        }

        // If no duplicates were found
        System.out.println("false");
        sc.close();
    }
}
