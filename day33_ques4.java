import java.io.*;
import java.util.*;

public class day33_ques4 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        Map<Integer, Integer> hm = new HashMap<>();
        for (int i : arr) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        List<Integer> al = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();
            if (Math.abs(key) == val) {
                al.add(key);
            }
        }
        Collections.sort(al);

        for (int i : al) {
            System.out.println(i);
        }
    }
}