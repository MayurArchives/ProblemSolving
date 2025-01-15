public import java.util.*;

public class day3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read size of the array
        int arr[] = new int[n];
        
        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int k = sc.nextInt(); // Element to search
        int left = 0;
        int right = n - 1;
        
        // Binary search logic
        while (left <= right) {
            int mid = (left + right) / 2;
            if (k == arr[mid]) {
                System.out.println(mid); // Print the index of the element
                break; // Exit the loop after finding the element
            } else if (k > arr[mid]) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
    }
}
 {
    
}
