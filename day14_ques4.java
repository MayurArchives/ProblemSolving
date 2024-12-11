import java.io.*;
import java.util.*;

public class day14_ques4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(arr);
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println(arr[left] + " " + arr[right]);
                left++;
                right--;
                while (left < right && arr[left] == arr[left - 1]) {
                    left++;
                }
                while (left < right && arr[right] == arr[right + 1]) {
                    right--;
                }

            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}
