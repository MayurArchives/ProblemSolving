import java.util.*;

public class day29_ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        // Use HashSet to store the union of both arrays
        Set<Integer> unionSet = new HashSet<>();

        // Add elements of array a to the set
        for (int i = 0; i < n; i++) {
            unionSet.add(a[i]);
        }

        // Add elements of array b to the set
        for (int i = 0; i < m; i++) {
            unionSet.add(b[i]);
        }

        // The size of the set is the number of distinct elements in the union
        System.out.println(unionSet.size());

        sc.close();
    }
}
