import java.util.*;

public class day45 {
    public static int[] findNSR(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            // Remove all elements greater than or equal to arr[i]
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            // If stack is empty, no smaller element to the right
            result[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push the current element onto the stack
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Get the result
        int[] result = findNSR(arr);

        // Output the result
        for (int num : result) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
