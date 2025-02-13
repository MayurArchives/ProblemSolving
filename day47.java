import java.util.Scanner;

public class day47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Input the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the key to search for
        int key = scanner.nextInt();

        // Perform binary search to find the key
        int index = searchInRotatedArray(arr, n, key);
        System.out.println(index);

        scanner.close();
    }

    public static int searchInRotatedArray(int[] arr, int n, int key) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if the mid element is the key
            if (arr[mid] == key) {
                return mid;
            }

            // Determine which half is sorted
            if (arr[low] <= arr[mid]) {
                // Left half is sorted
                if (key >= arr[low] && key < arr[mid]) {
                    high = mid - 1; // Key lies in the left half
                } else {
                    low = mid + 1; // Key lies in the right half
                }
            } else {
                // Right half is sorted
                if (key > arr[mid] && key <= arr[high]) {
                    low = mid + 1; // Key lies in the right half
                } else {
                    high = mid - 1; // Key lies in the left half
                }
            }
        }

        // Key not found
        return -1;
    }
}
